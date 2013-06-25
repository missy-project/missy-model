package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import org.gesis.ddi.util.AbstractBaseEntity;
import org.gesis.rdf.LangString;

@Entity
public class ReferencePeriod extends AbstractBaseEntity
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
