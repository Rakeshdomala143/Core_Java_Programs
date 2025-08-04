package oops_programming_object_reference;

public class Bus1 extends Vechile{
	public String seatNum;

	public Bus1(String brandName,String seatNum) {
		super(brandName);
		this.seatNum=seatNum;
	}
	public void busDetails()
	{
		System.out.println("THE SEAT NUM IS:"+seatNum);
	}

}
