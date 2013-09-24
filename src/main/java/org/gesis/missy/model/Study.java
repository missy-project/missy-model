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

	// getter / setter

	public String getNote()
	{
		return note;
	}

	public void setNote( final String note )
	{
		this.note = note;
	}

}
