package org.gesis.missy.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.gesis.ddi.ontology.Universe;
import org.gesis.skos.Concept;
import org.junit.Test;

import com.google.common.collect.Sets;

public class VariableDefinitionTest {

	VariableDefinition variableDefinition = new VariableDefinition( "aid", "oid_dataElement", 1 );

	@Test
	public void getUniverse() {
		Universe universe = new Universe( "aid", "oid_universe", 1 );

		variableDefinition.setUniverse( Sets.newHashSet( universe ) );

		Set<Universe> universes = variableDefinition.getUniverse();

		assertNotNull( universes );
		assertEquals( 1, universes.size() );
		assertTrue( universe == universes.iterator().next() );
	}

	@Test
	public void getConcept() {
		Concept newConcept = new Concept( "aid", "oid_concept", 1 );

		variableDefinition.setConcept( newConcept );

		Concept concept = variableDefinition.getConcept();

		assertNotNull( newConcept );
		assertTrue( newConcept == concept );
	}
}
