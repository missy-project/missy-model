package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.gesis.skos.ConceptScheme;

@Entity( name = "Missy_LogicalDataSet" )
public class LogicalDataSet extends org.gesis.discovery.LogicalDataSet
{

	// properties

	@Column
	private String versionInfo;

	// relations

	@ManyToOne
	@JoinColumn( name = "dataSetSubType_id" )
	private DataSetSubType dataSetSubType;

	@ManyToOne
	@JoinColumn( name = "dataSetType_id" )
	private DataSetType dataSetType;

	@ManyToOne
	@JoinColumn( name = "conceptScheme_id" )
	private ConceptScheme conceptScheme;

	// getter/setter

	public String getVersionInfo()
	{
		return this.versionInfo;
	}

	public void setVersionInfo( final String owl_versionInfo )
	{
		this.versionInfo = owl_versionInfo;
	}

	public DataSetSubType getDataSetSubType()
	{
		return this.dataSetSubType;
	}

	public void setDataSetSubType( final DataSetSubType dataSetSubType )
	{
		this.dataSetSubType = dataSetSubType;
	}

	public DataSetType getDataSetType()
	{
		return this.dataSetType;
	}

	public void setDataSetType( final DataSetType dataSetType )
	{
		this.dataSetType = dataSetType;
	}

	public ConceptScheme getConceptScheme()
	{
		return this.conceptScheme;
	}

	public void setConceptScheme( final ConceptScheme conceptScheme )
	{
		this.conceptScheme = conceptScheme;
	}

}
