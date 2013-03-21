package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.gesis.rdf.LangString;

@Entity
public class DataSetType {

	@Column
	@Id
	private int id;

	@OneToOne
	private LangString dataSetType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LangString getDatasetType()
	{
		return dataSetType;
	}

	public void setDatasetType( LangString datasetType )
	{
		this.dataSetType = datasetType;
	}

}
