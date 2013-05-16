package org.gesis.missy.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.gesis.rdf.LangString;

@Entity( name = "MQuestion" )
public class Question extends org.gesis.ddi.ontology.Question
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

	public Question( String agencyId, String objectId, int majorVersion )
	{
		super( agencyId, objectId, majorVersion );
	}

	public String getQuestionNumber() {
		return questionNumber;
	}

	public void setQuestionNumber(String questionNumber) {
		this.questionNumber = questionNumber;
	}

	public int isMandatory()
	{
		return mandatory;
	}

	public void setMandatory(int mandatory)
	{
		this.mandatory = mandatory;
	}

	@Override
	public Object getQuestionText() {
		if ( this.questionText != null )
			return questionText;
		
		return super.getQuestionText();
	}

	public void setQuestionText( Set<LangString> questionText )
	{
		this.questionText = questionText;
	}

	public ReferencePeriod getReferencePeriod() {
		return referencePeriod;
	}

	public void setReferencePeriod(ReferencePeriod referencePeriod) {
		this.referencePeriod = referencePeriod;
	}

}
