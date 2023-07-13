package JUnit;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

public class DynamicTessting {
	@TestFactory
	Collection<DynamicTest> dynamicTests()
	{
		return Arrays.asList(
				dynamicTest("first dynamic test",()-> assertTrue(true)),
				
				dynamicTest ("My Executable class",new MyExecutable()),
				
				dynamicTest("Exception Executable",()->{throw new Exception ("Exception Example");}),
				
				dynamicTest("Second dynamic test",()->assertTrue(false))
				);
	}
	
	class MyExecutable implements Executable{

		@Override
		public void execute() throws Throwable {
       System.out.println("Hello All!!");			
		}

}
}
