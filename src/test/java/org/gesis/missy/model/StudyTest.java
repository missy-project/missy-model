package org.gesis.missy.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.gesis.discovery.Study;
import org.gesis.foaf.Agent;
import org.junit.Test;

import com.google.common.collect.Sets;

public class StudyTest {

	Study myStudy = new Study();

	@Test
	public void getVariable() {
		Variable myVariable = new Variable();

		Set<org.gesis.discovery.Variable> variables = new HashSet<org.gesis.discovery.Variable>();
		variables.add( myVariable );

		this.myStudy.setVariable( variables );

		Set<org.gesis.discovery.Variable> variable = this.myStudy.getVariable();

		assertNotNull( variable );
		assertEquals( 1, variable.size() );
		assertTrue( myVariable == variable.iterator().next() );
	}

	@Test
	public void getInstrument() {
		Instrument myInstrument = new Instrument();

		Set<org.gesis.discovery.Instrument> instruments = new HashSet<org.gesis.discovery.Instrument>();
		instruments.add( myInstrument );

		this.myStudy.setInstrument( instruments );

		Set<org.gesis.discovery.Instrument> instrument = this.myStudy.getInstrument();

		assertNotNull( instrument );
		assertEquals( 1, instrument.size() );
		assertTrue( myInstrument == instrument.iterator().next() );
	}

	@Test
	public void getCreator() {
		Agent myCreator = new Agent();

		Set<Agent> creators = Sets.newHashSet();
		creators.add( myCreator );

		this.myStudy.setCreator( creators );

		Set<Agent> creator = this.myStudy.getCreator();

		assertNotNull( creator );
		assertEquals( 1, creator.size() );
		assertTrue( myCreator == creator.iterator().next() );
	}

	@Test
	public void getPublisher() {
		Agent myPublisher = new Agent();

		Set<Agent> publishers = Sets.newHashSet();
		publishers.add( myPublisher );

		this.myStudy.setPublisher( publishers );

		Set<Agent> publisher = this.myStudy.getPublisher();

		assertNotNull( publisher );
		assertEquals( 1, publisher.size() );
		assertTrue( myPublisher == publisher.iterator().next() );
	}

	@Test
	public void getContributor() {
		Agent myContributor = new Agent();

		Set<Agent> contributors = Sets.newHashSet();
		contributors.add( myContributor );

		this.myStudy.setContributer( contributors );

		Set<Agent> contributor = this.myStudy.getContributer();

		assertNotNull( contributor );
		assertEquals( 1, contributor.size() );
		assertTrue( myContributor == contributor.iterator().next() );
	}

}
