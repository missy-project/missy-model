package org.gesis.missy.util;

import org.gesis.ddi.util.IdentifierFactory;
import org.gesis.missy.model.Identification;
import org.gesis.persistence.PersistableResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class provides methods in order to create consistent URNs in a
 * convenient way.
 *
 * @author matthaeus
 *
 */
public class URNFactory
{

	public final static String urnDdiPrefix = "urn:ddi";

	private final static Logger log = LoggerFactory.getLogger( URNFactory.class );

	/**
	 * Creates a URN of this form:
	 * "urn:ddi:Agency-ID:Object-ID:Version-Release.Version-Minor", with a
	 * freshly created UUID as Object-ID.
	 * 
	 * @param identification
	 * @return
	 */
	public static String createUUIDURN( final Identification identification )
	{
		if ( identification == null )
			return null;

		final StringBuilder urn = new StringBuilder();

		urn.append( createURNPrefix( identification ) );
		urn.append( IdentifierFactory.getNextDefaultIdentifier() );
		urn.append( createURNSuffix( identification ) );

		return urn.toString();
	}

	/**
	 * Creates a URN of this form:
	 * "urn:ddi:Agency-ID:Object-ID:Version-Release.Version-Minor", where the
	 * Object-ID is set to the id of <i>persistableResource</i>. For example,
	 * with the id being "1abc" of <i>persistableResource</i>, the URN will
	 * become <AgencyID>:1abc:<Version-Release>.<Version-Minor>.
	 * 
	 * @param persistableResource
	 * @param identification
	 * @return
	 */
	public static <T extends PersistableResource> String createUUIDURN( final T persistableResource, final Identification identification )
	{
		if ( identification == null )
			return null;

		if ( persistableResource == null )
			return null;

		final StringBuilder urn = new StringBuilder();

		urn.append( createURNPrefix( identification ) );
		urn.append( persistableResource.getId() );
		urn.append( createURNSuffix( identification ) );

		return urn.toString();
	}

	/**
	 * @param persistableResource
	 * @param identification
	 * @return
	 */
	public static <T extends PersistableResource> T createAndSetUUIDURN( final T persistableResource, final Identification identification )
	{
		String urn = createUUIDURN( persistableResource, identification );

		if ( urn == null )
		{
			log.warn( "Something went wrong. urn is null. Cannot set urn for object." );
			return persistableResource;
		}

		persistableResource.setURN( urn );

		return persistableResource;

	}

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
	public static String createLogicalDataSetURN( final Identification identification, final String studyName, final String year, String dataSetType, String dataSetSubType, final String dataSetVersion )
	{
		if ( identification == null )
			return null;

		final StringBuilder urn = new StringBuilder();

		urn.append( createURNPrefix( identification, "logicalDataSet" ) );
		urn.append( studyName );
		urn.append( "-" );
		urn.append( year );
		urn.append( "-" );

		if ( dataSetType == null )
			dataSetType = "";

		if ( dataSetSubType == null )
			dataSetSubType = "";

		urn.append( dataSetType );
		urn.append( "-" );
		urn.append( dataSetSubType );
		urn.append( "-" );
		urn.append( dataSetVersion );
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
	 * Creates the URN for Universe.
	 * 
	 * @param identification
	 * @param studyName
	 * @param year
	 * @return
	 */
	public static String createUniverseURN( final Identification identification, final String studyName, final String year )
	{
		if ( identification == null )
			return null;

		final StringBuilder urn = new StringBuilder();

		urn.append( createURNPrefix( identification, "universe" ) );
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
	public static String createVariableURN( final Identification identification, final String studyName, final String year, String dataSetType, String dataSetSubType, final String dataSetVersion, final String variableName )
	{
		if ( identification == null )
			return null;

		if ( variableName == null )
			return null;

		final StringBuilder urn = new StringBuilder();

		urn.append( createURNPrefix( identification, "variable" ) );
		urn.append( studyName );
		urn.append( "-" );
		urn.append( year );
		urn.append( "-" );

		if ( dataSetType == null )
			dataSetType = "";

		if ( dataSetSubType == null )
			dataSetSubType = "";

		urn.append( dataSetType );
		urn.append( "-" );
		urn.append( dataSetSubType );
		urn.append( "-" );
		urn.append( dataSetVersion );
		urn.append( "-" );
		urn.append( variableName.trim() );
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

	/**
	 * @param identification
	 * @param variableName
	 * @return
	 */
	public static String createConceptSchemeURN( final Identification identification, final String variableName )
	{
		if ( identification == null )
			return null;

		final StringBuilder urn = new StringBuilder();

		urn.append( createURNPrefix( identification, "conceptScheme" ) );
		urn.append( variableName );
		urn.append( createURNSuffix( identification ) );

		return urn.toString();
	}

	/**
	 * @param identification
	 * @param nextSequenceNumber
	 * @return
	 */
	public static String createListURN( final Identification identification, final int nextSequenceNumber )
	{
		if ( nextSequenceNumber == -1 )
			return null;

		final StringBuilder urn = new StringBuilder();

		urn.append( createURNPrefix( identification, "list" ) );
		urn.append( nextSequenceNumber );
		urn.append( createURNSuffix( identification ) );

		return urn.toString();
	}

	public static String createURNPrefix( final Identification identification )
	{
		return urnDdiPrefix + ":" + identification.getAgencyID() + ":";
	}

	public static String createURNPrefix( final Identification identification, final String className )
	{
		return urnDdiPrefix + ":" + identification.getAgencyID() + ":" + className + "_";
	}

	public static String createURNSuffix( final Identification identification )
	{
		return ":" + identification.getVersionRelease() + "." + identification.getVersionMinor();
	}
}
