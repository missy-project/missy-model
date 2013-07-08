package org.gesis.missy.model;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.gesis.rdf.LangString;

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
	private Set<LangString> questionText;

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

	@Override
	public Set<LangString> getQuestionText()
	{
		if ( this.questionText != null )
			return this.questionText;
		
		Set<LangString> ret = new HashSet<LangString>();

		if ( super.getQuestionText() instanceof LangString )
			ret.add( (LangString) super.getQuestionText() );

		return ret;
	}

	public void setQuestionText( final Set<LangString> questionText )
	{
		this.questionText = questionText;
	}

	public Question addQuestionText( final LangString questionText )
	{
		if ( this.questionText == null )
			this.questionText = new LinkedHashSet<LangString>();

		this.questionText.add( questionText );

		return this;
	}

	public ReferencePeriod getReferencePeriod() {
		return this.referencePeriod;
	}

	public void setReferencePeriod(final ReferencePeriod referencePeriod) {
		this.referencePeriod = referencePeriod;
	}

}
