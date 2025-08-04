package oops_programing_optimizing_style2;

public class Circle {
	public static double pi=3.14;
	public double radius;
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public void findCircumference()
	{
		double circumference=2*pi*radius;
	}

}
