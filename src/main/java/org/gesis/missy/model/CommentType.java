package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CommentType
{

	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE )
	private int id;

	@Column
	private String commentType;

	public int getId()
	{
		return this.id;
	}

	public void setId( final int id )
	{
		this.id = id;
	}

	public String getCommentType()
	{
		return this.commentType;
	}

	public void setCommentType( final String commentType )
	{
		this.commentType = commentType;
	}

}
