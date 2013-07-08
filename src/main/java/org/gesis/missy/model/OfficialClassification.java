package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.gesis.persistence.PersistableResource;

@Entity( name = "Missy_OfficialClassification" )
public class OfficialClassification extends PersistableResource
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
