package org.gesis.missy.model;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;

import org.gesis.persistence.PersistableResource;

@Entity( name = "Missy_Document" )
public class Document extends PersistableResource
{
	
	@Column
	private String link;
	
	@Column 
	private String storeType;
	
	@Column 
	private String fileName;
	
	@Column 
	@Lob
	private Blob fileContent;
	
	@Column 
	private String fileType;
	
	@Column
	private String name;
	
	@Column
	private String type;
	
	@Column
	private String level;
	
	@Column
	private String year;
	
	@Column
	private String country;
	
	@Column
	private String language;
	
	@Column
	private String series;

	public String getLink()
	{
		return link;
	}

	public void setLink( String link )
	{
		this.link = link;
	}

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public String getType()
	{
		return type;
	}

	public void setType( String type )
	{
		this.type = type;
	}

	public String getLevel()
	{
		return level;
	}

	public void setLevel( String level )
	{
		this.level = level;
	}

	public String getYear()
	{
		return year;
	}

	public void setYear( String year )
	{
		this.year = year;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry( String country )
	{
		this.country = country;
	}

	public String getLanguage()
	{
		return language;
	}

	public void setLanguage( String language )
	{
		this.language = language;
	}

	public String getSeries()
	{
		return series;
	}

	public void setSeries( String series )
	{
		this.series = series;
	}

	public String getFileName()
	{
		return fileName;
	}

	public void setFileName( String fileName )
	{
		this.fileName = fileName;
	}

	public Blob getFileContent()
	{
		return fileContent;
	}

	public void setFileContent( Blob fileContent )
	{
		this.fileContent = fileContent;
	}

	public String getFileType()
	{
		return fileType;
	}

	public void setFileType( String fileType )
	{
		this.fileType = fileType;
	}

	public String getStoreType()
	{
		return storeType;
	}

	public void setStoreType( String storeType )
	{
		this.storeType = storeType;
	}
	
}
