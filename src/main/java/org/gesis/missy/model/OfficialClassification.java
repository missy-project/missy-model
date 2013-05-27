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
	@GeneratedValue( strategy = GenerationType.AUTO )
	private int id;

	@Column
	private String officialClassification;

	public int getId() {
		return this.id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getOfficialClassification() {
		return this.officialClassification;
	}

	public void setOfficialClassification(final String officialClassification) {
		this.officialClassification = officialClassification;
	}

}
