package Rakesh;

public class CountNumbersAndAlphabetsInString {
	public static void noOfDigits(String s)
	{
		int digitCount = 0;
		for(int i=0; i<=s.length()-1; i++)
		{
			char ch =s.charAt(i);
			if(ch>='o' && ch<='9')
			{
			
			
			digitCount++;
			}
		}
		System.out.println("digit count:"+digitCount);
	}
		public static void noOfAlphabets(String s)
		{
			int alphaCount = 0;
			for(int i=0; i<=s.length()-1; i++)
			{
				char ch = s.charAt(i);
			if (ch >='a'&& ch<='z'|| ch>='A' && ch<='Z')
			{
				alphaCount++;
			}
			}
			System.out.println("aphabet count:"+alphaCount);
		}
		public static void main(String[] args)
		{
			String s = "jsp123";
			
			noOfAlphabets(s);
			noOfDigits(s);	
			
		}
		
		
	}


