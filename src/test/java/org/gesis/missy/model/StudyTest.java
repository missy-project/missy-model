package org.gesis.missy.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.gesis.ddi.ontology.Study;
import org.gesis.foaf.Agent;
import org.junit.Test;

import com.google.common.collect.Sets;

public class StudyTest {

	Study myStudy = new Study( "aid", "oid_study", 1 );

	@Test
	public void getVariable() {
		Variable myVariable = new Variable( "aid", "oid_variable", 1 );

		Set<org.gesis.ddi.ontology.Variable> variables = new HashSet<org.gesis.ddi.ontology.Variable>();
		variables.add( myVariable );

		myStudy.setVariable( variables );

		Set<org.gesis.ddi.ontology.Variable> variable = myStudy.getVariable();

		assertNotNull( variable );
		assertEquals( 1, variable.size() );
		assertTrue( myVariable == variable.iterator().next() );
	}

	@Test
	public void getInstrument() {
		Instrument myInstrument = new Instrument( "aid", "oid_instrument", 1 );

		Set<org.gesis.ddi.ontology.Instrument> instruments = new HashSet<org.gesis.ddi.ontology.Instrument>();
		instruments.add( myInstrument );

		myStudy.setInstrument( instruments );

		Set<org.gesis.ddi.ontology.Instrument> instrument = myStudy.getInstrument();

		assertNotNull( instrument );
		assertEquals( 1, instrument.size() );
		assertTrue( myInstrument == instrument.iterator().next() );
	}

	@Test
	public void getCreator() {
		Agent myCreator = new Agent( "aid", "oid_agend", 1 );

		Set<Agent> creators = Sets.newHashSet();
		creators.add( myCreator );

		myStudy.setDcterms_creator( creators );

		Set<Agent> creator = myStudy.getDcterms_creator();

		assertNotNull( creator );
		assertEquals( 1, creator.size() );
		assertTrue( myCreator == creator.iterator().next() );
	}

	@Test
	public void getPublisher() {
		Agent myPublisher = new Agent( "aid", "oid_agend", 1 );

		Set<Agent> publishers = Sets.newHashSet();
		publishers.add( myPublisher );

		myStudy.setDcterms_publisher( publishers );

		Set<Agent> publisher = myStudy.getDcterms_publisher();

		assertNotNull( publisher );
		assertEquals( 1, publisher.size() );
		assertTrue( myPublisher == publisher.iterator().next() );
	}

	@Test
	public void getContributor() {
		Agent myContributor = new Agent( "aid", "oid_agend", 1 );

		Set<Agent> contributors = Sets.newHashSet();
		contributors.add( myContributor );

		myStudy.setDcterms_contributer( contributors );

		Set<Agent> contributor = myStudy.getDcterms_contributer();

		assertNotNull( contributor );
		assertEquals( 1, contributor.size() );
		assertTrue( myContributor == contributor.iterator().next() );
	}

}
