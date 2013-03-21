package org.gesis.missy.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.gesis.skos.Concept;
import org.gesis.skos.ConceptScheme;
import org.junit.Test;

import com.google.common.collect.Sets;

public class ConceptTest {

	Concept concept = new Concept( "aid", "oid_concept", 1 );

	@Test
	public void inScheme() {
		ConceptScheme myConcept = new ConceptScheme( "aid", "oid_conceptScheme", 1 );

		Set<ConceptScheme> schemes = Sets.newHashSet( myConcept );

		concept.setSkos_inScheme( schemes );

		Set<ConceptScheme> scheme = concept.getSkos_inScheme();

		assertNotNull( scheme );
		assertEquals( 1, scheme.size() );
		assertTrue( myConcept == scheme.iterator().next() );
	}

	@Test
	public void broader() {
		Concept myConcept = new Concept( "aid", "oid_concept", 1 );

		Set<Concept> broaders = Sets.newHashSet( myConcept );

		concept.setSkos_broader( broaders );

		Set<Concept> broader = concept.getSkos_broader();

		assertNotNull( broader );
		assertEquals( 1, broader.size() );
		assertTrue( myConcept == broader.iterator().next() );
	}

	@Test
	public void narrower() {
		Concept myConcept = new Concept( "aid", "oid_concept", 1 );

		Set<Concept> narrowers = Sets.newHashSet( myConcept );

		concept.setSkos_narrower( narrowers );

		Set<Concept> narrower = concept.getSkos_narrower();

		assertNotNull( narrower );
		assertEquals( 1, narrower.size() );
		assertTrue( myConcept == narrower.iterator().next() );
	}
}
