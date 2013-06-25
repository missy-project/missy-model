package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.gesis.ddi.util.AbstractBaseEntity;

@Entity
public class CommentType extends AbstractBaseEntity
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
