package oops_programing_optimizing_style2;

public class AC {
	public static String brandName ="samsung";
	private double tempeature;
	public AC(double tempeature)
	{
		this.tempeature = tempeature;
		//if(t>=35 && t<=90)
		//{
		//tempeature=t;
		//}
		//else
		//{
			//System.err.println("the tempeature is to low and high");
		//}
	}
	public double getFarheint()
	{
		double farheint=(tempeature*1.8)+32;
		return farheint;
	}
	public void increaseTempeature()
	{
		tempeature+=0.5;
		System.out.println(tempeature);
	}
	public void decreasingTempeature()
	{
		tempeature-=0.5;
		System.out.println(tempeature);
	}
	public void Display()
	{
		System.out.println("brand name :"  + brandName);
		System.out.println("tempeature : " + tempeature);
	}
}
		


