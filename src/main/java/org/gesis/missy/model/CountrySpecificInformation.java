package org.gesis.missy.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.gesis.persistence.PersistableResource;

/**
 * @author matthaeus
 * 
 */
@Entity( name = "Missy_CountrySpecificInformation" )
public class CountrySpecificInformation extends PersistableResource
{

	// properties

	@Column
	private String correspondingNationalStudy;

	@Column
	private String producer;

	@Column
	private String availableData;

	@Column
	private int numberOfRotationalGroups;

	@Column
	private String unitsOfObservation;

	@Column
	private String startDateOfDataCollection;

	@Column
	private String endDateOfDataCollection;

	@Lob
	private String note;

	@Column
	private String citation;

	// relations

	@OneToOne( cascade = CascadeType.ALL )
	private Weighting weighting;

	@ManyToMany( cascade = CascadeType.ALL )
	private List<Study> study;

	@OneToOne( cascade = CascadeType.ALL )
	private Country country;

	@ManyToOne( cascade = CascadeType.ALL )
	@JoinColumn( name = "universe_id" )
	private Universe universe;

	@OneToMany( cascade = CascadeType.ALL )
	@JoinColumn( name = "countrySpecificInformation_id" )
	private List<TargetSampleSize> targetSampleSize;

	@OneToOne( cascade = CascadeType.ALL )
	private SamplingProcedure samplingProcedure;

	@OneToOne( cascade = CascadeType.ALL )
	private ModeOfCollection modeOfCollection;

	// getter / setter

	public String getCorrespondingNationalStudy()
	{
		return correspondingNationalStudy;
	}

	public void setCorrespondingNationalStudy( final String correspondingNationalStudy )
	{
		this.correspondingNationalStudy = correspondingNationalStudy;
	}

	public String getProducer()
	{
		return producer;
	}

	public void setProducer( final String producer )
	{
		this.producer = producer;
	}

	public String getAvailableData()
	{
		return availableData;
	}

	public void setAvailableData( final String availableData )
	{
		this.availableData = availableData;
	}

	public int getNumberOfRotationalGroups()
	{
		return numberOfRotationalGroups;
	}

	public void setNumberOfRotationalGroups( final int numberOfRotationalGroups )
	{
		this.numberOfRotationalGroups = numberOfRotationalGroups;
	}

	public String getUnitsOfObservation()
	{
		return unitsOfObservation;
	}

	public void setUnitsOfObservation( final String unitsOfObservation )
	{
		this.unitsOfObservation = unitsOfObservation;
	}

	public String getStartDateOfDataCollection()
	{
		return startDateOfDataCollection;
	}

	public void setStartDateOfDataCollection( final String startDateOfDataCollection )
	{
		this.startDateOfDataCollection = startDateOfDataCollection;
	}

	public String getEndDateOfDataCollection()
	{
		return endDateOfDataCollection;
	}

	public void setEndDateOfDataCollection( final String endDateOfDataCollection )
	{
		this.endDateOfDataCollection = endDateOfDataCollection;
	}

	public String getNote()
	{
		return note;
	}

	public void setNote( final String note )
	{
		this.note = note;
	}

	public String getCitation()
	{
		return citation;
	}

	public void setCitation( final String citation )
	{
		this.citation = citation;
	}

	public Weighting getWeighting()
	{
		return weighting;
	}

	public void setWeighting( final Weighting weighting )
	{
		this.weighting = weighting;
	}

	public List<Study> getStudy()
	{
		return study;
	}

	public void setStudy( final List<Study> study )
	{
		this.study = study;
	}

	public Country getCountry()
	{
		return country;
	}

	public void setCountry( final Country country )
	{
		this.country = country;
	}

	public Universe getUniverse()
	{
		return universe;
	}

	public void setUniverse( final Universe universe )
	{
		this.universe = universe;
	}

	public List<TargetSampleSize> getTargetSampleSize()
	{
		return targetSampleSize;
	}

	public void setTargetSampleSize( final List<TargetSampleSize> targetSampleSize )
	{
		this.targetSampleSize = targetSampleSize;
	}

	public SamplingProcedure getSamplingProcedure()
	{
		return samplingProcedure;
	}

	public void setSamplingProcedure( final SamplingProcedure samplingProcedure )
	{
		this.samplingProcedure = samplingProcedure;
	}

	public ModeOfCollection getModeOfCollection()
	{
		return modeOfCollection;
	}

	public void setModeOfCollection( final ModeOfCollection modeOfCollection )
	{
		this.modeOfCollection = modeOfCollection;
	}

}
