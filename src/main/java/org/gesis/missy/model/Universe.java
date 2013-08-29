package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity( name = "Missy_Universe" )
public class Universe extends org.gesis.discovery.Universe
{

	// properties

	// relations

	@OneToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	@JoinColumn( name = "filterInstruction_id" )
	private FilterInstruction filterInstruction;

	// getter/setter

	public FilterInstruction getFilterInstruction() {
		return this.filterInstruction;
	}

	public void setFilterInstruction(final FilterInstruction filterInstruction) {
		this.filterInstruction = filterInstruction;
	}

}
