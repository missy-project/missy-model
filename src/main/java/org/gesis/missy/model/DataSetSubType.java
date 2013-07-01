package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import org.gesis.persistence.PersistableResource;
import org.gesis.rdf.LangString;

@Entity
public class DataSetSubType extends PersistableResource
{

	// relations

	@OneToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	private LangString dataSetSubType;

	// getter / setter

	public LangString getDatasetSubType()
	{
		return this.dataSetSubType;
	}

	public void setDataSetSubType( final LangString dataSetSubType )
	{
		this.dataSetSubType = dataSetSubType;
	}

}
