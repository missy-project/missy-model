package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.gesis.ddi.util.AbstractBaseEntity;

@Entity
public class SessionDataSet extends AbstractBaseEntity
{

	@Column
	private String userName;

	@Column
	private String studyName;

	@Column
	private int year;

	@Column
	private String dataset;

	@Column
	private String filetype;

	public SessionDataSet() {

	}

	public String getUserName()
	{
		return this.userName;
	}

	public void setUserName( final String userName )
	{
		this.userName = userName;
	}

	public String getStudyName()
	{
		return this.studyName;
	}

	public void setStudyName( final String studyName )
	{
		this.studyName = studyName;
	}

	public int getYear()
	{
		return this.year;
	}

	public void setYear( final int year )
	{
		this.year = year;
	}

	public String getDataset()
	{
		return this.dataset;
	}

	public void setDataset( final String dataset )
	{
		this.dataset = dataset;
	}

	public String getFiletype()
	{
		return this.filetype;
	}

	public void setFiletype( final String filetype )
	{
		this.filetype = filetype;
	}

}
