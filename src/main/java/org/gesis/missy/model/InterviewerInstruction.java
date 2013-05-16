package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import org.gesis.ddi.Identifiable;

@Entity
public class InterviewerInstruction extends Identifiable {

	@Column
	private String interviewerInstruction;

	@ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	private Instrument instrument;

	@ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	private Question question;

	public InterviewerInstruction( String agencyId, String objectId, int majorVersion )
	{
		super( agencyId, objectId, majorVersion );
	}

	public String getInterviewerInstruction() {
		return interviewerInstruction;
	}

	public void setInterviewerInstruction(String interviewerInstruction) {
		this.interviewerInstruction = interviewerInstruction;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

}
