package org.gesis.missy.model;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.gesis.skos.ConceptScheme;

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

	// relations

	@ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	@JoinColumn( name = "adhocModuleType_id" )
	private AdhocModuleType adhocModuleType;

	@ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	@JoinColumn( name = "samplingFraction_id" )
	private SamplingFractionType samplingFraction;

	@ManyToMany( cascade = CascadeType.ALL )
	@JoinTable(
			name = "Missy_Variable_SummaryStatistics",
			joinColumns = @JoinColumn( name = "variable_id" ),
			inverseJoinColumns = @JoinColumn( name = "summaryStatistics_id" ) )
	private Set<SummaryStatistics> summaryStatistics;

	@OneToMany( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	private Set<Comment> comments;

	@OneToOne( cascade = CascadeType.ALL )
	private ConceptScheme conceptScheme;

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

	public Set<Comment> getComments()
	{
		return this.comments;
	}

	public void setComments( final Set<Comment> comments )
	{
		this.comments = comments;
	}

	public Variable addComment( final Comment comment )
	{
		if ( this.comments == null )
			this.comments = new LinkedHashSet<Comment>();

		this.comments.add( comment );

		return this;
	}

	public ConceptScheme getConceptScheme()
	{
		return conceptScheme;
	}

	public void setConceptScheme( final ConceptScheme conceptScheme )
	{
		this.conceptScheme = conceptScheme;
	}

	@Override
	public String toString()
	{
		return "Variable [getId()=" + getId() + ", getURN()=" + getURN() + "]";
	}

}
