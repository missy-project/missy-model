package org.gesis.missy.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.gesis.ddi.ontology.AnalysisUnit;
import org.gesis.skos.Concept;
import org.junit.Test;

import com.google.common.collect.Sets;

public class VariableTest {

	Variable variable = new Variable( "aid", "oid_variable", 1 );

	@Test
	public void getAnalysisUnit() {
		AnalysisUnit myAnalysisUnit = new AnalysisUnit( "aid", "oid_analysisUnit", 1 );

		variable.setAnalysisUnit( myAnalysisUnit );

		AnalysisUnit analysisUnit = variable.getAnalysisUnit();

		assertNotNull( analysisUnit );
		assertTrue( myAnalysisUnit == analysisUnit );
	}

	@Test
	public void getConcept() {
		Concept myConcept = new Concept( "aid", "oid_concept", 1 );

		variable.setConcept( myConcept );

		Concept concept = variable.getConcept();

		assertNotNull( concept );
		assertTrue( myConcept == concept );

	}

	@Test
	public void getVariableDefinition() {
		VariableDefinition myDataElement = new VariableDefinition( "aid", "oid_dataElement", 1 );

		variable.setBasedOn( myDataElement );

		org.gesis.ddi.ontology.VariableDefinition dataElement = variable.getBasedOn();

		assertNotNull( dataElement );
		assertTrue( myDataElement == dataElement );

	}

	@Test
	public void getQuestion() {
		Question myQuestion = new Question( "aid", "oid_question", 1 );

		Set<org.gesis.ddi.ontology.Question> questions = Sets.newHashSet();
		questions.add( myQuestion );

		variable.setQuestion( questions );

		Set<org.gesis.ddi.ontology.Question> question = variable.getQuestion();

		assertNotNull( question );
		assertEquals( 1, question.size() );
		assertTrue( myQuestion == question.iterator().next() );
	}

	@Test
	public void getUniverse() {
		Universe myUniverse = new Universe( "aid", "oid_universe", 1 );

		variable.setUniverse( myUniverse );

		org.gesis.ddi.ontology.Universe universe = variable.getUniverse();

		assertNotNull( universe );
		assertTrue( myUniverse == universe );
	}
}
