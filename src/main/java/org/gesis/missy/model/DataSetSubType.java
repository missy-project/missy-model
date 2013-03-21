package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.gesis.rdf.LangString;

@Entity
public class DataSetSubType {

	@Column
	@Id
	private int id;
	
	@OneToOne
	private LangString dataSetSubType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LangString getDatasetSubType()
	{
		return dataSetSubType;
	}

	public void setDatasetSubType( LangString datasetSubType )
	{
		this.dataSetSubType = datasetSubType;
	}

}
