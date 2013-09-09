package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Entity( name = "Missy_SummaryStatistics" )
public class SummaryStatistics extends org.gesis.discovery.SummaryStatistics
{

	// properties

	@Column
	private int numberOfCasesValidOnly = -1;

	@Column
	private int numberOfCasesMissingOnly = -1;

	@Column
	private int numberOfCasesTotal = -1;

	@Column
	private float percentage = -1;

	@Column
	private float percentageMissingOnly = -1;

	@Column
	private float percentageTotal = -1;

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

	public int getNumberOfCasesValidOnly()
	{
		return numberOfCasesValidOnly;
	}

	public void setNumberOfCasesValidOnly( int numberOfCasesValidOnly )
	{
		this.numberOfCasesValidOnly = numberOfCasesValidOnly;
	}

	public int getNumberOfCasesMissingOnly()
	{
		return numberOfCasesMissingOnly;
	}

	public void setNumberOfCasesMissingOnly( int numberOfCasesMissingOnly )
	{
		this.numberOfCasesMissingOnly = numberOfCasesMissingOnly;
	}

	public int getNumberOfCasesTotal()
	{
		return numberOfCasesTotal;
	}

	public void setNumberOfCasesTotal( int numberOfCasesTotal )
	{
		this.numberOfCasesTotal = numberOfCasesTotal;
	}

	public float getPercentageMissingOnly()
	{
		return percentageMissingOnly;
	}

	public void setPercentageMissingOnly( float percentageMissingOnly )
	{
		this.percentageMissingOnly = percentageMissingOnly;
	}

	public float getPercentageTotal()
	{
		return percentageTotal;
	}

	public void setPercentageTotal( float percentageTotal )
	{
		this.percentageTotal = percentageTotal;
	}
}
