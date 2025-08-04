package Rakesh;

public class Reverse {
	public static void main(String[] arg)
	{
		String s = "java";
		for(int i=s.length()-1; i>=0; i--)
		{
			char ch = s.charAt(i);
			System.out.print(ch);
		}
	}

}
