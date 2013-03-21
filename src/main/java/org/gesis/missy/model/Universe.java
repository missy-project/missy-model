package org.gesis.missy.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity( name = "MUniverse" )
public class Universe extends org.gesis.ddi.ontology.Universe
{

	// properties

	// relations

	@OneToOne
	@JoinColumn( name = "universeType_id" )
	private UniverseType universeType;

	@OneToOne( optional = false )
	@JoinColumn( name = "filterInstruction_id" )
	private FilterInstruction filterInstruction;

	// getter/setter

	public Universe( String agencyId, String objectId, int majorVersion )
	{
		super( agencyId, objectId, majorVersion );
	}

	public UniverseType getUniverseType() {
		return universeType;
	}

	public void setUniverseType(UniverseType universeType) {
		this.universeType = universeType;
	}

	public FilterInstruction getFilterInstruction() {
		return filterInstruction;
	}

	public void setFilterInstruction(FilterInstruction filterInstruction) {
		this.filterInstruction = filterInstruction;
	}

}
