package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity( name = "Missy_SummaryStatistics" )
public class SummaryStatistics extends org.gesis.discovery.SummaryStatistics
{

	@OneToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	@JoinColumn( name = "summaryStatisticsType_id" )
	private SummaryStatisticsType summaryStatisticsType;

	public SummaryStatisticsType getSummaryStatisticsType() {
		return this.summaryStatisticsType;
	}

	public void setSummaryStatisticsType(final SummaryStatisticsType summaryStatisticsType) {
		this.summaryStatisticsType = summaryStatisticsType;
	}

}
