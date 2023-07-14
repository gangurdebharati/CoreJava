package Junit;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;
import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

public class JUnit5DynamicTests 
{
	@TestFactory
	Collection<DynamicTest> dynamicTests()
	{
		return Arrays.asList
				(
					dynamicTest("simple dynamic test",() -> assertTrue(true)),
					dynamicTest("My executable class",new MyExecutable()),
					dynamicTest("Exception Executable",()->{throw new Exception("Exception occures in this method");}),
					dynamicTest("simple dynamic test-2",()->assertTrue(true))
				);
	}

}
class MyExecutable implements Executable
{
	@Override
	public void execute()throws Throwable
	{
		System.out.println("Hello World...");
	}
}
