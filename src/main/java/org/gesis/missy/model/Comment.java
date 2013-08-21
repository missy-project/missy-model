package org.gesis.missy.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

import org.gesis.persistence.PersistableResource;
import org.gesis.rdf.LangString;

@Entity( name = "Missy_Comment" )
public class Comment extends PersistableResource
{

	// properties

	@OneToOne( cascade = CascadeType.ALL )
	private LangString comment;

	@Column
	private String author;

	// relations

	@Enumerated( EnumType.STRING )
	@Column
	private CommentType commentType;

	// getter/setter

	public LangString getComment()
	{
		return comment;
	}

	public void setComment( final LangString comment )
	{
		this.comment = comment;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor( final String author )
	{
		this.author = author;
	}

	public CommentType getCommentType()
	{
		return commentType;
	}

	public void setCommentType( final CommentType commentType )
	{
		this.commentType = commentType;
	}

}
