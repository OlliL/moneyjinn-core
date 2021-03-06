//
// Copyright (c) 2015 Oliver Lehmann <lehmann@ans-netz.de>
// All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions
// are met:
// 1. Redistributions of source code must retain the above copyright
// notice, this list of conditions and the following disclaimer
// 2. Redistributions in binary form must reproduce the above copyright
// notice, this list of conditions and the following disclaimer in the
// documentation and/or other materials provided with the distribution.
//
// THIS SOFTWARE IS PROVIDED BY THE AUTHOR AND CONTRIBUTORS ``AS IS'' AND
// ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
// ARE DISCLAIMED. IN NO EVENT SHALL THE AUTHOR OR CONTRIBUTORS BE LIABLE
// FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
// DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
// OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
// HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
// LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
// OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
// SUCH DAMAGE.
//
//

package org.laladev.moneyjinn.core.rest.model.transport;

public class ImportedMonthlySettlementTransport extends MonthlySettlementTransport {
	private String externalid;
	private String accountNumberCapitalsource;
	private String bankCodeCapitalsource;

	public final String getExternalid() {
		return this.externalid;
	}

	public final void setExternalid(final String externalid) {
		this.externalid = externalid;
	}

	public final String getAccountNumberCapitalsource() {
		return this.accountNumberCapitalsource;
	}

	public final void setAccountNumberCapitalsource(final String accountNumberCapitalsource) {
		this.accountNumberCapitalsource = accountNumberCapitalsource;
	}

	public final String getBankCodeCapitalsource() {
		return this.bankCodeCapitalsource;
	}

	public final void setBankCodeCapitalsource(final String bankCodeCapitalsource) {
		this.bankCodeCapitalsource = bankCodeCapitalsource;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((this.accountNumberCapitalsource == null) ? 0 : this.accountNumberCapitalsource.hashCode());
		result = prime * result + ((this.bankCodeCapitalsource == null) ? 0 : this.bankCodeCapitalsource.hashCode());
		result = prime * result + ((this.externalid == null) ? 0 : this.externalid.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		final ImportedMonthlySettlementTransport other = (ImportedMonthlySettlementTransport) obj;
		if (this.accountNumberCapitalsource == null) {
			if (other.accountNumberCapitalsource != null) {
				return false;
			}
		} else if (!this.accountNumberCapitalsource.equals(other.accountNumberCapitalsource)) {
			return false;
		}
		if (this.bankCodeCapitalsource == null) {
			if (other.bankCodeCapitalsource != null) {
				return false;
			}
		} else if (!this.bankCodeCapitalsource.equals(other.bankCodeCapitalsource)) {
			return false;
		}
		if (this.externalid == null) {
			if (other.externalid != null) {
				return false;
			}
		} else if (!this.externalid.equals(other.externalid)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("ImportedMonthlySettlementTransport [externalid=");
		builder.append(this.externalid);
		builder.append(", accountNumberCapitalsource=");
		builder.append(this.accountNumberCapitalsource);
		builder.append(", bankCodeCapitalsource=");
		builder.append(this.bankCodeCapitalsource);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
