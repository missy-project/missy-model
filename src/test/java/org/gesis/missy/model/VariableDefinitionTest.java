package org.gesis.missy.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.gesis.skos.Concept;
import org.junit.Test;

import com.google.common.collect.Lists;

public class VariableDefinitionTest
{

	VariableDefinition variableDefinition = new VariableDefinition();

	@Test
	public void getUniverse()
	{
		org.gesis.discovery.Universe universe = new Universe();

		this.variableDefinition.setUniverse( Lists.newArrayList( universe ) );

		List<org.gesis.discovery.Universe> universes = this.variableDefinition.getUniverse();

		assertNotNull( universes );
		assertEquals( 1, universes.size() );
		assertTrue( universe == universes.iterator().next() );
	}

	@Test
	public void getConcept()
	{
		Concept newConcept = new Concept();

		this.variableDefinition.setConcept( newConcept );

		Concept concept = this.variableDefinition.getConcept();

		assertNotNull( newConcept );
		assertTrue( newConcept == concept );
	}
}
