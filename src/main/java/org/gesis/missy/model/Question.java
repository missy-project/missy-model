package org.gesis.missy.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity( name = "Missy_Question" )
public class Question extends org.gesis.discovery.Question
{

	// properties

	@Column
	private String questionNumber;

	@Column
	private int mandatory;

	@Column
	private int position;

	// relations

	@OneToMany( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	@JoinColumn( name = "question_id" )
	private List<QuestionText> questionTexts;

	@OneToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	private Comment comment;

	@ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	@JoinColumn( name = "referencePeriod_id" )
	private ReferencePeriod referencePeriod;

	// getter/setter

	public String getQuestionNumber() {
		return this.questionNumber;
	}

	public void setQuestionNumber(final String questionNumber) {
		this.questionNumber = questionNumber;
	}

	public int isMandatory()
	{
		return this.mandatory;
	}

	public void setMandatory(final int mandatory)
	{
		this.mandatory = mandatory;
	}

	public int getPosition()
	{
		return position;
	}

	public void setPosition( final int position )
	{
		this.position = position;
	}

	public List<QuestionText> getQuestionTexts()
	{
		return questionTexts;
	}

	public void setQuestionTexts( final List<QuestionText> questionTexts )
	{
		this.questionTexts = questionTexts;
	}

	public Question addQuestionText( final QuestionText questionText )
	{
		if ( this.questionTexts == null )
			this.questionTexts = new ArrayList<QuestionText>();

		this.questionTexts.add( questionText );

		return this;
	}

	public Comment getComment()
	{
		return comment;
	}

	public void setComment( final Comment comment )
	{
		this.comment = comment;
	}

	public ReferencePeriod getReferencePeriod() {
		return this.referencePeriod;
	}

	public void setReferencePeriod(final ReferencePeriod referencePeriod) {
		this.referencePeriod = referencePeriod;
	}

}
