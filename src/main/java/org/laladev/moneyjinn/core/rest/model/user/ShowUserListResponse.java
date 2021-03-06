package org.laladev.moneyjinn.core.rest.model.user;

import java.util.List;
import java.util.Set;

import org.laladev.moneyjinn.core.rest.model.AbstractResponse;
import org.laladev.moneyjinn.core.rest.model.transport.GroupTransport;
import org.laladev.moneyjinn.core.rest.model.transport.UserTransport;
import org.laladev.moneyjinn.core.rest.model.user.transport.AccessRelationTransport;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "showUserListResponse")
public class ShowUserListResponse extends AbstractResponse {
	private Set<Character> initials;
	@XmlElement(name = "userTransport")
	private List<UserTransport> userTransports;
	@XmlElement(name = "groupTransport")
	private List<GroupTransport> groupTransports;
	@XmlElement(name = "accessRelationTransport")
	private List<AccessRelationTransport> accessRelationTransports;

	public final Set<Character> getInitials() {
		return this.initials;
	}

	public final void setInitials(final Set<Character> initials) {
		this.initials = initials;
	}

	public final List<UserTransport> getUserTransports() {
		return this.userTransports;
	}

	public final void setUserTransports(final List<UserTransport> userTransports) {
		this.userTransports = userTransports;
	}

	public final List<GroupTransport> getGroupTransports() {
		return this.groupTransports;
	}

	public final void setGroupTransports(final List<GroupTransport> groupTransports) {
		this.groupTransports = groupTransports;
	}

	public final List<AccessRelationTransport> getAccessRelationTransports() {
		return this.accessRelationTransports;
	}

	public final void setAccessRelationTransports(final List<AccessRelationTransport> accessRelationTransports) {
		this.accessRelationTransports = accessRelationTransports;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((this.accessRelationTransports == null) ? 0 : this.accessRelationTransports.hashCode());
		result = prime * result + ((this.groupTransports == null) ? 0 : this.groupTransports.hashCode());
		result = prime * result + ((this.initials == null) ? 0 : this.initials.hashCode());
		result = prime * result + ((this.userTransports == null) ? 0 : this.userTransports.hashCode());
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
		final ShowUserListResponse other = (ShowUserListResponse) obj;
		if (this.accessRelationTransports == null) {
			if (other.accessRelationTransports != null) {
				return false;
			}
		} else if (!this.accessRelationTransports.equals(other.accessRelationTransports)) {
			return false;
		}
		if (this.groupTransports == null) {
			if (other.groupTransports != null) {
				return false;
			}
		} else if (!this.groupTransports.equals(other.groupTransports)) {
			return false;
		}
		if (this.initials == null) {
			if (other.initials != null) {
				return false;
			}
		} else if (!this.initials.equals(other.initials)) {
			return false;
		}
		if (this.userTransports == null) {
			if (other.userTransports != null) {
				return false;
			}
		} else if (!this.userTransports.equals(other.userTransports)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("ShowUserListResponse [initials=");
		builder.append(this.initials);
		builder.append(", userTransports=");
		builder.append(this.userTransports);
		builder.append(", groupTransports=");
		builder.append(this.groupTransports);
		builder.append(", accessRelationTransports=");
		builder.append(this.accessRelationTransports);
		builder.append("]");
		return builder.toString();
	}

}
