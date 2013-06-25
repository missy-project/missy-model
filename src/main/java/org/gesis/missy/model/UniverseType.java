package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.gesis.ddi.util.AbstractBaseEntity;

@Entity
public class UniverseType extends AbstractBaseEntity
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
