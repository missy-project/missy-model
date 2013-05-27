package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UniverseType {

	@Column
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private int id;

	@Column
	private String universeType;

	public int getId() {
		return this.id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getUniverseType() {
		return this.universeType;
	}

	public void setUniverseType(final String universeType) {
		this.universeType = universeType;
	}

}
