//
// Copyright (c) 2021 Oliver Lehmann <lehmann@ans-netz.de>
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

package org.laladev.moneyjinn.core.rest.model.etf.transport;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class EtfFlowTransport {

	private Long etfflowid;
	private String isin;
	private Timestamp timestamp;
	private Integer nanoseconds;
	private BigDecimal amount;
	private BigDecimal price;

	public final Long getEtfflowid() {
		return this.etfflowid;
	}

	public final void setEtfflowid(final Long etfflowid) {
		this.etfflowid = etfflowid;
	}

	public final String getIsin() {
		return this.isin;
	}

	public final void setIsin(final String isin) {
		this.isin = isin;
	}

	public final BigDecimal getAmount() {
		return this.amount;
	}

	public final void setAmount(final BigDecimal amount) {
		this.amount = amount;
	}

	public final BigDecimal getPrice() {
		return this.price;
	}

	public final void setPrice(final BigDecimal price) {
		this.price = price;
	}

	public final Timestamp getTimestamp() {
		return this.timestamp;
	}

	public final void setTimestamp(final Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public final Integer getNanoseconds() {
		return this.nanoseconds;
	}

	public final void setNanoseconds(final Integer nanoseconds) {
		this.nanoseconds = nanoseconds;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.amount == null) ? 0 : this.amount.hashCode());
		result = prime * result + ((this.etfflowid == null) ? 0 : this.etfflowid.hashCode());
		result = prime * result + ((this.isin == null) ? 0 : this.isin.hashCode());
		result = prime * result + ((this.nanoseconds == null) ? 0 : this.nanoseconds.hashCode());
		result = prime * result + ((this.price == null) ? 0 : this.price.hashCode());
		result = prime * result + ((this.timestamp == null) ? 0 : this.timestamp.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		final EtfFlowTransport other = (EtfFlowTransport) obj;
		if (this.amount == null) {
			if (other.amount != null) {
				return false;
			}
		} else if (!this.amount.equals(other.amount)) {
			return false;
		}
		if (this.etfflowid == null) {
			if (other.etfflowid != null) {
				return false;
			}
		} else if (!this.etfflowid.equals(other.etfflowid)) {
			return false;
		}
		if (this.isin == null) {
			if (other.isin != null) {
				return false;
			}
		} else if (!this.isin.equals(other.isin)) {
			return false;
		}
		if (this.nanoseconds == null) {
			if (other.nanoseconds != null) {
				return false;
			}
		} else if (!this.nanoseconds.equals(other.nanoseconds)) {
			return false;
		}
		if (this.price == null) {
			if (other.price != null) {
				return false;
			}
		} else if (!this.price.equals(other.price)) {
			return false;
		}
		if (this.timestamp == null) {
			if (other.timestamp != null) {
				return false;
			}
		} else if (!this.timestamp.equals(other.timestamp)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("EtfFlowTransport [etfflowid=");
		builder.append(this.etfflowid);
		builder.append(", isin=");
		builder.append(this.isin);
		builder.append(", timestamp=");
		builder.append(this.timestamp);
		builder.append(", nanoseconds=");
		builder.append(this.nanoseconds);
		builder.append(", amount=");
		builder.append(this.amount);
		builder.append(", price=");
		builder.append(this.price);
		builder.append("]");
		return builder.toString();
	}

}
