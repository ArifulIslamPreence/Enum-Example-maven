package EnumEx.EnumEx;
import java.time.Month;
import java.util.Scanner;

public enum Months {

	
	JANUARY("January", 31),
	FEBRUARY("February", 28),
	MARCH("March", 31),
	APRIL("April", 30),
	MAY("May", 31),
	JUNE("June", 30),
	JULY("July", 31),
	AUGUST("August", 31), 
	SEPTEMBER("September", 30), 
	OCTOBER("October", 31),
    NOVEMBER("November", 30), 
    DECEMBER("December", 31);
	
	
	private String MonthName;
	private int date;
	
	Months(String MonthName, int date)
	{
		this.MonthName = MonthName;
		this.date = date; 
	}
	
	public int Dates()
	{
		return date;
	}
	public String getShortName()
	{
		return this.MonthName.substring(0,3);
				
	}
	public static Months parse(String S)
	{
		if(S.isEmpty())
		{
			return null;
		}
		try
		{
			return Months.valueOf(S);
			
		}catch(IllegalArgumentException ex)
		{
			for(Months month:Months.values())
			{
				if(month.getShortName().equals(S))
				{
					return null;
				}
			}
		}
		return null;
			
		
	}
}
