package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OfficialClassification {

	@Column
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE )
	private int id;

	@Column
	private String officialClassification;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOfficialClassification() {
		return officialClassification;
	}

	public void setOfficialClassification(String officialClassification) {
		this.officialClassification = officialClassification;
	}

}
