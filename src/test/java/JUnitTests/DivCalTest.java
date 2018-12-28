package JUnitTests;

import org.junit.Assert;
import org.junit.Test;

public class DivCalTest extends BaseTestJunit {
	

	@Test
	public void eightDivTwo() {
		
		double result = calculator.div(8, 4);
		Assert.assertTrue(result == 2);
		
	
}	
	
	@Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        calculator.div(15,0);
    }

	@Test(timeout = 500)
    public void timeStampTest() {
        while (true);
    }
	
}
