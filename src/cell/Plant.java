package cell;

/**
 * Author: Robert Trujillo & Nathan Acosta
 * Date: Mar 20, 2013 , Modified by Robert on 04.22.13
 * A Plant contains properties pertaining to its interaction
 * with water and physical structure.
 */
public enum Plant
{   	
	PINTOBEANS(2.5, 3, 114, 11, 4, 2.65),	    
	SUNFLOWER(3.2, 13, 25, 30, 12, 2.65),
	AMARANTH(1.4, 2, 18, 4, 2, 1.33),
	CHILE(7.2, 17, 61, 5, 1, 2.65),
	SWEETCORN(1.65, 11, 46, 20, 3, 3.98),
	SUMMERSQUASH(3.5, 7, 92, 45, 3, 2.65),
	WINTERSQUASH(3.5, 16, 122, 120, 3, 2.65),
	POTATOES(4.2, 17, 46, 30, 15, 2.65),
	SWEETPEPPER(8.2, 80, 31, 3, 1, 2.65);

	private double _transpiration; 
	private double _maturationTime;
	private int _matureDepth; 
	private int _distanceBetweenSeeds;
	private int _depthOfSeed; 
	private double _waterRequirements;
  
  /**
   * Sets the constant values of a Plant type.
   * @param transpiration in mL/Week
   * @param maturationTime in Weeks
   * @param matureDepth in cells
   * @param distanceBetweenSeeds in cells
   * @param depthOfSeed in cells
   * @param waterRequirements in mL/week
   */
	private Plant (double transpiration, double maturationTime, int matureDepth, int distanceBetweenSeeds, int depthOfSeed, double waterRequirements)
	{
		this._transpiration = transpiration;
		this._maturationTime = maturationTime;
		this._matureDepth = matureDepth;
		this._distanceBetweenSeeds = distanceBetweenSeeds;
		this._depthOfSeed = depthOfSeed;    
		this._waterRequirements = waterRequirements;
	}
  
  /**
   * @return Returns the Transpiration of this Plant in mL/Week.
   */
  public double getTranspiration()
  { return this._transpiration;
  }
  
  /**
   * @return Returns the Maturation Time of this Plant in Weeks.
   */
  public double getMaturationTimee()
  { return this._maturationTime;
  }

  /**
   * @return Returns the Mature Root Depth of this Plant in number of cells.
   */
  public int getMatureDepth()
  { return this._matureDepth;
  }
  
  /**
   * @return Returns the Distance needed between seeds of this Plant in number of cells.
   */
  public int getDistanceBetweenSeeds()
  { return this._distanceBetweenSeeds;
  }
  
  /**
   * @return Returns the Depth needed for the seed of this Plant in number of cells.
   */
  public int getDepthOfSeed()
  { return this._depthOfSeed;
  }
  
  /**
   * @return Returns the Water Requirements of this Plant in mL/week.
   */
  public double getWaterRequirements()
  { return this._waterRequirements;
  
  }
  
}
