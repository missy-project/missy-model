package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.gesis.ddi.IdentifiableImpl;

@Entity
public class Comment_InstrumentQuestion extends IdentifiableImpl
{

	// properties

	@Column
	private String comment;

	// relations

	@ManyToOne( optional = false )
	private Instrument instrument;

	@ManyToOne( optional = false )
	private Question question;

	// getter/setter

	public String getComment()
	{
		return this.comment;
	}

	public void setComment( final String comment )
	{
		this.comment = comment;
	}

	public Instrument getInstrument()
	{
		return this.instrument;
	}

	public void setInstrument( final Instrument instrument )
	{
		this.instrument = instrument;
	}

	public Question getQuestion()
	{
		return this.question;
	}

	public void setQuestion( final Question question )
	{
		this.question = question;
	}

}
