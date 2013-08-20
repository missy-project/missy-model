package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import org.gesis.persistence.PersistableResource;
import org.gesis.rdf.LangString;

@Entity( name = "Missy_OfficialClassification" )
public class OfficialClassification extends PersistableResource
{

	// properties

	@Column
	private String code;

	// relations

	@OneToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	private LangString prefLabel;

	// getter / setter

	public String getCode()
	{
		return code;
	}

	public void setCode( final String code )
	{
		this.code = code;
	}

	public LangString getPrefLabel()
	{
		return prefLabel;
	}

	public void setPrefLabel( final LangString prefLabel )
	{
		this.prefLabel = prefLabel;
	}

}
