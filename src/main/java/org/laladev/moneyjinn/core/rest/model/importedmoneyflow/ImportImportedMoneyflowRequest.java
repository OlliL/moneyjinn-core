//
// Copyright (c) 2015 Oliver Lehmann <oliver@laladev.org>
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
// $Id: CreateImportedMoneyflowRequest.java,v 1.1 2015/02/08 00:26:04 olivleh1 Exp $
//
package org.laladev.moneyjinn.core.rest.model.importedmoneyflow;

import java.util.List;

import org.laladev.moneyjinn.core.rest.model.AbstractRequest;
import org.laladev.moneyjinn.core.rest.model.transport.ImportedMoneyflowTransport;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("importImportedMoneyflowRequest")
public class ImportImportedMoneyflowRequest extends AbstractRequest {
	@JsonProperty("importedMoneyflowTransport")
	private List<ImportedMoneyflowTransport> importedMoneyflowTransports;

	public final List<ImportedMoneyflowTransport> getImportedMoneyflowTransports() {
		return this.importedMoneyflowTransports;
	}

	public final void setImportedMoneyflowTransports(
			final List<ImportedMoneyflowTransport> importedMoneyflowTransports) {
		this.importedMoneyflowTransports = importedMoneyflowTransports;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((this.importedMoneyflowTransports == null) ? 0 : this.importedMoneyflowTransports.hashCode());
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
		final ImportImportedMoneyflowRequest other = (ImportImportedMoneyflowRequest) obj;
		if (this.importedMoneyflowTransports == null) {
			if (other.importedMoneyflowTransports != null) {
				return false;
			}
		} else if (!this.importedMoneyflowTransports.equals(other.importedMoneyflowTransports)) {
			return false;
		}
		return true;
	}

}