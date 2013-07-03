package org.gesis.missy.model;

public class Identification
{
	// properties

	private String agencyID;
	private String versionRelease;
	private String versionMinor;

	// getter / setter

	public String getAgencyID()
	{
		return this.agencyID;
	}

	public void setAgencyID( final String agencyID )
	{
		this.agencyID = agencyID;
	}

	public String getVersionRelease()
	{
		return this.versionRelease;
	}

	public void setVersionRelease( final String versionRelease )
	{
		this.versionRelease = versionRelease;
	}

	public String getVersionMinor()
	{
		return this.versionMinor;
	}

	public void setVersionMinor( final String versionMinor )
	{
		this.versionMinor = versionMinor;
	}
}
