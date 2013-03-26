package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.gesis.ddi.Note;
import org.gesis.rdf.LangString;

@Entity
public class Comment extends Note {

	// properties

	@Column
	private LangString comment;

	@Column
	private LangString authors;

	// relations

	@ManyToOne(optional = true)
	private CommentType commentType;

	// getter/setter

	public Comment( final String agencyId, final String objectId, final int majorVersion )
	{
		super( agencyId, objectId, majorVersion );
	}

	public LangString getComment()
	{
		return this.comment;
	}

	public void setComment( final LangString comment )
	{
		this.comment = comment;
	}

	public LangString getAuthors()
	{
		return this.authors;
	}

	public void setAuthors( final LangString authors )
	{
		this.authors = authors;
	}

	public CommentType getCommentType() {
		return this.commentType;
	}

	public void setCommentType(final CommentType commentType) {
		this.commentType = commentType;
	}

}
