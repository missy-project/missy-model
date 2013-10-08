package org.gesis.missy.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity( name = "Missy_Concept" )
public class Concept extends org.gesis.skos.Concept
{

	// properties

	private int position;

	// relations

	@OneToMany( cascade = CascadeType.ALL )
	@JoinColumn( name = "concept_id" )
	private List<CategoryStatistics> categoryStatistics;

	@ManyToMany( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	@JoinTable(
			name = "Missy_Concept_Country",
			joinColumns = @JoinColumn( name = "concept_id" ),
			inverseJoinColumns = @JoinColumn( name = "country_id" ) )
	private List<Country> country;

	// getter / setter

	public int getPosition()
	{
		return position;
	}

	public void setPosition( final int position )
	{
		this.position = position;
	}

	public List<Country> getCountry()
	{
		return country;
	}

	public void setCountry( final List<Country> country )
	{
		this.country = country;
	}

	public Concept addCountry( final Country country )
	{
		if ( this.country == null )
			this.country = new ArrayList<Country>( 32 );

		this.country.add( country );

		return this;
	}

	public List<CategoryStatistics> getCategoryStatistics()
	{
		return categoryStatistics;
	}

	public void setCategoryStatistics( final List<CategoryStatistics> categoryStatistics )
	{
		this.categoryStatistics = categoryStatistics;
	}

	public Concept addCategoryStatistics( final CategoryStatistics categoryStatistics )
	{
		if ( this.categoryStatistics == null )
			this.categoryStatistics = new ArrayList<CategoryStatistics>();

		this.categoryStatistics.add( categoryStatistics );

		return this;
	}

}
