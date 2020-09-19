import java.util.*;

interface MyValue
{
	double getValue();
}

class Lambda
{
	public static void main(String[] args)
	{
		MyValue myVal;
		myVal = () -> 98.6;
	
		System.out.println("The constant value is: "+myVal.getValue());
	}
}
