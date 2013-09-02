package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity( name = "Missy_CategoryStatistics" )
public class CategoryStatistics extends org.gesis.discovery.CategoryStatistics
{
	// properties

	@Column
	private float validPercentage;

	@Column
	private float totalPercentage;

	// relations

	@ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	@JoinColumn( name = "country_id" )
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

	public float getValidPercentage()
	{
		return validPercentage;
	}

	public void setValidPercentage( final float validPercentage )
	{
		this.validPercentage = validPercentage;
	}

	public float getTotalPercentage()
	{
		return totalPercentage;
	}

	public void setTotalPercentage( final float totalPercentage )
	{
		this.totalPercentage = totalPercentage;
	}

}
