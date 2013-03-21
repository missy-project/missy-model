package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.gesis.rdf.LangString;

@Entity
public class AdhocModuleType {

	@Column
	@Id
	private int id;

	@OneToOne
	private LangString adhocModuleType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LangString getAdhocModuleType()
	{
		return adhocModuleType;
	}

	public void setAdhocModuleType( LangString adhocModuleType )
	{
		this.adhocModuleType = adhocModuleType;
	}

}
