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
	@GeneratedValue( strategy = GenerationType.SEQUENCE )
	private int id;

	@Column
	private String universeType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUniverseType() {
		return universeType;
	}

	public void setUniverseType(String universeType) {
		this.universeType = universeType;
	}

}
