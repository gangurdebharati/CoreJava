package Junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public interface TestLifecycleLogger
{
	@BeforeAll
	default void beforeAllTests()
	{
		System.out.println("Before all tests");
	}
	@AfterAll
	default void afterAllTests()
	{
		System.out.println("After all tests");
	}
    @Test
    default void testMethod()
    {
    	System.out.println("This is test method");
    }
}
