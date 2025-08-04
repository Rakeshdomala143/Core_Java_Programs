package oops_programming_object_reference;
import java.util.Scanner;
public class VechileMain {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Vechile[] vechileArray= new Vechile[100];
		int index=0;
		 String brandName=null;
		Vechile  vechile = null;
		do
		{
			System.out.println("ENTER WHICH VECHILE U WANT");
			System.out.println("press 1 to Car details:...");
			System.out.println("press 2 to Bike details:.. ");
			System.out.println("press 3 to Bus details:.....");
			brandName= sc.nextLine();
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1 : System.out.println("Enter car Details");
			         System.out.println("Enter the brand Name");
			         brandName=sc.nextLine();
			         System.out.println("Number of Seats");
			         int numSeats = sc.nextInt();
			         vechile  = new Car(brandName, numSeats);
			         break;
			case 2 : System.out.println("Enter Bike Details");
			         System.out.println("Enter the brand Name");
			         brandName = sc.nextLine();
			         System.out.println("Bike kickStart option is Available");
			         boolean kickStart = sc.nextBoolean();
			         vechile = new Bike(brandName,kickStart);
			         break;
			case 3 : System.out.println("Enter Bus Details");
			        System.out.println("Enter which bus u want to travel");
			        brandName = sc.nextLine();
			        System.out.println("Enter the seat number");
			        String seatNum = sc.nextLine();
			        vechile = new Bus(brandName,seatNum);
			        break;
			}      
			
			vechileArray[index] = vechile;
			index++;
			System.out.println("press 1 to continue");
			System.out.println("press o to stop");
			int status = sc.nextInt();
			if(status==0)
			{
				break;
			}
			for(int i=0; i<=index-1; i++)
			{
				if(vechileArray[i] instanceof Car)
				{
					Car car =  (Car)vechile;
					car.carDetails();
					
				}
				if(vechileArray[i] instanceof Bike)
				{
					Bike bike = (Bike) vechile;
					bike.bikeDetails();
				}
				if(vechileArray[i] instanceof Bus)
				{
					Bus bus = (Bus) vechile;
					bus.busDetails();
				}
				
			}
				
			
		}while(true);
		
	}


}
