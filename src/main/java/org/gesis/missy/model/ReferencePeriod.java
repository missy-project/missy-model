package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.gesis.rdf.LangString;

@Entity
public class ReferencePeriod {

	@Column
	@Id
	private int id;

	@OneToOne
	private LangString referencePeriod;

	public ReferencePeriod() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public LangString getReferencePeriod()
	{
		return this.referencePeriod;
	}

	public void setMessage( final LangString referencePeriod )
	{
		this.referencePeriod = referencePeriod;
	}

}
