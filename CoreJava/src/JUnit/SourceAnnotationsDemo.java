package JUnit;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

public class SourceAnnotationsDemo {
	
	@DisplayName("Roman Numeral")
	@ParameterizedTest(name="\"{0}\"should be {1}")
	@CsvSource({"I,1","II,2","V,5"})
	void withName(String word,int number) {}
	
	@ParameterizedTest
	@EnumSource(TimeUnit.class)
		void withAllEnumValues(TimeUnit unit)
	{
		//executed once for each time unit
	}
	@ParameterizedTest
	@EnumSource(
	value=TimeUnit.class,
			names= {"NANOSECONDS","MICROSECONDS"})
            void withSomeEnumValues(TimeUnit unit)
{
	//executed once for TimeUnit.NANOSECONDS 
	//and once for TimeUnit.MICROSECONDS
	
}
	
	@ParameterizedTest
	@MethodSource("CreateWordsWithLength")
	
	void withMethodSource(String word,int length) {}
	
	private static Stream<Arguments> CreateWordsWithLength()
	{
		return Stream.of(
				Arguments.of("Hello",5),
				Arguments.of("JUnit 5",7));
	}
						
				
				
	
}

