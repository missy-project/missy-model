package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.gesis.ddi.Identifiable;

@Entity
public class FilterInstruction extends Identifiable {

	@Column
	private String filterInstruction;

	@Column
	private String filterInstructionFormal;

	public FilterInstruction( String agencyId, String objectId, int majorVersion )
	{
		super( agencyId, objectId, majorVersion );
	}

	public String getFilterInstruction() {
		return filterInstruction;
	}

	public void setFilterInstruction(String filterInstruction) {
		this.filterInstruction = filterInstruction;
	}

	public String getFilterInstructionFormal() {
		return filterInstructionFormal;
	}

	public void setFilterInstructionFormal(String filterInstructionFormal) {
		this.filterInstructionFormal = filterInstructionFormal;
	}

}
