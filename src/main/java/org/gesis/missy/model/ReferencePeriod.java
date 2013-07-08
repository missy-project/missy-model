package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import org.gesis.persistence.PersistableResource;
import org.gesis.rdf.LangString;

@Entity( name = "Missy_ReferencePeriod" )
public class ReferencePeriod extends PersistableResource
{

	// relations

	@OneToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	private LangString referencePeriod;

	// getter / setter

	public LangString getReferencePeriod()
	{
		return this.referencePeriod;
	}

	public void setReferencePeriod( final LangString referencePeriod )
	{
		this.referencePeriod = referencePeriod;
	}

}
