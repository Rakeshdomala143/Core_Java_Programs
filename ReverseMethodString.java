package Rakesh;

public class ReverseMethodString {
	public static void rev(String s)
	{
		String srev = "";
		for(int i=s.length()-1; i>=0; i--)
		{
			char ch = s.charAt(i);
			srev=srev+ch;
		}
		
		if(srev.equals(s))
		{
			System.out.println("it is an a palindrome");
		}
		else {
			System.out.println("it is not an a palindrome");
		}
	}
	public static void main(String[] args)
	{
		String s = "manam";
		rev(s);
	}
	

}
