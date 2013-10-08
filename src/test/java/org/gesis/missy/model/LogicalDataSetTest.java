package org.gesis.missy.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.gesis.datacube.DataSet;
import org.junit.Test;

import com.google.common.collect.Lists;

public class LogicalDataSetTest {

	LogicalDataSet dataset = new LogicalDataSet();

	@Test
	public void getAggregation() {
		DataSet myDataSet = new DataSet();

		List<DataSet> dataSets = Lists.newArrayList( myDataSet );

		this.dataset.setDataCube( dataSets );

		List<DataSet> dataSet = this.dataset.getAggregation();

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

		List<org.gesis.discovery.Instrument> instruments = Lists.newArrayList();
		instruments.add( myInstrument );

		this.dataset.setInstrument( instruments );

		List<org.gesis.discovery.Instrument> instrument = this.dataset.getInstrument();

		assertNotNull( instrument );
		assertEquals( 1, instrument.size() );
		assertTrue( myInstrument == instrument.iterator().next() );
	}

	@Test
	public void getUniverse() {
		Universe myUniverse = new Universe();

		this.dataset.setUniverse( myUniverse );

		org.gesis.discovery.Universe universe = this.dataset.getUniverse();

		assertNotNull( universe );
		assertTrue( myUniverse == universe );
	}

}
