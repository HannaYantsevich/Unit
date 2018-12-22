package JUnitTests;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import com.epam.tat.module4.Calculator;

public class BaseTestJunit {
	
protected static Calculator calculator;
	
	@BeforeClass
	public static void setUp() {
		calculator = new Calculator();
		
	}
	
	
	@AfterClass
	public static void tearDown() {
		calculator = null;
	}
	
}

