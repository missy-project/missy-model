package org.gesis.missy.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.gesis.discovery.CategoryStatistics;

@Entity( name = "Missy_Concept" )
public class Concept extends org.gesis.skos.Concept
{

	// properties

	private int position;

	// relations

	@OneToMany( cascade = CascadeType.ALL )
	@JoinColumn( name = "concept_id" )
	private Set<CategoryStatistics> categoryStatistics;

	// getter / setter

	public int getPosition()
	{
		return position;
	}

	public void setPosition( final int position )
	{
		this.position = position;
	}

	public Set<CategoryStatistics> getCategoryStatistics()
	{
		return categoryStatistics;
	}

	public void setCategoryStatistics( final Set<CategoryStatistics> categoryStatistics )
	{
		this.categoryStatistics = categoryStatistics;
	}

}
