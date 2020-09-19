import java.util.stream.IntStream;

public class Stream
{
	public static void main(String[] args)
	{
		System.out.printf("Sum of integers from 1 to 9 is %d%n",IntStream.range(1,10).sum());
		System.out.printf("Sum of integers from 1 to 10 is %d%n",IntStream.rangeClosed(1,10).sum());
	}
}
