package com.qa.calc;

import org.junit.Assert;
import org.junit.Test;


public class calctest {

	@Test
	public void AddTwoNumbersTogether() {
		Calculator Calculator = new Calculator();
		int result = Calculator.add(2,2);
		Assert.assertEquals(4, result);
	}

}
