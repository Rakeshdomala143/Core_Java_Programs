package oops_programming_object_reference;

public class Bike extends Vechile {
	public boolean kickStart;
	public Bike(String brandName,boolean kickStart)
	{
		super(brandName);
		this.kickStart=kickStart;
	}
		public void bikeDetails()
		{
	if(kickStart)
	{
		System.out.println("THE KICKSTART IS AVAILABLE");
	}
	else
	{
		System.out.println("KICKSTART NOT AVAILABLE");
	}
	}

}
