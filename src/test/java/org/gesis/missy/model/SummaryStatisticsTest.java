package org.gesis.missy.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.gesis.discovery.DataFile;
import org.junit.Test;

import com.google.common.collect.Lists;

public class SummaryStatisticsTest {

	SummaryStatistics summaryStatistics = new SummaryStatistics();

	@Test
	public void getVariable() {
		Variable myVariable = new Variable();

		List<org.gesis.discovery.Variable> variables = Lists.newArrayList();
		variables.add( myVariable );

		this.summaryStatistics.setStatisticsVariable( variables );

		List<org.gesis.discovery.Variable> variable = this.summaryStatistics.getStatisticsVariable();

		assertNotNull( variable );
		assertEquals( 1, variable.size() );
		assertTrue( myVariable == variable.iterator().next() );
	}

	@Test
	public void getDataFile() {
		DataFile myDataFile = new DataFile();

		List<DataFile> dataFiles = Lists.newArrayList();

		this.summaryStatistics.setStatisticsDataFile( dataFiles );

		List<DataFile> dataFile = this.summaryStatistics.getStatisticsDataFile();

		assertNotNull( dataFile );
		assertEquals( 1, dataFile.size() );
		assertTrue( myDataFile == dataFile.iterator().next() );
	}
}
