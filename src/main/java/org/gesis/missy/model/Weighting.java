package org.gesis.missy.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.gesis.persistence.PersistableResource;

/**
 * @author matthaeus
 * 
 */
@Entity( name = "Missy_Weighting" )
public class Weighting extends PersistableResource
{

	// properties

	@Column
	private String initialDesignWeightTarget;

	@Column
	private String initialDesignWeightMethod;

	@Column
	private String initialNonResponseMethod;

	@Column
	private String initialCalibrationMethod;

	@Column
	private String weighting;

	// getter / setter

	public String getInitialDesignWeightTarget()
	{
		return initialDesignWeightTarget;
	}

	public void setInitialDesignWeightTarget( final String initialDesignWeightTarget )
	{
		this.initialDesignWeightTarget = initialDesignWeightTarget;
	}

	public String getInitialDesignWeightMethod()
	{
		return initialDesignWeightMethod;
	}

	public void setInitialDesignWeightMethod( final String initialDesignWeightMethod )
	{
		this.initialDesignWeightMethod = initialDesignWeightMethod;
	}

	public String getInitialNonResponseMethod()
	{
		return initialNonResponseMethod;
	}

	public void setInitialNonResponseMethod( final String initialNonResponseMethod )
	{
		this.initialNonResponseMethod = initialNonResponseMethod;
	}

	public String getInitialCalibrationMethod()
	{
		return initialCalibrationMethod;
	}

	public void setInitialCalibrationMethod( final String initialCalibrationMethod )
	{
		this.initialCalibrationMethod = initialCalibrationMethod;
	}

	public String getWeighting()
	{
		return weighting;
	}

	public void setWeighting( final String weighting )
	{
		this.weighting = weighting;
	}

}
