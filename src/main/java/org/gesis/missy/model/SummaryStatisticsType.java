package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.gesis.rdf.LangString;

@Entity
public class SummaryStatisticsType {

	@Column
	@Id
	private int id;

	@OneToOne
	private LangString summaryStatisticsType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LangString getSummaryStatisticsType()
	{
		return summaryStatisticsType;
	}

	public void setSummaryStatisticsType( LangString summaryStatisticsType )
	{
		this.summaryStatisticsType = summaryStatisticsType;
	}

}
