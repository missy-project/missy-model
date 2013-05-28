package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity( name = "MInstrument" )
public class Instrument extends org.gesis.ddi.ontology.Instrument
{

	@Column
	private String instrumentName;

	public String getInstrumentName() {
		return this.instrumentName;
	}

	public void setInstrumentName(final String instrumentName) {
		this.instrumentName = instrumentName;
	}

}
