package org.gesis.missy.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.gesis.discovery.CategoryStatistics;
import org.gesis.discovery.DataFile;
import org.junit.Test;

import com.google.common.collect.Lists;

public class CategoryStatisticsTest {

	CategoryStatistics categoryStatistics = new CategoryStatistics();

	@Test
	public void getStatisticsDataFile() {
		DataFile myDataFile = new DataFile();

		List<DataFile> dataFiles = Lists.newArrayList( myDataFile );

		this.categoryStatistics.setStatisticsDataFile( dataFiles );

		List<DataFile> dataFile = this.categoryStatistics.getStatisticsDataFile();

		assertNotNull( dataFile );
		assertEquals( 1, dataFile.size() );
		assertTrue( myDataFile == dataFile.iterator().next() );
	}
}
