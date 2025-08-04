package oops_programming_object_reference;

public class Car extends Vechile{
	public int numSeats;

	public Car(String brandName,int numSeats) {
		super(brandName);
		this.numSeats=numSeats;
	}
	public void carDetails()
	{
		System.out.println("number of seats"+numSeats);
	}
	

}
