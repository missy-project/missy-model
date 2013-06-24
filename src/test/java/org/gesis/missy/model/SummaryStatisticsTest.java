package org.gesis.missy.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.gesis.discovery.DataFile;
import org.junit.Test;

import com.google.common.collect.Sets;

public class SummaryStatisticsTest {

	SummaryStatistics summaryStatistics = new SummaryStatistics();

	@Test
	public void getSummaryStatisticsType() {
		SummaryStatisticsType type = new SummaryStatisticsType();

		this.summaryStatistics.setSummaryStatisticsType( type );

		assertNotNull( this.summaryStatistics.getSummaryStatisticsType() );
		assertTrue( type == this.summaryStatistics.getSummaryStatisticsType() );
	}

	@Test
	public void getVariable() {
		Variable myVariable = new Variable();

		Set<org.gesis.discovery.Variable> variables = new HashSet<org.gesis.discovery.Variable>();
		variables.add( myVariable );

		this.summaryStatistics.setStatisticsVariable( variables );

		Set<org.gesis.discovery.Variable> variable = this.summaryStatistics.getStatisticsVariable();

		assertNotNull( variable );
		assertEquals( 1, variable.size() );
		assertTrue( myVariable == variable.iterator().next() );
	}

	@Test
	public void getDataFile() {
		DataFile myDataFile = new DataFile();

		Set<DataFile> dataFiles = Sets.newHashSet( myDataFile );

		this.summaryStatistics.setStatisticsDataFile( dataFiles );

		Set<DataFile> dataFile = this.summaryStatistics.getStatisticsDataFile();

		assertNotNull( dataFile );
		assertEquals( 1, dataFile.size() );
		assertTrue( myDataFile == dataFile.iterator().next() );
	}
}
