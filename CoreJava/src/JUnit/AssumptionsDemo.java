package JUnit;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsDemo {
	
	@Test
	void testOnDev()
	{
		System.setProperty("ENV","DEV"); //TRUE E=D-->D=E
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV"))); //TRUE
		//Remainder of test will proceed
	}

	
	@Test
	void testOnProd()
	{
		System.setProperty("ENV","PROD");  //E=P
		Assumptions.assumingThat("DEV".equals(System.getProperty("ENV")),AssumptionsDemo::message);
		//Remainder of test will be aborted
	}
	
	private static String message()
	{
		return "TEST2 Execution Failed::";
	}

}