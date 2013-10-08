package org.gesis.missy.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.gesis.skos.Concept;
import org.gesis.skos.ConceptScheme;
import org.junit.Test;

import com.google.common.collect.Lists;

public class ConceptTest {

	Concept concept = new Concept();

	@Test
	public void inScheme() {
		ConceptScheme myConcept = new ConceptScheme();

		List<ConceptScheme> schemes = Lists.newArrayList( myConcept );

		this.concept.setInScheme( schemes );

		List<ConceptScheme> scheme = this.concept.getInScheme();

		assertNotNull( scheme );
		assertEquals( 1, scheme.size() );
		assertTrue( myConcept == scheme.iterator().next() );
	}

	@Test
	public void broader() {
		Concept myConcept = new Concept();

		List<Concept> broaders = Lists.newArrayList( myConcept );

		this.concept.setBroader( broaders );

		List<Concept> broader = this.concept.getBroader();

		assertNotNull( broader );
		assertEquals( 1, broader.size() );
		assertTrue( myConcept == broader.iterator().next() );
	}

	@Test
	public void narrower() {
		Concept myConcept = new Concept();

		List<Concept> narrowers = Lists.newArrayList( myConcept );

		this.concept.setNarrower( narrowers );

		List<Concept> narrower = this.concept.getNarrower();

		assertNotNull( narrower );
		assertEquals( 1, narrower.size() );
		assertTrue( myConcept == narrower.iterator().next() );
	}
}
