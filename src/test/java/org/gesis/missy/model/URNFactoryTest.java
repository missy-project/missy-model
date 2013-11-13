package org.gesis.missy.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.gesis.missy.util.URNFactory;
import org.gesis.rdfs.Resource;
import org.junit.Before;
import org.junit.Test;

public class URNFactoryTest
{

	private Identification identification;

	@Before
	public void init()
	{
		identification = Identification.create( "de.gesis", "1", "2" );
	}

	@Test
	public void createUUIDURN()
	{
		String urn = URNFactory.createUUIDURN( identification );
		assertNotNull( urn );

		String[] urnParts = urn.split( ":" );
		assertEquals( 5, urnParts.length );
		assertEquals( "urn", urnParts[0] );
		assertEquals( "ddi", urnParts[1] );
		assertEquals( "de.gesis", urnParts[2] );
		// urn is generic and cannot be tested on equality
		assertNotNull( urnParts[3] );
		assertEquals( "1.2", urnParts[4] );
	}

	@Test
	public void createAndSetUUIDURN()
	{
		Resource resource = URNFactory.createAndSetUUIDURN( new Resource(), identification );
		assertNotNull( resource );

		String urn = resource.getURN();

		String[] urnParts = urn.split( ":" );
		assertEquals( 5, urnParts.length );
		assertEquals( "urn", urnParts[0] );
		assertEquals( "ddi", urnParts[1] );
		assertEquals( "de.gesis", urnParts[2] );
		// urn is generic and cannot be tested on equality
		assertNotNull( urnParts[3] );
		assertEquals( "1.2", urnParts[4] );
	}

	@Test
	public void getStudyURN()
	{
		final String urn = URNFactory.createStudyURN( identification, "EU-SILC", "2002" );
		assertNotNull( urn );
		assertEquals( "urn:ddi:de.gesis:study_EU-SILC-2002:1.2", urn );
	}

	@Test
	public void getVariableURN()
	{
		final String urn = URNFactory.createVariableURN( identification, "EU-SILC", "2002", "panel", "hhd", "2002-1", "DB060" );
		assertNotNull( urn );
		assertEquals( "urn:ddi:de.gesis:variable_EU-SILC-2002-panel-hhd-2002-1-DB060:1.2", urn );

	}

	@Test
	public void getLogicalDataSetURN()
	{
		final String urn = URNFactory.createLogicalDataSetURN( identification, "EU-SILC", "2002", "panel", "hhd", "2002-1" );
		assertNotNull( urn );
		assertEquals( "urn:ddi:de.gesis:logicalDataSet_EU-SILC-2002-panel-hhd-2002-1:1.2", urn );

	}

	@Test
	public void getConceptURN()
	{
		final String urn = URNFactory.createConceptURN( identification, 1 );
		assertNotNull( urn );
		assertEquals( "urn:ddi:de.gesis:concept_1:1.2", urn );
	}

	@Test
	public void getConceptSchemeURN()
	{
		final String urn = URNFactory.createConceptSchemeURN( identification, "PB100" );
		assertNotNull( urn );
		assertEquals( "urn:ddi:de.gesis:conceptScheme_PB100:1.2", urn );
	}
}
