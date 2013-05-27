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
public class DataSetSubType
{

	@Column
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private int id;

	@OneToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	private LangString dataSetSubType;

	public DataSetSubType()
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

	public LangString getDatasetSubType()
	{
		return this.dataSetSubType;
	}

	public void setDataSetSubType( final LangString dataSetSubType )
	{
		this.dataSetSubType = dataSetSubType;
	}

}
