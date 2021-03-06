package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity( name = "Missy_Universe" )
public class Universe extends org.gesis.discovery.Universe
{

	// properties

	// relations

	@ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	@JoinColumn( name = "universeType_id" )
	private UniverseType universeType;

	@OneToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	@JoinColumn( name = "filterInstruction_id" )
	private FilterInstruction filterInstruction;

	// getter/setter

	public UniverseType getUniverseType() {
		return this.universeType;
	}

	public void setUniverseType(final UniverseType universeType) {
		this.universeType = universeType;
	}

	public FilterInstruction getFilterInstruction() {
		return this.filterInstruction;
	}

	public void setFilterInstruction(final FilterInstruction filterInstruction) {
		this.filterInstruction = filterInstruction;
	}

}
