package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import org.gesis.persistence.PersistableResource;
import org.gesis.rdf.LangString;

@Entity( name = "Missy_DataSetSubType" )
public class DataSetSubType extends PersistableResource
{

	// relations

	@OneToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	private LangString prefLabel;

	// getter / setter

	public LangString getPrefLabel()
	{
		return this.prefLabel;
	}

	public void setPrefLabel( final LangString dataSetSubType )
	{
		this.prefLabel = dataSetSubType;
	}

}
