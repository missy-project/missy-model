package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.gesis.ddi.Note;
import org.gesis.rdf.LangString;

@Entity( name = "Missy_" )
public class Comment extends Note
{

	// properties

	@OneToOne( cascade = CascadeType.ALL )
	private LangString comment;

	@Column
	private String author;

	// relations

	@ManyToOne
	@JoinColumn( name = "commentType_id" )
	private CommentType commentType;

	// getter/setter

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

	public CommentType getCommentType()
	{
		return this.commentType;
	}

	public void setCommentType( final CommentType commentType )
	{
		this.commentType = commentType;
	}

}
