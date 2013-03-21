package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.gesis.rdf.LangString;

@Entity
public class ReferencePeriod {

	@Column
	@Id
	private int id;

	@ManyToOne
	private LangString referencePeriod;

	public ReferencePeriod() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LangString getReferencePeriod()
	{
		return referencePeriod;
	}

	public void setMessage( LangString referencePeriod )
	{
		this.referencePeriod = referencePeriod;
	}

}
