package businesslayer;

public class Rectangle implements Shape{
	private int length;
	private double bredth;
	public Rectangle(int length,double bredth)
	{
		this.length=length;
		this.bredth=bredth;
	}
	@Override
	public void findArea() {
		double area = length*bredth;
		
	}

}
