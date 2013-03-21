package org.gesis.missy.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.gesis.ddi.ontology.Questionnaire;
import org.junit.Test;

public class InstrumentTest {

	Questionnaire instrument = new Questionnaire( "aid", "oid_questionnaire", 1 );

	@Test
	public void question() {
		Question myQuestion = new Question( "aid", "oid_question", 1 );
		myQuestion.setQuestionNumber( "questionNumber" );

		Set<org.gesis.ddi.ontology.Question> questions = new HashSet<org.gesis.ddi.ontology.Question>();
		questions.add( myQuestion );

		instrument.setQuestion( questions );

		Set<org.gesis.ddi.ontology.Question> question = instrument.getQuestion();

		assertNotNull( question );
		assertEquals( 1, question.size() );

		Question nextQuestion = (Question) question.iterator().next();
		assertTrue( myQuestion == nextQuestion );

		assertEquals( "questionNumber", nextQuestion.getQuestionNumber() );
	}
}
