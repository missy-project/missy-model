package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity( name = "Missy_SummaryStatistics" )
public class SummaryStatistics extends org.gesis.discovery.SummaryStatistics
{

	// properties

	@Column
	private String country;

	// relations

	// getter / setter

	public String getCountry()
	{
		return country;
	}

	public void setCountry( final String country )
	{
		this.country = country;
	}

}
