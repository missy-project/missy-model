package org.gesis.missy.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity( name = "MVariable" )
public class Variable extends org.gesis.ddi.ontology.Variable
{

	// properties

	@Column
	private String variableShortName;

	@Column
	private String variableLabelLong;

	@Column
	private int derived;

	// relations

	@ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	@JoinColumn( name = "adhocModuleType_id" )
	private AdhocModuleType adhocModuleType;

	@ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	@JoinColumn( name = "samplingFraction_id" )
	private SamplingFractionType samplingFraction;

	@ElementCollection
	@ManyToMany( cascade = CascadeType.ALL )
	@JoinTable(
			name = "MVariable_SummaryStatistics",
			joinColumns=@JoinColumn(name="variable_id"),
			inverseJoinColumns=@JoinColumn( name = "summaryStatistics_id" ))
	private Set<SummaryStatistics> summaryStatistics;

	// getter/setter

	private Variable()
	{
		super( null, null, 0 );
	}

	public Variable( final String agencyId, final String objectId, final int majorVersion )
	{
		super( agencyId, objectId, majorVersion );
	}

	public String getVariableShortName() {
		return this.variableShortName;
	}

	public void setVariableShortName(final String variableShortName) {
		this.variableShortName = variableShortName;
	}

	public String getVariableLabelLong() {
		return this.variableLabelLong;
	}

	public void setVariableLabelLong(final String variableLabelLong) {
		this.variableLabelLong = variableLabelLong;
	}

	public int isDerived()
	{
		return this.derived;
	}

	public void setDerived(final int derived)
	{
		this.derived = derived;
	}

	public AdhocModuleType getAdhocModuleType() {
		return this.adhocModuleType;
	}

	public void setAdhocModuleType(final AdhocModuleType adhocModuleType) {
		this.adhocModuleType = adhocModuleType;
	}

	public SamplingFractionType getSamplingFraction() {
		return this.samplingFraction;
	}

	public void setSamplingFraction(final SamplingFractionType samplingFraction) {
		this.samplingFraction = samplingFraction;
	}

	public Set<SummaryStatistics> getSummaryStatistics() {
		return this.summaryStatistics;
	}

	public void setSummaryStatistics(final Set<SummaryStatistics> summaryStatistics) {
		this.summaryStatistics = summaryStatistics;
	}

}
