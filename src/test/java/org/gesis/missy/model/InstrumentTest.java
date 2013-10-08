package org.gesis.missy.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.gesis.discovery.Questionnaire;
import org.junit.Test;

import com.google.common.collect.Lists;

public class InstrumentTest {

	Questionnaire instrument = new Questionnaire();

	@Test
	public void question() {
		Question myQuestion = new Question();
		myQuestion.setQuestionNumber( "questionNumber" );

		List<org.gesis.discovery.Question> questions = Lists.newArrayList();
		questions.add( myQuestion );

		this.instrument.setQuestion( questions );

		List<org.gesis.discovery.Question> question = this.instrument.getQuestion();

		assertNotNull( question );
		assertEquals( 1, question.size() );

		Question nextQuestion = (Question) question.get( 0 );
		assertTrue( myQuestion == nextQuestion );

		assertEquals( "questionNumber", nextQuestion.getQuestionNumber() );
	}
}
