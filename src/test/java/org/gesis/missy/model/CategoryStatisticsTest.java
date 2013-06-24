package org.gesis.missy.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.gesis.discovery.CategoryStatistics;
import org.gesis.discovery.DataFile;
import org.junit.Test;

import com.google.common.collect.Sets;

public class CategoryStatisticsTest {

	CategoryStatistics categoryStatistics = new CategoryStatistics();

	@Test
	public void getStatisticsDataFile() {
		DataFile myDataFile = new DataFile();

		Set<DataFile> dataFiles = Sets.newHashSet( myDataFile );

		this.categoryStatistics.setStatisticsDataFile( dataFiles );

		Set<DataFile> dataFile = this.categoryStatistics.getStatisticsDataFile();

		assertNotNull( dataFile );
		assertEquals( 1, dataFile.size() );
		assertTrue( myDataFile == dataFile.iterator().next() );
	}
}
