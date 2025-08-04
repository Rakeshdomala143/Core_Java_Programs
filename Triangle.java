package businesslayer;

public class Triangle implements Shape{
	private int base;
	private double height;
	public Triangle(int base,  double height)
	{
		this.base = base;
		this.height = height;
	}
	@Override
	public void findArea() {
		double area = 0.5*base*height;
		
	}
	

}
