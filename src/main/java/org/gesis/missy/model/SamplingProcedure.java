package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.gesis.persistence.PersistableResource;

/**
 * @author matthaeus
 * 
 */
@Entity( name = "Missy_SamplingProcedure" )
public class SamplingProcedure extends PersistableResource
{

	// properties

	@Column
	private boolean participationMandatory;

	@Column
	private String sourceOfSamplingFrame;

	@Column
	private String samplingDesign;

	@Column
	private String primarySamplingUnits;

	@Column
	private String secondarySamplingUnits;

	@Column
	private String stratificationCriteria;

	@Column
	private String samplingMethod;

	// getter / setter

	public boolean isParticipationMandatory()
	{
		return participationMandatory;
	}

	public void setParticipationMandatory( final boolean participationMandatory )
	{
		this.participationMandatory = participationMandatory;
	}

	public String getSourceOfSamplingFrame()
	{
		return sourceOfSamplingFrame;
	}

	public void setSourceOfSamplingFrame( final String sourceOfSamplingFrame )
	{
		this.sourceOfSamplingFrame = sourceOfSamplingFrame;
	}

	public String getSamplingDesign()
	{
		return samplingDesign;
	}

	public void setSamplingDesign( final String samplingDesign )
	{
		this.samplingDesign = samplingDesign;
	}

	public String getPrimarySamplingUnits()
	{
		return primarySamplingUnits;
	}

	public void setPrimarySamplingUnits( final String primarySamplingUnits )
	{
		this.primarySamplingUnits = primarySamplingUnits;
	}

	public String getSecondarySamplingUnits()
	{
		return secondarySamplingUnits;
	}

	public void setSecondarySamplingUnits( final String secondarySamplingUnits )
	{
		this.secondarySamplingUnits = secondarySamplingUnits;
	}

	public String getStratificationCriteria()
	{
		return stratificationCriteria;
	}

	public void setStratificationCriteria( final String stratificationCriteria )
	{
		this.stratificationCriteria = stratificationCriteria;
	}

	public String getSamplingMethod()
	{
		return samplingMethod;
	}

	public void setSamplingMethod( final String samplingMethod )
	{
		this.samplingMethod = samplingMethod;
	}

}
