package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity( name = "MConcept" )
public class Concept extends org.gesis.skos.Concept
{

	// properties

	@Column( name = "order_" )
	private int order;

	// getter/setter

	public Concept( String agencyId, String objectId, int majorVersion )
	{
		super( agencyId, objectId, majorVersion );
	}

	public int getOrder()
	{
		return order;
	}

	public void setOrder(int order)
	{
		this.order = order;
	}

}
