package AppTests;

import org.junit.Assert;
import org.junit.Test;

import source.Calculator;

public class AddingNumbersTests {
	
	private Calculator calc = new Calculator();
	
	@Test
	public void addTwoPositiveNumbers() {
		int expectedResult = 30;
		int actualResult = calc.add(10,20);
		Assert.assertEquals("The sum of two positive numbers is correct", expectedResult,actualResult);
	}
	
	@Test
	public void addTwoNegativeNumbers() {
		int expectedResult = -30;
		int actualResult = calc.add(-10,-20);
		Assert.assertEquals("The sum of two negative numbers is correct", expectedResult,actualResult);
	}
}
