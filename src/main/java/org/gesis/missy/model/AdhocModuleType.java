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
public class AdhocModuleType {

	@Column
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private int id;

	@OneToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	private LangString adhocModuleType;

	public int getId() {
		return this.id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public LangString getAdhocModuleType()
	{
		return this.adhocModuleType;
	}

	public void setAdhocModuleType( final LangString adhocModuleType )
	{
		this.adhocModuleType = adhocModuleType;
	}

}
