package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity( name = "MVariableDefinition" )
public class VariableDefinition extends org.gesis.ddi.ontology.VariableDefinition
{

	// properties

	// relations

	@ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	@JoinColumn( name = "officialClassification_id" )
	private OfficialClassification officialClassification;

	// getter/setter

	public OfficialClassification getOfficialClassification() {
		return this.officialClassification;
	}

	public void setOfficialClassification(final OfficialClassification officialClassification) {
		this.officialClassification = officialClassification;
	}

}
