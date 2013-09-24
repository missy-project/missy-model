package org.gesis.missy.model;

import javax.persistence.Entity;
import javax.persistence.Lob;

/**
 * @author matthaeus
 * 
 */
@Entity( name = "Missy_Study" )
public class Study extends org.gesis.discovery.Study
{

	// properties

	@Lob
	private String note;

	@Lob
	private String citation;

	// getter / setter

	public String getNote()
	{
		return note;
	}

	public void setNote( final String note )
	{
		this.note = note;
	}

	public String getCitation()
	{
		return citation;
	}

	public void setCitation( final String citation )
	{
		this.citation = citation;
	}

}
