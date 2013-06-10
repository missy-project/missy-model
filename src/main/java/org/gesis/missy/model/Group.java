package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.gesis.ddi.util.AbstractBaseEntity;

@Entity
public class Group extends AbstractBaseEntity{

	// properties

	@Column
	private int groupId;

	@Column
	private String groupName;

	@Column
	private String groupDesc;

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupDesc() {
		return groupDesc;
	}

	public void setGroupDesc(String groupDesc) {
		this.groupDesc = groupDesc;
	}
}
