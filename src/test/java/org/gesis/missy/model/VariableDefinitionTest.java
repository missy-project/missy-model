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

	VariableDefinition variableDefinition = new VariableDefinition();

	@Test
	public void getUniverse() {
		Universe universe = new Universe();

		this.variableDefinition.setUniverse( Sets.newHashSet( universe ) );

		Set<Universe> universes = this.variableDefinition.getUniverse();

		assertNotNull( universes );
		assertEquals( 1, universes.size() );
		assertTrue( universe == universes.iterator().next() );
	}

	@Test
	public void getConcept() {
		Concept newConcept = new Concept();

		this.variableDefinition.setConcept( newConcept );

		Concept concept = this.variableDefinition.getConcept();

		assertNotNull( newConcept );
		assertTrue( newConcept == concept );
	}
}
