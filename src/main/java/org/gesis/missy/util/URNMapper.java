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
		datasets.put( "cross-sec", "cross-sec" );
		datasets.put( "c", "cross-sec" );

		filetypes.put( "hh-reg", "hh-reg" );
		filetypes.put( "hh-data", "hh-data" );
		filetypes.put( "p-data", "p-data" );
		filetypes.put( "p-reg", "p-reg" );

		filetypes.put( "HH", "hh-reg" );
		filetypes.put( "HD", "hh-data" );
		filetypes.put( "PD", "p-data" );
		filetypes.put( "PR", "p-reg" );
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
