package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.gesis.ddi.util.AbstractBaseEntity;

@Entity
public class OfficialClassification extends AbstractBaseEntity
{

	// properties

	@Column
	private String officialClassification;

	// getter / setter

	public String getOfficialClassification()
	{
		return this.officialClassification;
	}

	public void setOfficialClassification( final String officialClassification )
	{
		this.officialClassification = officialClassification;
	}

}
