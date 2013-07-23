package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import org.gesis.persistence.PersistableResource;
import org.gesis.rdf.LangString;

@Entity( name = "Missy_QuestionText" )
public class QuestionText extends PersistableResource
{

	// properties

	@OneToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	private LangString questionText;

	// getter / setter

	public LangString getQuestionText()
	{
		return questionText;
	}

	public void setQuestionText( final LangString questionText )
	{
		this.questionText = questionText;
	}

	public String getDe()
	{
		if ( questionText == null )
			return null;

		return questionText.getDe();
	}

	public String getEn()
	{
		if ( questionText == null )
			return null;

		return questionText.getEn();
	}

	public String getFr()
	{
		if ( questionText == null )
			return null;

		return questionText.getFr();
	}
}
