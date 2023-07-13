package JUnit;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class HelloWorldTest implements TestLifeCycleLogger{
	
	@Test
	@RepeatedTest(15)
	void Test()
	{
		System.out.println("Test");
	}
	@Test
	void Test1()
	{
		System.out.println("Test1");
	}
	
	

}
