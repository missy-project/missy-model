package org.gesis.missy.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.gesis.discovery.Questionnaire;
import org.junit.Test;

public class InstrumentTest {

	Questionnaire instrument = new Questionnaire();

	@Test
	public void question() {
		Question myQuestion = new Question();
		myQuestion.setQuestionNumber( "questionNumber" );

		Set<org.gesis.discovery.Question> questions = new HashSet<org.gesis.discovery.Question>();
		questions.add( myQuestion );

		this.instrument.setQuestion( questions );

		Set<org.gesis.discovery.Question> question = this.instrument.getQuestion();

		assertNotNull( question );
		assertEquals( 1, question.size() );

		Question nextQuestion = (Question) question.iterator().next();
		assertTrue( myQuestion == nextQuestion );

		assertEquals( "questionNumber", nextQuestion.getQuestionNumber() );
	}
}
