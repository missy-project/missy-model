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

	public int getOrder()
	{
		return this.order;
	}

	public void setOrder(final int order)
	{
		this.order = order;
	}

}
