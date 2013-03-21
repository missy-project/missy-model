package org.gesis.missy.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity( name = "MLogicalDataSet" )
public class LogicalDataSet extends org.gesis.ddi.ontology.LogicalDataSet
{

	// relations

	@ManyToOne
	@JoinColumn( name = "dataSetSubType_id" )
	private DataSetSubType dataSetSubType;

	@ManyToOne
	@JoinColumn( name = "dataSetType_id" )
	private DataSetType dataSetType;

	// getter/setter

	public LogicalDataSet( String agencyId, String objectId, int majorVersion )
	{
		super( agencyId, objectId, majorVersion );
	}

	public DataSetSubType getDataSetSubType() {
		return dataSetSubType;
	}

	public void setDataSetSubType(DataSetSubType dataSetSubType) {
		this.dataSetSubType = dataSetSubType;
	}

	public DataSetType getDataSetType() {
		return dataSetType;
	}

	public void setDataSetType(DataSetType dataSetType) {
		this.dataSetType = dataSetType;
	}

}
