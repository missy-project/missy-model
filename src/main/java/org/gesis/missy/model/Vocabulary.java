package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Vocabulary extends Message
{

	// properties

	@Column( length = 16 )
	private String elementType;

	@Column
	private Boolean inEusilc = false;

	@Column
	private Boolean inEulfs = false;

	@Column
	private int index = -1;

	@Column( length = 32 )
	private String value;

	// relations

	// getter / setter

	public String getElementType()
	{
		return elementType;
	}

	public void setElementType( final String element_type )
	{
		this.elementType = element_type;
	}

	public Boolean isInEusilc()
	{
		return inEusilc;
	}

	public void setInEusilc( final Boolean eusilc )
	{
		this.inEusilc = eusilc;
	}

	public Boolean isInEulfs()
	{
		return inEulfs;
	}

	public void setInEulfs( final Boolean eulfs )
	{
		this.inEulfs = eulfs;
	}

	public int getIndex()
	{
		return index;
	}

	public void setIndex( final int index )
	{
		this.index = index;
	}

	public String getValue()
	{
		return value;
	}

	public void setValue( final String value )
	{
		this.value = value;
	}

}
