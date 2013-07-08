package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import org.gesis.persistence.PersistableResource;
import org.gesis.rdf.LangString;

@Entity( name = "Missy_SummaryStatisticsType" )
public class SummaryStatisticsType extends PersistableResource
{

	// relations

	@OneToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	private LangString summaryStatisticsType;

	// getter / setter

	public LangString getSummaryStatisticsType()
	{
		return this.summaryStatisticsType;
	}

	public void setSummaryStatisticsType( final LangString summaryStatisticsType )
	{
		this.summaryStatisticsType = summaryStatisticsType;
	}

}
