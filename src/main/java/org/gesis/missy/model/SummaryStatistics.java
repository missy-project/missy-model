package org.gesis.missy.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity( name = "MSummaryStatistics" )
public class SummaryStatistics extends org.gesis.ddi.ontology.SummaryStatistics
{

	@OneToOne( optional = false )
	@JoinColumn( name = "summaryStatisticsType_id" )
	private SummaryStatisticsType summaryStatisticsType;

	public SummaryStatistics( String agencyId, String objectId, int majorVersion )
	{
		super( agencyId, objectId, majorVersion );
	}

	public SummaryStatisticsType getSummaryStatisticsType() {
		return summaryStatisticsType;
	}

	public void setSummaryStatisticsType(SummaryStatisticsType summaryStatisticsType) {
		this.summaryStatisticsType = summaryStatisticsType;
	}

}
