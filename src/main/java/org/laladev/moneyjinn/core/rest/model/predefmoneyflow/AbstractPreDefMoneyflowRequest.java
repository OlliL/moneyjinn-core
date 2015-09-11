package org.laladev.moneyjinn.core.rest.model.predefmoneyflow;

import org.laladev.moneyjinn.core.rest.model.AbstractRequest;
import org.laladev.moneyjinn.core.rest.model.transport.PreDefMoneyflowTransport;

//
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
//

public abstract class AbstractPreDefMoneyflowRequest extends AbstractRequest {
	private PreDefMoneyflowTransport preDefMoneyflowTransport;

	public final PreDefMoneyflowTransport getPreDefMoneyflowTransport() {
		return this.preDefMoneyflowTransport;
	}

	public final void setPreDefMoneyflowTransport(final PreDefMoneyflowTransport preDefMoneyflowTransport) {
		this.preDefMoneyflowTransport = preDefMoneyflowTransport;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((this.preDefMoneyflowTransport == null) ? 0 : this.preDefMoneyflowTransport.hashCode());
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
		final AbstractPreDefMoneyflowRequest other = (AbstractPreDefMoneyflowRequest) obj;
		if (this.preDefMoneyflowTransport == null) {
			if (other.preDefMoneyflowTransport != null) {
				return false;
			}
		} else if (!this.preDefMoneyflowTransport.equals(other.preDefMoneyflowTransport)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("AbstractPreDefMoneyflowRequest [preDefMoneyflowTransport=");
		builder.append(this.preDefMoneyflowTransport);
		builder.append("]");
		return builder.toString();
	}

}