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
	private String author;

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

	public String getAuthor()
	{
		return this.author;
	}

	public void setAuthor( final String author )
	{
		this.author = author;
	}

	public CommentType getCommentType() {
		return this.commentType;
	}

	public void setCommentType(final CommentType commentType) {
		this.commentType = commentType;
	}

}
