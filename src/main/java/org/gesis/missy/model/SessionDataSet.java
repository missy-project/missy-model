package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Transient;

import org.gesis.persistence.PersistableResource;

@Entity
public class SessionDataSet extends PersistableResource
{

	@Column
	private String userName;

	@Column
	private String studyName;

	@Transient
	private String studyNameDisplayName;

	@Column
	private int year;

	@Column
	private String dataset;

	@Transient
	private String datasetDisplayName;

	@Column
	private String filetype;

	@Transient
	private String filetypeDisplayName;

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

	public String getStudyNameDisplayName()
	{
		return this.studyNameDisplayName;
	}

	public void setStudyNameDisplayName( final String studyNameDisplayName )
	{
		this.studyNameDisplayName = studyNameDisplayName;
	}

	public String getDatasetDisplayName()
	{
		return this.datasetDisplayName;
	}

	public void setDatasetDisplayName( final String datasetDisplayName )
	{
		this.datasetDisplayName = datasetDisplayName;
	}

	public String getFiletypeDisplayName()
	{
		return this.filetypeDisplayName;
	}

	public void setFiletypeDisplayName( final String filetypeDisplayName )
	{
		this.filetypeDisplayName = filetypeDisplayName;
	}

}
