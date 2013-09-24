package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.gesis.persistence.PersistableResource;

/**
 * @author matthaeus
 * 
 */
@Entity( name = "Missy_ModeOfCollection" )
public class ModeOfCollection extends PersistableResource
{

	// properties

	@Column( length = 64 )
	private String typeOfDataSource;

	@Column
	private float interviewModePapi;

	@Column
	private float interviewModeCapi;

	@Column
	private float interviewModeCati;

	@Column
	private float interviewModeSelfAdministered;

	@Column
	private float interviewModeWebSurvey;

	@Column
	private float percentageOfProxyInterviews;

	// getter / setter

	public String getTypeOfDataSource()
	{
		return typeOfDataSource;
	}

	public void setTypeOfDataSource( final String typeOfDataSource )
	{
		this.typeOfDataSource = typeOfDataSource;
	}

	public float getInterviewModePapi()
	{
		return interviewModePapi;
	}

	public void setInterviewModePapi( final float interviewModePapi )
	{
		this.interviewModePapi = interviewModePapi;
	}

	public float getInterviewModeCapi()
	{
		return interviewModeCapi;
	}

	public void setInterviewModeCapi( final float interviewModeCapi )
	{
		this.interviewModeCapi = interviewModeCapi;
	}

	public float getInterviewModeCati()
	{
		return interviewModeCati;
	}

	public void setInterviewModeCati( final float interviewModeCati )
	{
		this.interviewModeCati = interviewModeCati;
	}

	public float getInterviewModeSelfAdministered()
	{
		return interviewModeSelfAdministered;
	}

	public void setInterviewModeSelfAdministered( final float interviewModeSelfAdministered )
	{
		this.interviewModeSelfAdministered = interviewModeSelfAdministered;
	}

	public float getInterviewModeWebSurvey()
	{
		return interviewModeWebSurvey;
	}

	public void setInterviewModeWebSurvey( final float interviewModeWebSurvey )
	{
		this.interviewModeWebSurvey = interviewModeWebSurvey;
	}

	public float getPercentageOfProxyInterviews()
	{
		return percentageOfProxyInterviews;
	}

	public void setPercentageOfProxyInterviews( final float percentageOfProxyInterviews )
	{
		this.percentageOfProxyInterviews = percentageOfProxyInterviews;
	}

}
