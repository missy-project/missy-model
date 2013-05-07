package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.gesis.rdf.LangString;

@Entity
public class DataSetType
{

	@Column
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE )
	private int id;

	@OneToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	private LangString dataSetType;

	public DataSetType()
	{

	}

	public int getId()
	{
		return this.id;
	}

	public void setId( final int id )
	{
		this.id = id;
	}

	public LangString getDatasetType()
	{
		return this.dataSetType;
	}

	public void setDatasetType( final LangString datasetType )
	{
		this.dataSetType = datasetType;
	}

}
