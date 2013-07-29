package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity( name = "Missy_CategoryStatistics" )
public class CategoryStatistics extends org.gesis.discovery.CategoryStatistics
{
	// properties

	// relations

	@ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	@JoinColumn( name = "computationBaseType_id" )
	private ComputationBaseType computationBaseType;

	// getter / setter

	public ComputationBaseType getComputationBaseType()
	{
		return computationBaseType;
	}

	public void setComputationBaseType( final ComputationBaseType computationBaseType )
	{
		this.computationBaseType = computationBaseType;
	}


}
