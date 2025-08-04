package user_layer1;

import java.util.Scanner;
import businesslayer.Rectangle;
import businesslayer.Circle;
import businesslayer.Triangle;
import businesslayer.Shape;
public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Shape[] shapeArray = new Shape[100];
		int index=0;
		while(true)
		{
			System.out.println("Enter details");
			System.out.println("press 1 enter circle Details");
			System.out.println("press 2 enter triangleDetails");
			System.out.println("press 3 enter rectangle Details");
			int choice = sc.nextInt();			
			switch(choice)
			{
			case 1: System.out.println("enter radius");
			        int radius = sc.nextInt();
			        
			
				shapeArray[index++] = new Circle(radius);
				break;
			case 2: System.out.println("enter the base");
			         int base = sc.nextInt();
			        System.out.println("enter height");
			         double height = sc.nextDouble();
			        shapeArray[index++] = new Triangle(base,height);
			        break;
			case 3: System.out.println("enter the length");
			         int length = sc.nextInt();
			         System.out.println("enter the bredth");
			         double bredth = sc.nextDouble();
			         shapeArray[index++] = new Rectangle( length, bredth);
			         break;
			    default : System.out.println("enter valid details");
			}
			System.out.println("press 1 to continue");
			System.out.println("press 0 to stop");
			int continueStop = sc.nextInt();
			if(continueStop==0)
			{
				break;
			}
			for(int i=0; i<=index; i++)
			{
				shapeArray[i].findArea();
			}
			
		}
		
		
	}

}
