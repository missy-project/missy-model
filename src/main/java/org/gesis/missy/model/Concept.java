package org.gesis.missy.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

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

	public Concept addCategoryStatistics( final CategoryStatistics categoryStatistics )
	{
		if ( this.categoryStatistics == null )
			this.categoryStatistics = new HashSet<CategoryStatistics>();

		this.categoryStatistics.add( categoryStatistics );

		return this;
	}

}
