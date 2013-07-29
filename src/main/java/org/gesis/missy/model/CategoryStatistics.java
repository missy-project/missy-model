package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity( name = "Missy_CategoryStatistics" )
public class CategoryStatistics extends org.gesis.discovery.CategoryStatistics
{
	// properties

	// relations

	@ManyToMany( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	@JoinTable(
			name = "Missy_CategoryStatistics_ComputationBaseType",
			joinColumns = @JoinColumn( name = "categoryStatistics_id" ),
			inverseJoinColumns = @JoinColumn( name = "computationBaseType_id" ) )
	private ComputationBaseType computationBaseType;

	// getter / setter

	public ComputationBaseType getComputationBaseType()
	{
		return computationBaseType;
	}

	public void setComputationBaseType( ComputationBaseType computationBaseType )
	{
		this.computationBaseType = computationBaseType;
	}


}
