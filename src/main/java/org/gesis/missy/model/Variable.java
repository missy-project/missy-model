package org.gesis.missy.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
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

	@ManyToOne( cascade = CascadeType.ALL )
	@JoinColumn( name = "adhocModuleType_id" )
	private AdhocModuleType adhocModuleType;

	@ManyToOne( cascade = CascadeType.ALL )
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

	public Variable( String agencyId, String objectId, int majorVersion )
	{
		super( agencyId, objectId, majorVersion );
	}

	public String getVariableShortName() {
		return variableShortName;
	}

	public void setVariableShortName(String variableShortName) {
		this.variableShortName = variableShortName;
	}

	public String getVariableLabelLong() {
		return variableLabelLong;
	}

	public void setVariableLabelLong(String variableLabelLong) {
		this.variableLabelLong = variableLabelLong;
	}

	public int isDerived()
	{
		return derived;
	}

	public void setDerived(int derived)
	{
		this.derived = derived;
	}

	public AdhocModuleType getAdhocModuleType() {
		return adhocModuleType;
	}

	public void setAdhocModuleType(AdhocModuleType adhocModuleType) {
		this.adhocModuleType = adhocModuleType;
	}

	public SamplingFractionType getSamplingFraction() {
		return samplingFraction;
	}

	public void setSamplingFraction(SamplingFractionType samplingFraction) {
		this.samplingFraction = samplingFraction;
	}

	public Set<SummaryStatistics> getSummaryStatistics() {
		return summaryStatistics;
	}

	public void setSummaryStatistics(Set<SummaryStatistics> summaryStatistics) {
		this.summaryStatistics = summaryStatistics;
	}

}
