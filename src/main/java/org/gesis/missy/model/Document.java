package org.gesis.missy.model;

import javax.persistence.Entity;

import org.gesis.persistence.PersistableResource;

@Entity( name = "Missy_Document" )
public class Document extends PersistableResource
{

	// @Blob
	private byte[] file;

	public byte[] getFile()
	{
		return file;
	}

	public void setFile( final byte[] file )
	{
		this.file = file;
	}

}
