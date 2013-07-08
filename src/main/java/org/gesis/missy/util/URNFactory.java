package org.gesis.missy.util;

import org.gesis.missy.model.Identification;

public class URNFactory
{

	public static String createLogicalDataSetURN( final Identification identification, final String studyName, final String year, final String dataSetType, final String dataSetSubType )
	{
		if ( identification == null )
			return null;
		
		StringBuilder urn = new StringBuilder();
		
		urn.append( identification.getAgencyID() );
		urn.append(":");
		urn.append( "logicalDataSet_" );
		urn.append( studyName );
		urn.append( "-" );
		urn.append( year );
		urn.append( "-" );
		urn.append( dataSetType );
		urn.append( "-" );
		urn.append( dataSetSubType );
		urn.append( ":" );
		urn.append( identification.getVersionRelease() );
		urn.append( "." );
		urn.append( identification.getVersionMinor() );
		
		return urn.toString();
	}
}
