package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.gesis.persistence.PersistableResource;

/**
 * @author matthaeus
 * 
 */
@Entity( name = "Missy_TargetSampleSize" )
public class TargetSampleSize extends PersistableResource
{

	// properties

	@Enumerated( EnumType.STRING )
	@Column( length = 16 )
	private TargetSampleSizeType targetSampleSizeType;

	@Column
	private String samplingUnits;

	@Column
	private int minimum;

	@Column
	private int actual;

	@Column
	private int achieved;

	@Column
	private float sizeOfDesignEffect;

	@Column
	private int effective;

	// getter / setter

	public TargetSampleSizeType getTargetSampleSizeType()
	{
		return targetSampleSizeType;
	}

	public void setTargetSampleSizeType( final TargetSampleSizeType targetSampleSizeType )
	{
		this.targetSampleSizeType = targetSampleSizeType;
	}

	public String getSamplingUnits()
	{
		return samplingUnits;
	}

	public void setSamplingUnits( final String samplingUnits )
	{
		this.samplingUnits = samplingUnits;
	}

	public int getMinimum()
	{
		return minimum;
	}

	public void setMinimum( final int minimum )
	{
		this.minimum = minimum;
	}

	public int getActual()
	{
		return actual;
	}

	public void setActual( final int actual )
	{
		this.actual = actual;
	}

	public int getAchieved()
	{
		return achieved;
	}

	public void setAchieved( final int achieved )
	{
		this.achieved = achieved;
	}

	public float getSizeOfDesignEffect()
	{
		return sizeOfDesignEffect;
	}

	public void setSizeOfDesignEffect( final float sizeOfDesignEffect )
	{
		this.sizeOfDesignEffect = sizeOfDesignEffect;
	}

	public int getEffective()
	{
		return effective;
	}

	public void setEffective( final int effective )
	{
		this.effective = effective;
	}

}
