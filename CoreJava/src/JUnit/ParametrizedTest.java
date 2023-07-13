package JUnit;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametrizedTest {
	

	@ParameterizedTest
	@ValueSource(ints= {1,2,3,4})
	
	void withValueSource1(int number)
	{
		assertNotNull(number);
	}
	
	
	
	  @ParameterizedTest
	  
	  @ValueSource(strings= {"1","2","One","3","4"})
	  
	  void withValueSource(String value) 
	  { assertNotNull(value); }
	  
	 
}
