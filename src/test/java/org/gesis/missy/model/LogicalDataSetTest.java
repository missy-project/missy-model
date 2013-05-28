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

	LogicalDataSet dataset = new LogicalDataSet();

	@Test
	public void getAggregation() {
		DataSet myDataSet = new DataSet();

		Set<DataSet> dataSets = Sets.newHashSet( myDataSet );

		this.dataset.setDataCube( dataSets );

		Set<DataSet> dataSet = this.dataset.getAggregation();

		assertNotNull( dataSet );
		assertEquals( 1, dataSet.size() );
		assertTrue( myDataSet == dataSet.iterator().next() );
	}

	@Test
	public void getDataSetSubType() {
		DataSetSubType mySubType = new DataSetSubType();

		this.dataset.setDataSetSubType( mySubType );

		assertNotNull( this.dataset.getDataSetSubType() );
		assertTrue( mySubType == this.dataset.getDataSetSubType() );
	}

	@Test
	public void getDataSetType() {
		DataSetType myType = new DataSetType();

		this.dataset.setDataSetType( myType );

		assertNotNull( this.dataset.getDataSetType() );
		assertTrue( myType == this.dataset.getDataSetType() );
	}

	@Test
	public void getInstrument() {
		Instrument myInstrument = new Instrument();

		Set<org.gesis.ddi.ontology.Instrument> instruments = new HashSet<org.gesis.ddi.ontology.Instrument>();
		instruments.add( myInstrument );

		this.dataset.setInstrument( instruments );

		Set<org.gesis.ddi.ontology.Instrument> instrument = this.dataset.getInstrument();

		assertNotNull( instrument );
		assertEquals( 1, instrument.size() );
		assertTrue( myInstrument == instrument.iterator().next() );
	}

	@Test
	public void getUniverse() {
		Universe myUniverse = new Universe();

		this.dataset.setDataSetUniverse( myUniverse );

		org.gesis.ddi.ontology.Universe universe = this.dataset.getDataSetUniverse();

		assertNotNull( universe );
		assertTrue( myUniverse == universe );
	}

}
