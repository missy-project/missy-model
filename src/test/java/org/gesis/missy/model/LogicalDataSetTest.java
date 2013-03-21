package org.gesis.missy.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.gesis.datacube.DataSet;
import org.junit.Test;

import com.google.common.collect.Sets;

public class LogicalDataSetTest {

	LogicalDataSet dataset = new LogicalDataSet( "aid", "oid_logicalDataSet", 1 );

	@Test
	public void getAggregation() {
		DataSet myDataSet = new DataSet( "aid", "oid_dataSet", 1 );

		Set<DataSet> dataSets = Sets.newHashSet( myDataSet );

		dataset.setDataCube( dataSets );

		Set<DataSet> dataSet = dataset.getAggregation();

		assertNotNull( dataSet );
		assertEquals( 1, dataSet.size() );
		assertTrue( myDataSet == dataSet.iterator().next() );
	}

	@Test
	public void getDataSetSubType() {
		DataSetSubType mySubType = new DataSetSubType();

		dataset.setDataSetSubType( mySubType );

		assertNotNull( dataset.getDataSetSubType() );
		assertTrue( mySubType == dataset.getDataSetSubType() );
	}

	@Test
	public void getDataSetType() {
		DataSetType myType = new DataSetType();

		dataset.setDataSetType( myType );

		assertNotNull( dataset.getDataSetType() );
		assertTrue( myType == dataset.getDataSetType() );
	}

	@Test
	public void getInstrument() {
		Instrument myInstrument = new Instrument( "aid", "oid_instrument", 1 );

		Set<org.gesis.ddi.ontology.Instrument> instruments = new HashSet<org.gesis.ddi.ontology.Instrument>();
		instruments.add( myInstrument );

		dataset.setInstrument( instruments );

		Set<org.gesis.ddi.ontology.Instrument> instrument = dataset.getInstrument();

		assertNotNull( instrument );
		assertEquals( 1, instrument.size() );
		assertTrue( myInstrument == instrument.iterator().next() );
	}

	@Test
	public void getUniverse() {
		Universe myUniverse = new Universe( "aid", "oid_universe", 1 );

		dataset.setDataSetUniverse( myUniverse );

		org.gesis.ddi.ontology.Universe universe = dataset.getDataSetUniverse();

		assertNotNull( universe );
		assertTrue( myUniverse == universe );
	}

}
