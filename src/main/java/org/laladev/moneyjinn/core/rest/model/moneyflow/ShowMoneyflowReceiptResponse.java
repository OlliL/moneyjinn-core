//
// Copyright (c) 2017 Oliver Lehmann <lehmann@ans-netz.de>
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

package org.laladev.moneyjinn.core.rest.model.moneyflow;

import org.laladev.moneyjinn.core.rest.model.AbstractResponse;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "showMoneyflowReceiptResponse")
public class ShowMoneyflowReceiptResponse extends AbstractResponse {
	private String receipt;
	private Short receiptType;

	public final String getReceipt() {
		return this.receipt;
	}

	public final void setReceipt(final String receipt) {
		this.receipt = receipt;
	}

	public final Short getReceiptType() {
		return this.receiptType;
	}

	public final void setReceiptType(final Short receiptType) {
		this.receiptType = receiptType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.receipt == null) ? 0 : this.receipt.hashCode());
		result = prime * result + ((this.receiptType == null) ? 0 : this.receiptType.hashCode());
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
		final ShowMoneyflowReceiptResponse other = (ShowMoneyflowReceiptResponse) obj;
		if (this.receipt == null) {
			if (other.receipt != null) {
				return false;
			}
		} else if (!this.receipt.equals(other.receipt)) {
			return false;
		}
		if (this.receiptType == null) {
			if (other.receiptType != null) {
				return false;
			}
		} else if (!this.receiptType.equals(other.receiptType)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("ShowMoneyflowReceiptResponse [receipt=");
		builder.append(this.receipt);
		builder.append(", receiptType=");
		builder.append(this.receiptType);
		builder.append("]");
		return builder.toString();
	}

}
