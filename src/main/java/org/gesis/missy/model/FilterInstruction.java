package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.gesis.ddi.IdentifiableImpl;

@Entity
public class FilterInstruction extends IdentifiableImpl
{

	@Column
	private String filterInstruction;

	@Column
	private String filterInstructionFormal;

	public String getFilterInstruction() {
		return this.filterInstruction;
	}

	public void setFilterInstruction(final String filterInstruction) {
		this.filterInstruction = filterInstruction;
	}

	public String getFilterInstructionFormal() {
		return this.filterInstructionFormal;
	}

	public void setFilterInstructionFormal(final String filterInstructionFormal) {
		this.filterInstructionFormal = filterInstructionFormal;
	}

}
