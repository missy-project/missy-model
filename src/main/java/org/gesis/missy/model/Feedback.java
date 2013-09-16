package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;

import org.gesis.persistence.PersistableResource;

@Entity
public class Feedback extends PersistableResource
{

	@Column( length = 20 )
	private String type;

	@Lob
	private String description;

	@Column
	private String url;

	@Column
	private boolean anonymous;

	@Column( length = 20 )
	private String username;

	public String getType()
	{
		return type;
	}

	public void setType( final String type )
	{
		this.type = type;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription( final String description )
	{
		this.description = description;
	}

	public boolean isAnonymous()
	{
		return anonymous;
	}

	public void setAnonymous( final boolean anonymous )
	{
		this.anonymous = anonymous;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername( final String username )
	{
		this.username = username;
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl( final String url )
	{
		this.url = url;
	}

}