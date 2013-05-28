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

	Concept concept = new Concept();

	@Test
	public void inScheme() {
		ConceptScheme myConcept = new ConceptScheme();

		Set<ConceptScheme> schemes = Sets.newHashSet( myConcept );

		this.concept.setSkos_inScheme( schemes );

		Set<ConceptScheme> scheme = this.concept.getSkos_inScheme();

		assertNotNull( scheme );
		assertEquals( 1, scheme.size() );
		assertTrue( myConcept == scheme.iterator().next() );
	}

	@Test
	public void broader() {
		Concept myConcept = new Concept();

		Set<Concept> broaders = Sets.newHashSet( myConcept );

		this.concept.setSkos_broader( broaders );

		Set<Concept> broader = this.concept.getSkos_broader();

		assertNotNull( broader );
		assertEquals( 1, broader.size() );
		assertTrue( myConcept == broader.iterator().next() );
	}

	@Test
	public void narrower() {
		Concept myConcept = new Concept();

		Set<Concept> narrowers = Sets.newHashSet( myConcept );

		this.concept.setSkos_narrower( narrowers );

		Set<Concept> narrower = this.concept.getSkos_narrower();

		assertNotNull( narrower );
		assertEquals( 1, narrower.size() );
		assertTrue( myConcept == narrower.iterator().next() );
	}
}
