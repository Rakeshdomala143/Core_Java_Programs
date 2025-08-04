package NextIntNextLineMethods;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE INTEGER VALUE");
		int k = sc.nextInt();
		sc.nextLine();
		System.out.println("enter the string value");
		String z= sc.nextLine();
		System.out.println("..................");
		System.out.println("INTEGER VALUE IS :"+k);
		System.out.println("String value is:"+z);
		System.out.println(".................");
	}

}
