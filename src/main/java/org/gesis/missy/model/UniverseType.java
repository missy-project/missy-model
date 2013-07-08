package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.gesis.persistence.PersistableResource;

@Entity( name = "Missy_UniverseType" )
public class UniverseType extends PersistableResource
{

	@Column
	private String universeType;

	public String getUniverseType()
	{
		return this.universeType;
	}

	public void setUniverseType( final String universeType )
	{
		this.universeType = universeType;
	}

}
