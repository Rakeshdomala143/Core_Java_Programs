package oops_polymorphism;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	Animal animal = null;
	System.out.println("press 1 for Lion");
	System.out.println("press 2 for Tiger");
	System.out.println("press 3 for monkey");
	int choice = sc.nextInt();
	switch(choice)
	{
	case 1 : animal = new Lion();
	break;
	case 2 : animal = new Tiger();
	break;
	case 3: animal = new Monkey();
	break;

	}
	animal.noise();

}
}


