package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import org.gesis.persistence.PersistableResource;
import org.gesis.rdf.LangString;

@Entity
public class AdhocModuleType extends PersistableResource
{
	// relations

	@OneToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	private LangString adhocModuleType;

	// getter / setter

	public LangString getAdhocModuleType()
	{
		return this.adhocModuleType;
	}

	public void setAdhocModuleType( final LangString adhocModuleType )
	{
		this.adhocModuleType = adhocModuleType;
	}

}
