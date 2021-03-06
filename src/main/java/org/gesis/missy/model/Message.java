package org.gesis.missy.model;

import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;

import org.apache.commons.lang.StringUtils;
import org.gesis.ddi.util.Locales;
import org.gesis.persistence.PersistableResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
public class Message extends PersistableResource
{

	private static Logger log = LoggerFactory.getLogger( Message.class );

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

	public Message( final String key, final Locale locale, final String value )
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

		this.messageKey = key;
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

		// try to match the locale
		if ( Locales.isEqual( Locales.UNITED_KINGDOM, locale ) )
			return this.uk;

		else if ( Locales.isEqual( Locales.GERMANY, locale ) )
		{
			// return german but only is not empty
			if ( StringUtils.isEmpty( this.de ) )
			{
				log.warn( "No value for locale 'de' with key '" + this.messageKey + "' found. Falling back to uk." );
				return this.uk;
			}
			else
				return this.de;
		}
		else if ( Locales.isEqual( Locales.FRANCE, locale ) )
			// return french but only is not empty
			if ( StringUtils.isEmpty( this.fr ) )
			{
				log.warn( "No value for locale 'fr' with key '" + this.messageKey + "' found. Falling back to uk." );
				return this.uk;
			}
			else
				return this.fr;

		return "";
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
	public static Message createMessage( final String key, final Locale locale, final String value )
	{
		if ( key == null || locale == null || value == null )
			return null;

		return new Message( key, locale, value );
	}

}
