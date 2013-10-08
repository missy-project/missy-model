package org.gesis.missy.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.gesis.discovery.Study;
import org.gesis.foaf.Agent;
import org.junit.Test;

import com.google.common.collect.Lists;

public class StudyTest {

	Study myStudy = new Study();

	@Test
	public void getVariable() {
		Variable myVariable = new Variable();

		List<org.gesis.discovery.Variable> variables = Lists.newArrayList();
		variables.add( myVariable );

		this.myStudy.setVariable( variables );

		List<org.gesis.discovery.Variable> variable = this.myStudy.getVariable();

		assertNotNull( variable );
		assertEquals( 1, variable.size() );
		assertTrue( myVariable == variable.iterator().next() );
	}

	@Test
	public void getInstrument() {
		Instrument myInstrument = new Instrument();

		List<org.gesis.discovery.Instrument> instruments = Lists.newArrayList();
		instruments.add( myInstrument );

		this.myStudy.setInstrument( instruments );

		List<org.gesis.discovery.Instrument> instrument = this.myStudy.getInstrument();

		assertNotNull( instrument );
		assertEquals( 1, instrument.size() );
		assertTrue( myInstrument == instrument.iterator().next() );
	}

	@Test
	public void getCreator() {
		Agent myCreator = new Agent();

		List<Agent> creators = Lists.newArrayList();
		creators.add( myCreator );

		this.myStudy.setCreator( creators );

		List<Agent> creator = this.myStudy.getCreator();

		assertNotNull( creator );
		assertEquals( 1, creator.size() );
		assertTrue( myCreator == creator.iterator().next() );
	}

	@Test
	public void getPublisher() {
		Agent myPublisher = new Agent();

		List<Agent> publishers = Lists.newArrayList();
		publishers.add( myPublisher );

		this.myStudy.setPublisher( publishers );

		List<Agent> publisher = this.myStudy.getPublisher();

		assertNotNull( publisher );
		assertEquals( 1, publisher.size() );
		assertTrue( myPublisher == publisher.iterator().next() );
	}

	@Test
	public void getContributor() {
		Agent myContributor = new Agent();

		List<Agent> contributors = Lists.newArrayList();
		contributors.add( myContributor );

		this.myStudy.setContributor( contributors );

		List<Agent> contributor = this.myStudy.getContributor();

		assertNotNull( contributor );
		assertEquals( 1, contributor.size() );
		assertTrue( myContributor == contributor.iterator().next() );
	}

}
