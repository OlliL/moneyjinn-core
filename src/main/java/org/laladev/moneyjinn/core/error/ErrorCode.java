package org.laladev.moneyjinn.core.error;

//Copyright (c) 2015 Oliver Lehmann <oliver@laladev.org>
//All rights reserved.
//
//Redistribution and use in source and binary forms, with or without
//modification, are permitted provided that the following conditions
//are met:
//1. Redistributions of source code must retain the above copyright
//notice, this list of conditions and the following disclaimer
//2. Redistributions in binary form must reproduce the above copyright
//notice, this list of conditions and the following disclaimer in the
//documentation and/or other materials provided with the distribution.
//
//THIS SOFTWARE IS PROVIDED BY THE AUTHOR AND CONTRIBUTORS ``AS IS'' AND
//ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
//IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
//ARE DISCLAIMED. IN NO EVENT SHALL THE AUTHOR OR CONTRIBUTORS BE LIABLE
//FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
//DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
//OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
//HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
//LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
//OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
//SUCH DAMAGE.

public enum ErrorCode {
	MAPPER_UNDEFINED(-1),
	UNKNOWN(0),
	CAPITALSOURCE_STILL_REFERENCED(120),
	CAPITALSOURCE_IN_USE_PERIOD(121),
	CAPITALSOURCE_USE_OUT_OF_VALIDITY(122),
	CONTRACTPARTNER_IN_USE(124),
	CAPITALSOURCE_IS_NOT_SET(127),
	CONTRACTPARTNER_IS_NOT_SET(128),
	INVOICEDATE_IN_WRONG_FORMAT(129),
	BOOKINGDATE_IN_WRONG_FORMAT(130),
	COMMENT_IS_NOT_SET(131),
	AMOUNT_IN_WRONG_FORMAT(132),
	NOTHING_MARKED_TO_ADD(133),
	USERNAME_PASSWORD_WRONG(134),
	PASSWORD_NOT_MATCHING(137),
	ACCOUNT_IS_LOCKED(138),
	USERNAME_IS_MANDATORY(139),
	PASSWORD_EMPTY(140),
	NO_SEARCH_CRITERIA_ENTERED(141),
	NO_GROUPING_CRITERIA_GIVEN(142),
	NO_DATA_FOUND(143),
	DATE_FORMAT_NOT_CORRECT(147),
	USER_HAS_DATA(151),
	PASSWORD_MUST_BE_CHANGED(152),
	MONTHLY_SETTLEMENT_ALREADY_EXISTS(154),
	INVALID_DATE_FORMAT_CHOOSEN(180),
	FILEUPLOAD_FAILED(191),
	WRONG_FILE_FORMAT(199),
	AMOUNT_IS_ZERO(200),
	NAME_ALREADY_EXISTS(203),
	ATTENTION(204),
	GROUP_IN_USE(211),
	NAME_MUST_NOT_BE_EMPTY(218),
	ACCOUNT_NUMBER_TO_LONG(227),
	BANK_CODE_TO_LONG(228),
	VALIDFROM_AFTER_VALIDTIL(229),
	LOGGED_OUT(231),
	POSTCODE_MUST_BE_A_NUMBER(233),
	POSTING_ACCOUNT_NOT_SPECIFIED(234),
	CAPITALSOURCE_DOES_NOT_EXIST(19),
	CONTRACTPARTNER_DOES_NOT_EXIST(2),
	CONTRACTPARTNER_NO_LONGER_VALID(235),
	MONEYFLOWS_OUTSIDE_VALIDITY_PERIOD(236),
	GROUP_WITH_SAME_NAME_ALREADY_EXISTS(237),
	VALIDFROM_NOT_DEFINED(238),
	VALIDTIL_NOT_DEFINED(239),
	USER_WITH_SAME_NAME_ALREADY_EXISTS(240),
	USER_IS_NO_ADMIN(241),
	GROUP_MUST_BE_SPECIFIED(243),
	VALIDFROM_EARLIER_THAN_TOMORROW(244),
	CLIENT_CLOCK_OFF(245),
	BOOKINGDATE_OUTSIDE_GROUP_ASSIGNMENT(246),
	POSTINGACCOUNT_STILL_REFERENCED(249),
	POSTINGACCOUNT_WITH_SAME_NAME_ALREADY_EXISTS(250),
	ACCOUNT_NUMBER_CONTAINS_ILLEGAL_CHARS_OR_IS_EMPTY(274),
	BANK_CODE_CONTAINS_ILLEGAL_CHARS_OR_IS_EMPTY(275),
	ACCOUNT_NUMBER_CONTAINS_ILLEGAL_CHARS(276),
	BANK_CODE_CONTAINS_ILLEGAL_CHARS(277),
	CAPITALSOURCE_IMPORT_NOT_ALLOWED(283),
	CAPITALSOURCE_NOT_FOUND(284),
	ACCOUNT_ALREADY_ASSIGNED_TO_OTHER_PARTNER(286),
	USERNAME_MUST_NOT_CONTAIN_SLASHES(291),
	PASSWORD_MUST_NOT_CONTAIN_SLASHES(292);

	private int code;

	ErrorCode(final int errorCode) {
		this.code = errorCode;
	}

	public int getErrorCode() {
		return this.code;
	}

	public static ErrorCode byId(final int code) {
		for (final ErrorCode errorCodeEnum : ErrorCode.values()) {
			if (errorCodeEnum.getErrorCode() == code) {
				return errorCodeEnum;
			}
		}
		return ErrorCode.UNKNOWN;
	}
}
