package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import org.gesis.persistence.PersistableResource;
import org.gesis.rdf.LangString;

@Entity( name = "Missy_SamplingFractionType" )
public class SamplingFractionType extends PersistableResource
{

	// relations

	@OneToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	private LangString samplingFaction;

	// getter / setter

	public LangString getSamplingFaction()
	{
		return this.samplingFaction;
	}

	public void setSamplingFaction( final LangString samplingFaction )
	{
		this.samplingFaction = samplingFaction;
	}

}
