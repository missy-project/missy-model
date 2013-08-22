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
	private LangString prefLabel;

	// getter / setter

	public LangString getPrefLabel()
	{
		return prefLabel;
	}

	public void setPrefLabel( final LangString prefLabel )
	{
		this.prefLabel = prefLabel;
	}

	public String getDe()
	{
		if ( prefLabel == null )
			return null;

		return prefLabel.getDe();
	}

	public String getEn()
	{
		if ( prefLabel == null )
			return null;

		return prefLabel.getEn();
	}

	public String getFr()
	{
		if ( prefLabel == null )
			return null;

		return prefLabel.getFr();
	}
}
