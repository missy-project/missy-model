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

	private Concept()
	{
		super( null, null, 0 );
	}

	public Concept( final String agencyId, final String objectId, final int majorVersion )
	{
		super( agencyId, objectId, majorVersion );
	}

	public int getOrder()
	{
		return this.order;
	}

	public void setOrder(final int order)
	{
		this.order = order;
	}

}
