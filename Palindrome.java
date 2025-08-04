package Rakesh;

public class Palindrome {
	public static void main(String[] args)
	{
		String s = "manam";
		String rev = "";
		for(int i=s.length()-1;i>=0; i--)
		{
			char ch = s.charAt(i);
			rev=rev+ch;
			
		}
		if(s==rev)
		{
			System.out.println("it is an a palindrome");	
		}
		else
		{
			System.out.println("it is a not a palindrome");
		}
			
		}
	}


