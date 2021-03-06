package org.laladev.moneyjinn.core.rest.model.user;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "showCreateUserResponse")
public class ShowCreateUserResponse extends AbstractCreateUserResponse {

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("ShowCreateUserResponse [getGroupTransports()=");
		builder.append(this.getGroupTransports());
		builder.append(", getResult()=");
		builder.append(this.getResult());
		builder.append(", getValidationItemTransports()=");
		builder.append(this.getValidationItemTransports());
		builder.append("]");
		return builder.toString();
	}
}
