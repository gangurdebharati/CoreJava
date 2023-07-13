package Day10;

public class WrapperEx
{
	public static void main(String[] args) 
	{
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=40.7f;
		double d=7809.90d;
		char c='A';
		boolean bool=true;
		
		//Autoboxing : converting primitive into objects
		
		Byte byteobj=b;
		Short shortobj=s;
		Integer intobj=i;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean boolobj=bool;
		
		//Print objects
		
		System.out.println("---Printing objects values---");
		
		System.out.println("Byte object :"+byteobj);
		System.out.println("Short object :"+shortobj);
		System.out.println("Integer object :"+intobj);
		System.out.println("Long object :"+longobj);
		System.out.println("Float object :"+floatobj);
		System.out.println("Double object :"+doubleobj);
		System.out.println("Character object :"+charobj);
		System.out.println("Boolean object :"+bool);
		
		//Unboxing: convert objects to primitive
		
		byte bytevalue=byteobj;
		short shortvalue=shortobj;
		int intvalue=intobj;
		long longvalue=longobj;
		float floatvalue=floatobj;
		double doublevalue=doubleobj;
		char charvalue=charobj;
		boolean boolvalue=boolobj;
		
		//Print Primitive
		
		System.out.println("--Printing primitive values---");
		
		System.out.println("byte value :"+bytevalue);
		System.out.println("short value :"+shortvalue);
		System.out.println("int value :"+intvalue);
		System.out.println("long value :"+longvalue);
		System.out.println("float value :"+floatvalue);
		System.out.println("double value :"+doublevalue);
		System.out.println("char value :"+charvalue);
		System.out.println("boolean value :"+boolvalue);
		
		
		
		
	}

}
