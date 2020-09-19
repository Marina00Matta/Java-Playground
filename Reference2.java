import java.util.*;

interface StringFunction
{
	String applyFunction(String s);
}
interface StringConsumer
{
	void consumeFunction(String s);
}

class Reference
{
	public static String transform(String st,StringFunction f)
	{
		return(f.applyFunction(st));	
	}	
	public static void byebye(String st,StringConsumer f)
	{
		f.consumeFunction(st);
	}
	public static String makeExciting(String s)
	{
		return (s + " ** !! ");
	}
	private Reference() {}
}

class Reference2
{
	public static void main(String[] args)
	{
		String s = "TestITISmart";
		String result1 = Reference.transform(s,Reference::makeExciting);
		System.out.println("\n1 Static "+result1);
		String prefix = "my name is marina";
		String result2 = Reference.transform(s,prefix::concat);
		System.out.println("\n2 object::instance method: "+result2);
	}
}
