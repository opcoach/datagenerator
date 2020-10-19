package com.opcoach.generator.basic.impl;

import com.opcoach.generator.Type;
import com.opcoach.generator.basic.DoubleGenerator;

// This class overrides the generated class and will be instantiated by factory
public class DoubleGeneratorImpl extends MDoubleGeneratorImpl implements DoubleGenerator
{
	
	protected DoubleGeneratorImpl()
	{
		this(0.0d, 100.0d);
	}
	
		
    /**  Build it with low and high bounds */
	public DoubleGeneratorImpl(Double vlow, Double vhigh) 
	{
		super();
		setLow(vlow);
		setHigh(vhigh);
		step = 1.0d;
	}
	

	@Override
	protected Double generateRandomValue()
	{
		 // Generate random value.
	   	  double result = getRandomizer().nextDouble();
	   	  if (result > (high - low))
	   	  {
	   		  // Must adjust the value. 
	   		  result = (double) (result - 0.5d);
	   	  }
	   	  // Can return the result .
	   	  return low + result;

	}



	@Override
	protected Double generateSimpleValue()
	{
		double result;
		
		if (lastGeneratedValue == null)
			result = low;
		else
		{
			result =  lastGeneratedValue + step;
			// Restart � low value if value to high.
			if (result > high)
				result = low + (result - high);
		}
		
		return result;
	}

	
	@Override
	public Type getValueType() {
		return Type.DOUBLE;
	}
	
}
