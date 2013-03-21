package org.gesis.missy.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.gesis.ddi.ontology.DataFile;
import org.junit.Test;

import com.google.common.collect.Sets;

public class SummaryStatisticsTest {

	SummaryStatistics summaryStatistics = new SummaryStatistics( "aid", "oid_ss", 1 );

	@Test
	public void getSummaryStatisticsType() {
		SummaryStatisticsType type = new SummaryStatisticsType();

		summaryStatistics.setSummaryStatisticsType( type );

		assertNotNull( summaryStatistics.getSummaryStatisticsType() );
		assertTrue( type == summaryStatistics.getSummaryStatisticsType() );
	}

	@Test
	public void getVariable() {
		Variable myVariable = new Variable( "aid", "oid_variable", 1 );

		Set<org.gesis.ddi.ontology.Variable> variables = new HashSet<org.gesis.ddi.ontology.Variable>();
		variables.add( myVariable );

		summaryStatistics.setStatisticsVariable( variables );

		Set<org.gesis.ddi.ontology.Variable> variable = summaryStatistics.getStatisticsVariable();

		assertNotNull( variable );
		assertEquals( 1, variable.size() );
		assertTrue( myVariable == variable.iterator().next() );
	}

	@Test
	public void getDataFile() {
		DataFile myDataFile = new DataFile( "aid", "oid_dataFile", 1 );

		Set<DataFile> dataFiles = Sets.newHashSet( myDataFile );

		summaryStatistics.setStatisticsDataFile( dataFiles );

		Set<DataFile> dataFile = summaryStatistics.getStatisticsDataFile();

		assertNotNull( dataFile );
		assertEquals( 1, dataFile.size() );
		assertTrue( myDataFile == dataFile.iterator().next() );
	}
}
