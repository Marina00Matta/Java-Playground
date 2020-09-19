/*import java.util.Date;

class TimeDate
{
	public static void main(String[] args)
	{
		Date date = new Date(12,12,12);
		System.out.println(date);
	}
}*/



import java.time.LocalDate;
import java.time.Month;

class TimeDate
{
	public static void main(String[] args)
	{
		LocalDate Id = LocalDate.of(1931,Month.OCTOBER,15);
		System.out.println(Id);
	}
}
