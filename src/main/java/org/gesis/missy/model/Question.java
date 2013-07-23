package org.gesis.missy.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity( name = "Missy_Question" )
public class Question extends org.gesis.discovery.Question
{

	// properties

	@Column
	private String questionNumber;

	@Column
	private int mandatory;

	// relations

	@OneToMany( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	@JoinColumn( name = "questionText_id" )
	private Set<QuestionText> questionTexts;

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

	public Set<QuestionText> getQuestionTexts()
	{
		return questionTexts;
	}

	public void setQuestionTexts( final Set<QuestionText> questionTexts )
	{
		this.questionTexts = questionTexts;
	}

	public Question addQuestionText( final QuestionText questionText )
	{
		if ( this.questionTexts == null )
			this.questionTexts = new HashSet<QuestionText>();

		this.questionTexts.add( questionText );

		return this;
	}

	public ReferencePeriod getReferencePeriod() {
		return this.referencePeriod;
	}

	public void setReferencePeriod(final ReferencePeriod referencePeriod) {
		this.referencePeriod = referencePeriod;
	}

}
