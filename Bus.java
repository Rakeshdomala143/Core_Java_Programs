public class Bus extends Vechile{
	public String seatNum;

	public Bus(String brandName,String seatNum) {
		super(brandName);
		this.seatNum=seatNum;
	}
	public void busDetails()
	{
		System.out.println("THE SEAT NUM IS:"+seatNum);
	}

}
