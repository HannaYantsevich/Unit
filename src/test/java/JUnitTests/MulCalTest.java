package JUnitTests;
import org.junit.Assert;
import org.junit.Test;

public class MulCalTest extends BaseTestJunit {
	

	@Test
	public void twoMulEight() {
		
		double result = calculator.mult(2, 8);
		Assert.assertTrue(result == 16);
		
	
}	

}
