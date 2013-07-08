package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import org.gesis.ddi.IdentifiableImpl;

@Entity( name = "Missy_InterviewerInstruction" )
public class InterviewerInstruction extends IdentifiableImpl
{

	@Column
	private String interviewerInstruction;

	@ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	private Instrument instrument;

	@ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	private Question question;

	public String getInterviewerInstruction() {
		return this.interviewerInstruction;
	}

	public void setInterviewerInstruction(final String interviewerInstruction) {
		this.interviewerInstruction = interviewerInstruction;
	}

	public Instrument getInstrument() {
		return this.instrument;
	}

	public void setInstrument(final Instrument instrument) {
		this.instrument = instrument;
	}

	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(final Question question) {
		this.question = question;
	}

}
