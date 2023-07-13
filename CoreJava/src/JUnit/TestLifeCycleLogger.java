package JUnit;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)

public interface TestLifeCycleLogger {
	
	
	@BeforeEach
	
	default void beforeAllTests()
	{
		System.out.println("before All Tests");
	}
	
	
	@AfterEach
	
	default void afterAllTests()
	{
		System.out.println("after All Tests");
	}
	
	@Test
	default void testMethods()
	{
		System.out.println("testMethods");
	}
	

}