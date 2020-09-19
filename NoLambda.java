import java.util.*;

interface MyValue
{
	double getValue();
}
class NoLambda
{
	public static void main(String[] args)
	{
		MyValue myVal;
		myVal = new MyValue()
		{
			public double getValue()
			{
				return 98.6;
			}
		};
		System.out.println("The constant value is: "+myVal.getValue());
	}
}
