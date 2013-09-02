package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Entity( name = "Missy_SummaryStatistics" )
public class SummaryStatistics extends org.gesis.discovery.SummaryStatistics
{

	// properties

	// relations
	
	@OneToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	private Country country;

	// getter / setter

	public Country getCountry()
	{
		return country;
	}

	public void setCountry( final Country country )
	{
		this.country = country;
	}

}
