import java.text.ParseException;

public class PrintStair {
	public static void main(String[] args) throws ParseException {
		
		
//12:00:00AM -> 00:00:00
//01:00:00AM ->01:00:00
//12:00:00PM ->12:00:00
//01:00:00PM ->13:00:00
//02:00:00PM ->14:00:00
		
		System.out.println(getTwnetyFourHrsTime("12:40:22PM"));
		
}
	
	private static String getTwnetyFourHrsTime(String s)
	{
		if(s.charAt(8)=='A'&& s.substring(0, 2).equals("12"))
			{
			
			String start ="00";
			String rm = s.substring(2,s.length()-2);
			return start.concat(rm);
			
			//return s.substring(0, s.length()-2);
			}
		else if(s.charAt(8)=='A')
				{
			return s.substring(0, s.length()-2);
				}
		else if(s.equals("12:00:00AM"))
		{
			return "00:00:00";
			
		}
		else if(s.equals("12:00:00PM"))
		{
			return "12:00:00";
			
		}
		else if(s.charAt(8)=='P'&& s.substring(0, 2).equals("12"))
		{
			return "12".concat(s.substring(2,s.length()-2));
			}
		else {
			
			String substring = s.substring(0,2);
			int intvalue = Integer.parseInt(substring);
			 int hours= intvalue+12;
			 
			 String hoursString = String.valueOf(hours);
			 String remainigString = s.substring(2,s.length()-2);
			 
			return  hoursString.concat(remainigString);
		}
		
		
		
	}
}


