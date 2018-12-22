package JUnitTests;
import org.junit.Assert;
import org.junit.Test;

import com.epam.cdp.cal.tests.BaseTest;
import com.epam.tat.module4.Calculator;

public class DivCalTest extends BaseTestJunit {
	

	@Test
	public void eightDivTwo() {
		
		double result = calculator.div(8, 4);
		Assert.assertTrue(result == 2);
		
	
}	

}
