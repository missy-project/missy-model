package org.gesis.missy.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.gesis.skos.Concept;
import org.gesis.skos.ConceptScheme;
import org.junit.Test;

import com.google.common.collect.Lists;

public class UniverseTest {

	Universe universe = new Universe();

	@Test
	public void inScheme() {
		ConceptScheme myConcept = new ConceptScheme();

		List<ConceptScheme> schemes = Lists.newArrayList( myConcept );

		this.universe.setInScheme( schemes );

		List<ConceptScheme> scheme = this.universe.getInScheme();

		assertNotNull( scheme );
		assertEquals( 1, scheme.size() );
		assertTrue( myConcept == scheme.iterator().next() );
	}

	@Test
	public void broader() {
		Concept myConcept = new Concept();

		List<Concept> broaders = Lists.newArrayList( myConcept );

		this.universe.setBroader( broaders );

		List<Concept> broader = this.universe.getBroader();

		assertNotNull( broader );
		assertEquals( 1, broader.size() );
		assertTrue( myConcept == broader.iterator().next() );
	}

	@Test
	public void narrower() {
		Concept myConcept = new Concept();

		List<Concept> narrowers = Lists.newArrayList( myConcept );

		this.universe.setNarrower( narrowers );

		List<Concept> narrower = this.universe.getNarrower();

		assertNotNull( narrower );
		assertEquals( 1, narrower.size() );
		assertTrue( myConcept == narrower.iterator().next() );
	}

}
