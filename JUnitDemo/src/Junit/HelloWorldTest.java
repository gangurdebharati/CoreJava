package Junit;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class HelloWorldTest implements TestLifecycleLogger
{
	//@RepeatedTest(10)
	@Test
	void test()
	{
		System.out.println("First test case...");
	}

}
