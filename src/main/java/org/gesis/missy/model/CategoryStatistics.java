package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity( name = "Missy_CategoryStatistics" )
public class CategoryStatistics extends org.gesis.discovery.CategoryStatistics
{
	// properties

	// relations

	@Enumerated( EnumType.STRING )
	@Column
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
