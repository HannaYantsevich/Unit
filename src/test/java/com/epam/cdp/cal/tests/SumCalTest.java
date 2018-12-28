package com.epam.cdp.cal.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SumCalTest extends BaseTest {
	
	@Test(dataProvider = "valuesForTest" )
	public void onePlusTwo(long a, long b, long expectedValue) {
		long result = calculator.sum(a, b);
		Assert.assertEquals(result, expectedValue, "Invalid result of sum operation!");
	}
	
	
	@Test
    public void calcTests() {
		Assert.assertEquals(7, calculator.sum(2,5));
		Assert.assertEquals(2, calculator.sqrt(4));
		Assert.assertEquals(49, calculator.pow(7, 2));
    }
	
	@DataProvider(name = "valuesForTest")
	public Object[][] valuesForSum(){
		return new Object[][] {
			{10, 23, 33},
			{10, -1, 9},
			{0, 0, 0}, 
			{-1, 10, 9}
		};
	}
}
