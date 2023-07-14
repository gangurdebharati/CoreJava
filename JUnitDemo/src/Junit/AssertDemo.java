package Junit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AssertDemo 
{
	
	public void compare()
	{
		int result=1;
		int expected=1;
		assertEquals(result,expected);	
	}
	
	@Disabled
	@Test
	public void simpleAdd1()
	{
		int result=1;
		int expected=2;
		assertEquals(result,expected);	
	}
	@Disabled
    @Test
	public void simpleAdd2()
	{
		int result=3;
		int expected=3;
		assertEquals(result,expected);
	}

	
	@Test
	public void simpleAdd3()
	{
		int result=1;
		int expected=1;
		assertEquals(result,expected);
	}


}