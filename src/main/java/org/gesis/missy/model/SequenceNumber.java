package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.gesis.persistence.PersistableResource;

@Entity
public class SequenceNumber extends PersistableResource
{

	@Column
	private String clazz;

	@Column
	private int sequenceNo;

	public String getClazz()
	{
		return this.clazz;
	}

	public void setClazz( final String clazz )
	{
		this.clazz = clazz;
	}

	public int getSequenceNo()
	{
		return this.sequenceNo;
	}

	public void setSequenceNo( final int sequenceNo )
	{
		this.sequenceNo = sequenceNo;
	}

}
