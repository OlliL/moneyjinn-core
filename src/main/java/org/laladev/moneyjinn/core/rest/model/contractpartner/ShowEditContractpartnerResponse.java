package org.laladev.moneyjinn.core.rest.model.contractpartner;

import java.util.List;

import org.laladev.moneyjinn.core.rest.model.transport.PostingAccountTransport;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("showEditContractpartnerResponse")
public class ShowEditContractpartnerResponse extends AbstractContractpartnerResponse {
	@JsonProperty("postingAccountTransport")
	private List<PostingAccountTransport> postingAccountTransports;

	public final List<PostingAccountTransport> getPostingAccountTransports() {
		return this.postingAccountTransports;
	}

	public final void setPostingAccountTransports(final List<PostingAccountTransport> postingAccountTransports) {
		this.postingAccountTransports = postingAccountTransports;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((this.postingAccountTransports == null) ? 0 : this.postingAccountTransports.hashCode());
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
		final ShowEditContractpartnerResponse other = (ShowEditContractpartnerResponse) obj;
		if (this.postingAccountTransports == null) {
			if (other.postingAccountTransports != null) {
				return false;
			}
		} else if (!this.postingAccountTransports.equals(other.postingAccountTransports)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("ShowEditContractpartnerResponse [postingAccountTransports=");
		builder.append(this.postingAccountTransports);
		builder.append(", getContractpartnerTransport()=");
		builder.append(this.getContractpartnerTransport());
		builder.append("]");
		return builder.toString();
	}

}
