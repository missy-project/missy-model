package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

/**
 * @author matthaeus
 * 
 */
@Entity( name = "Missy_StudyGroup" )
public class StudyGroup extends org.gesis.discovery.StudyGroup
{

	// properties

	@Column
	private short dataVersionReleaseYear;

	@Column
	private String dataVersionVersionNumber;

	@Lob
	private String note;

	@Column
	private String sampling;

	@Column
	private String dataCollection;

	@Column
	private String anonymization;

	@Column
	private String legalBasis;

	@Column
	private String organization;

	@Column
	private String comparabilityOverTime;

	@Column
	private String comparabilityOverSpace;

	@Lob
	private String citation;

	// relations

	@ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	@JoinColumn( name = "dataAccessCondition_id" )
	private DataAccessCondition dataAccessCondition;

	// getter / setter

	public short getDataVersionReleaseYear()
	{
		return dataVersionReleaseYear;
	}

	public void setDataVersionReleaseYear( final short dataVersionReleaseYear )
	{
		this.dataVersionReleaseYear = dataVersionReleaseYear;
	}

	public String getDataVersionVersionNumber()
	{
		return dataVersionVersionNumber;
	}

	public void setDataVersionVersionNumber( final String dataVersionVersionNumber )
	{
		this.dataVersionVersionNumber = dataVersionVersionNumber;
	}

	public String getNote()
	{
		return note;
	}

	public void setNote( final String note )
	{
		this.note = note;
	}

	public String getSampling()
	{
		return sampling;
	}

	public void setSampling( final String sampling )
	{
		this.sampling = sampling;
	}

	public String getDataCollection()
	{
		return dataCollection;
	}

	public void setDataCollection( final String dataCollection )
	{
		this.dataCollection = dataCollection;
	}

	public String getAnonymization()
	{
		return anonymization;
	}

	public void setAnonymization( final String anonymization )
	{
		this.anonymization = anonymization;
	}

	public String getLegalBasis()
	{
		return legalBasis;
	}

	public void setLegalBasis( final String legalBasis )
	{
		this.legalBasis = legalBasis;
	}

	public String getOrganization()
	{
		return organization;
	}

	public void setOrganization( final String organization )
	{
		this.organization = organization;
	}

	public String getComparabilityOverTime()
	{
		return comparabilityOverTime;
	}

	public void setComparabilityOverTime( final String comparabilityOverTime )
	{
		this.comparabilityOverTime = comparabilityOverTime;
	}

	public String getComparabilityOverSpace()
	{
		return comparabilityOverSpace;
	}

	public void setComparabilityOverSpace( final String comparabilityOverSpace )
	{
		this.comparabilityOverSpace = comparabilityOverSpace;
	}

	public String getCitation()
	{
		return citation;
	}

	public void setCitation( final String citation )
	{
		this.citation = citation;
	}

	public DataAccessCondition getDataAccessCondition()
	{
		return dataAccessCondition;
	}

	public void setDataAccessCondition( final DataAccessCondition dataAccessCondition )
	{
		this.dataAccessCondition = dataAccessCondition;
	}

}
