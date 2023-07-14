package Junit;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo 
{
	@ParameterizedTest
	@ValueSource(floats= {1,2,3,4,5})
	void withValueSource(float number)
	{
		assertNotNull(number);
	}

}
