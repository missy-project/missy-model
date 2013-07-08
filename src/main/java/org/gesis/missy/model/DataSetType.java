package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import org.gesis.persistence.PersistableResource;
import org.gesis.rdf.LangString;

@Entity( name = "Missy_DataSetType" )
public class DataSetType extends PersistableResource
{

	// relations

	@OneToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	private LangString dataSetType;

	// getter / setter

	public LangString getDatasetType()
	{
		return this.dataSetType;
	}

	public void setDatasetType( final LangString datasetType )
	{
		this.dataSetType = datasetType;
	}

}
