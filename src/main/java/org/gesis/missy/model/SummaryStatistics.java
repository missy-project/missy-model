package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity( name = "Missy_SummaryStatistics" )
public class SummaryStatistics extends org.gesis.discovery.SummaryStatistics
{

	// properties

	@Column
	private String country;

	// relations
	
	@ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	@JoinColumn( name = "computationBaseType_id" )
	private ComputationBaseType computationBaseType;

	// getter / setter

	public String getCountry()
	{
		return country;
	}

	public void setCountry( final String country )
	{
		this.country = country;
	}

	public ComputationBaseType getComputationBaseType()
	{
		return computationBaseType;
	}

	public void setComputationBaseType( final ComputationBaseType computationBaseType )
	{
		this.computationBaseType = computationBaseType;
	}

}
