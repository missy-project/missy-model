package org.gesis.missy.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.gesis.ddi.ontology.CategoryStatistics;
import org.gesis.ddi.ontology.DataFile;
import org.junit.Test;

import com.google.common.collect.Sets;

public class CategoryStatisticsTest {

	CategoryStatistics categoryStatistics = new CategoryStatistics( "aid", "oid_categoryStatistics", 1 );

	@Test
	public void getStatisticsDataFile() {
		DataFile myDataFile = new DataFile( "aid", "oid_dataFile", 1 );

		Set<DataFile> dataFiles = Sets.newHashSet( myDataFile );

		categoryStatistics.setStatisticsDataFile( dataFiles );

		Set<DataFile> dataFile = categoryStatistics.getStatisticsDataFile();

		assertNotNull( dataFile );
		assertEquals( 1, dataFile.size() );
		assertTrue( myDataFile == dataFile.iterator().next() );
	}
}
