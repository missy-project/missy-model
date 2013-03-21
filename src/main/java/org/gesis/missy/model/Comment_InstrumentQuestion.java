package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.gesis.ddi.Identifiable;

@Entity
public class Comment_InstrumentQuestion extends Identifiable
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

	public Comment_InstrumentQuestion( String agencyId, String objectId, int majorVersion )
	{
		super( agencyId, objectId, majorVersion );
	}

	public String getComment()
	{
		return comment;
	}

	public void setComment( String comment )
	{
		this.comment = comment;
	}

	public Instrument getInstrument()
	{
		return instrument;
	}

	public void setInstrument( Instrument instrument )
	{
		this.instrument = instrument;
	}

	public Question getQuestion()
	{
		return question;
	}

	public void setQuestion( Question question )
	{
		this.question = question;
	}

}
