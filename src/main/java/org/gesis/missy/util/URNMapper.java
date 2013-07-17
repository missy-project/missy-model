package org.gesis.missy.util;

import java.util.HashMap;
import java.util.Map;

public class URNMapper
{

	private static Map<String, String> studyNames = new HashMap<String, String>();
	private static Map<String, String> datasets = new HashMap<String, String>();
	private static Map<String, String> filetypes = new HashMap<String, String>();

	static
	{
		studyNames.put( "eusilc", "EU-SILC" );
		studyNames.put( "silc", "EU-SILC" );
		studyNames.put( "eulfs", "EU-LFS" );
		studyNames.put( "lfs", "EU-LFS" );
		studyNames.put( "evs", "EU-EVS" );
		studyNames.put( "mikrozensus", "MZ" );

		datasets.put( "panel", "panel" );
		datasets.put( "cross-sec", "cross-sectional" );
		datasets.put( "c", "cross-sectional" );

		filetypes.put( "hhr", "Household register" );
		filetypes.put( "hr", "Household register" );
		filetypes.put( "hhd", "Household data" );
		filetypes.put( "hd", "Household data" );
		filetypes.put( "pd", "Personal data" );
		filetypes.put( "pr", "Personal register" );
	}

	/**
	 * Returns the proper study name representation that is found in the URNs.
	 * 
	 * @param study
	 * @return
	 */
	public static String getURNStudyName( final String study )
	{
		return studyNames.get( study );
	}

	public static String getURNDatasetRepresentation( final String dataset )
	{
		return datasets.get( dataset );
	}

	public static String getURNFiletypeRepresentation( final String filetype )
	{
		return filetypes.get( filetype );
	}
}
