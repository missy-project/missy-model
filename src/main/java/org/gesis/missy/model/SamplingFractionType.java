package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.gesis.rdf.LangString;

@Entity
public class SamplingFractionType {

	@Column
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE )
	private int id;

	@OneToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	private LangString samplingFaction;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LangString getSamplingFaction()
	{
		return samplingFaction;
	}

	public void setSamplingFaction( LangString samplingFaction )
	{
		this.samplingFaction = samplingFaction;
	}

}
