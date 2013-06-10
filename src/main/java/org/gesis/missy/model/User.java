package org.gesis.missy.model;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.gesis.ddi.util.AbstractBaseEntity;

@Entity
public class User extends AbstractBaseEntity{

	// properties

	@Column
	private int userId;

	@Column
	private String userName;

	@Column
	private String userOccupation;

	@ManyToMany
	private Set<Group> group;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserOccupation() {
		return userOccupation;
	}

	public void setUserOccupation(String userOccupation) {
		this.userOccupation = userOccupation;
	}

	public Set<Group> getGroup() {
		return group;
	}

	public void setGroup(Set<Group> group) {
		this.group = group;
	}
	
	public User addGroup( final Group newGroup )
	{
		if ( this.group == null )
			this.group = new LinkedHashSet<Group>();

		this.group.add( newGroup );

		return this;
	}
	
	
}
