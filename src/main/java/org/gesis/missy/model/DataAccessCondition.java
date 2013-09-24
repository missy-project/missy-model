package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.gesis.persistence.PersistableResource;

/**
 * @author matthaeus
 * 
 */
@Entity( name = "DataAccessCondition" )
public class DataAccessCondition extends PersistableResource
{

	@Column
	private String accessConditions;

	@Column
	private String accessForm;

	@Column
	private String accessContact;

	public String getAccessConditions()
	{
		return accessConditions;
	}

	public void setAccessConditions( final String accessConditions )
	{
		this.accessConditions = accessConditions;
	}

	public String getAccessForm()
	{
		return accessForm;
	}

	public void setAccessForm( final String accessForm )
	{
		this.accessForm = accessForm;
	}

	public String getAccessContact()
	{
		return accessContact;
	}

	public void setAccessContact( final String accessContact )
	{
		this.accessContact = accessContact;
	}

}
