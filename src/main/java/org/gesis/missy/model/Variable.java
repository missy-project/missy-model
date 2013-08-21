package org.gesis.missy.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity( name = "Missy_Variable" )
public class Variable extends org.gesis.discovery.Variable
{

	// properties

	@Column
	private String variableShortName;

	@Column
	private String variableLabelLong;

	@Column
	private boolean derived;

	@Column
	private int position;

	@Enumerated( EnumType.STRING )
	@Column
	private AdhocModuleType adhocModuleType;

	// relations

	@ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	@JoinColumn( name = "samplingFraction_id" )
	private SamplingFractionType samplingFraction;

	@OneToMany( cascade = CascadeType.ALL )
	@JoinColumn( name = "variable_id" )
	private Set<SummaryStatistics> summaryStatistics;

	@OneToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	private Comment countrySpecificComment;

	@OneToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	private Comment otherComment;

	@OneToMany( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	@JoinColumn( name = "variable_id" )
	private Set<ConceptScheme> conceptScheme;

	// getter/setter

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

	public boolean isDerived()
	{
		return this.derived;
	}

	public void setDerived( final boolean derived )
	{
		this.derived = derived;
	}

	public int getPosition()
	{
		return position;
	}

	public void setPosition( final int position )
	{
		this.position = position;
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

	public Variable addSummaryStatistics( final SummaryStatistics summaryStatistics )
	{
		if ( this.summaryStatistics == null )
			this.summaryStatistics = new HashSet<SummaryStatistics>();

		this.summaryStatistics.add( summaryStatistics );

		return this;
	}

	public Comment getCountrySpecificComment()
	{
		return countrySpecificComment;
	}

	public void setCountrySpecificComment( final Comment countrySpecificComments )
	{
		this.countrySpecificComment = countrySpecificComments;
	}

	public Comment getOtherComment()
	{
		return otherComment;
	}

	public void setOtherComment( final Comment otherComments )
	{
		this.otherComment = otherComments;
	}

	public Set<ConceptScheme> getConceptScheme()
	{
		return conceptScheme;
	}

	public void setConceptScheme( final Set<ConceptScheme> conceptScheme )
	{
		this.conceptScheme = conceptScheme;
	}

	public Variable addConceptScheme( final ConceptScheme conceptScheme )
	{
		if ( this.conceptScheme == null )
			this.conceptScheme = new HashSet<ConceptScheme>();

		this.conceptScheme.add( conceptScheme );

		return this;
	}

	@Override
	public String toString()
	{
		return "Variable [notation: " + getNotation() + ", urn: " + getURN() + ", id:" + getId() + "]";
	}

}
