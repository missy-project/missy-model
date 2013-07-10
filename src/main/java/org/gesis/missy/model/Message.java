package org.gesis.missy.model;

import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;

import org.gesis.ddi.util.Locales;
import org.gesis.persistence.PersistableResource;

@Entity
public class Message extends PersistableResource
{

	@Column( unique = true, name = "message_key" )
	private String messageKey;

	@Column
	@Lob
	private String de = null;

	@Column
	@Lob
	private String uk = null;

	@Column
	@Lob
	private String fr = null;

	public Message()
	{

	}

	public Message( final Locale locale, final String value )
	{
		if ( locale == null )
			return;

		if ( value == null || value.isEmpty() )
			return;

		// first try to match to own fields
		if ( Locales.isEqual( Locales.GERMANY, locale ) )
			this.de = value;
		else if ( Locales.isEqual( Locales.UNITED_KINGDOM, locale ) )
			this.uk = value;
		else if ( Locales.isEqual( Locales.FRANCE, locale ) )
			this.fr = value;
	}

	public String getMessageKey()
	{
		return this.messageKey;
	}

	public Message setMessageKey( final String messageKey )
	{
		this.messageKey = messageKey;
		return this;
	}

	public String getDe()
	{
		return this.de;
	}

	public Message setDe( final String de )
	{
		this.de = de;
		return this;
	}

	public String getUk()
	{
		return this.uk;
	}

	public Message setUk( final String uk )
	{
		this.uk = uk;
		return this;
	}

	public String getFr()
	{
		return this.fr;
	}

	public Message setFr( final String fr )
	{
		this.fr = fr;
		return this;
	}

	/**
	 * Returns the corresponding value to the passed <i>locale</i>.
	 * 
	 * @param locale
	 * @return
	 */
	public String getValue( final Locale locale )
	{
		if ( locale == null )
			return null;

		// first try to match from own fields
		if ( Locales.isEqual( Locales.UNITED_KINGDOM, locale ) )
			return this.uk;
		else if ( Locales.isEqual( Locales.GERMANY, locale ) )
			return this.de;
		else if ( Locales.isEqual( Locales.FRANCE, locale ) )
			return this.fr;

		return null;
	}

	/**
	 * Factory-method for a Message object.
	 * 
	 * @return
	 */
	public static Message createMessage()
	{
		return new Message();
	}

	/**
	 * Factory-method for a Message object with the provided locale.
	 * 
	 * @param locale
	 * @param value
	 * @return
	 */
	public static Message createMessage( final Locale locale, final String value )
	{
		if ( locale == null || value == null )
			return null;

		return new Message( locale, value );
	}

}
