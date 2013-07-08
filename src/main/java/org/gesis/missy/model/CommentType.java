package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.gesis.persistence.PersistableResource;

@Entity( name = "Missy_CommentType" )
public class CommentType extends PersistableResource
{

	// properties

	@Column
	private String commentType;

	// getter / setter

	public String getCommentType()
	{
		return this.commentType;
	}

	public void setCommentType( final String commentType )
	{
		this.commentType = commentType;
	}

}
