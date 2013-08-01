package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity( name = "Missy_SummaryStatistics" )
public class SummaryStatistics extends org.gesis.discovery.SummaryStatistics
{

	// properties

	@Column
	private String country;

	// relations
	
	@Enumerated( EnumType.STRING )
	@Column
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
