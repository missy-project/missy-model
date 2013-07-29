package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import org.gesis.persistence.PersistableResource;
import org.gesis.rdf.LangString;

@Entity( name = "Missy_ComputationBaseType" )
public class ComputationBaseType extends PersistableResource
{

	// properties

	@Column
	private String computationBaseType;

	// relations

	@OneToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	private LangString description;

	// getter / setter

	public LangString getDescription()
	{
		return description;
	}

	public String getComputationBaseType()
	{
		return computationBaseType;
	}

	public void setComputationBaseType( final String computationBaseType )
	{
		this.computationBaseType = computationBaseType;
	}

	public void setDescription( final LangString description )
	{
		this.description = description;
	}

}
