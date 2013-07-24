package org.gesis.missy.model;

import javax.persistence.Entity;

@Entity( name = "Missy_Concept" )
public class Concept extends org.gesis.skos.Concept
{

	// properties

	private int position;

	// relations

	// getter / setter

	public int getPosition()
	{
		return position;
	}

	public void setPosition( final int position )
	{
		this.position = position;
	}

}
