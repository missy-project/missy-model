package org.gesis.missy.util;

import org.gesis.missy.model.Identification;

/**
 * This class provides methods in order to create consistent URNs in a
 * convenient way.
 *
 * @author matthaeus
 *
 */
public class URNFactory
{

	/**
	 * Creates the URN for LogicalDataSet.
	 *
	 * @param identification
	 * @param studyName
	 * @param year
	 * @param dataSetType
	 * @param dataSetSubType
	 * @return
	 */
	public static String createLogicalDataSetURN( final Identification identification, final String studyName, final String year, final String dataSetType, final String dataSetSubType )
	{
		if ( identification == null )
			return null;

		final StringBuilder urn = new StringBuilder();

		urn.append( createURNPrefix( identification, "logicalDataSet" ) );
		urn.append( studyName );
		urn.append( "-" );
		urn.append( year );
		urn.append( "-" );
		urn.append( dataSetType );
		urn.append( "-" );
		urn.append( dataSetSubType );
		urn.append( createURNSuffix( identification ) );

		return urn.toString();
	}

	/**
	 * Creates the URN for Study.
	 *
	 * @param identification
	 * @param studyName
	 * @param year
	 * @return
	 */
	public static String createStudyURN( final Identification identification, final String studyName, final String year )
	{
		if ( identification == null )
			return null;

		final StringBuilder urn = new StringBuilder();

		urn.append( createURNPrefix( identification, "study" ) );
		urn.append( studyName );
		urn.append( "-" );
		urn.append( year );
		urn.append( createURNSuffix( identification ) );

		return urn.toString();
	}

	/**
	 * Creates the URN for Variable.
	 *
	 * @param identification
	 * @param studyName
	 * @param year
	 * @param dataSetType
	 * @param dataSetSubType
	 * @param dataSetVersion
	 * @param variableName
	 * @return
	 */
	public static String createVariableURN( final Identification identification, final String studyName, final String year, final String dataSetType, final String dataSetSubType, final String dataSetVersion, final String variableName )
	{
		if ( identification == null )
			return null;

		final StringBuilder urn = new StringBuilder();

		urn.append( createURNPrefix( identification, "variable" ) );
		urn.append( studyName );
		urn.append( "-" );
		urn.append( year );
		urn.append( "-" );
		urn.append( dataSetType );
		urn.append( "-" );
		urn.append( dataSetSubType );
		urn.append( "-" );
		urn.append( dataSetVersion );
		urn.append( "-" );
		urn.append( variableName );
		urn.append( createURNSuffix( identification ) );

		return urn.toString();
	}

	/**
	 * Creates the URN for Concept.
	 *
	 * @param identification
	 * @param nextSequenceNumber
	 * @return
	 */
	public static String createConceptURN( final Identification identification, final int nextSequenceNumber )
	{
		if ( nextSequenceNumber == -1 )
			return null;

		final StringBuilder urn = new StringBuilder();

		urn.append( createURNPrefix( identification, "concept" ) );
		urn.append( nextSequenceNumber );
		urn.append( createURNSuffix( identification ) );

		return urn.toString();
	}

	public static String createURNPrefix( final Identification identification, final String className )
	{
		return identification.getAgencyID() + ":" + className + "_";
	}

	public static String createURNSuffix( final Identification identification )
	{
		return ":" + identification.getVersionRelease() + "." + identification.getVersionMinor();
	}
}
