package oops_programing_optimizing_style2;
import oops_programing_validation_layer.BoxValidation;
public class Box
{
	public static String color = "Blue";
	public int length;
	public int width;
	public int height;


public Box(int length, int width)
{
	

	if(BoxValidation.validation(length)
	{
	this.length=length;
	}
	else
	{
		System.err.println();
	}
}
public Box(int length, int width,int height)
{
	this.width=width;

	if(BoxValidation.validation(length))
	{
	this.length=length;
	}
}
public void Display()
{
	
	
System.out.println("BOX COLOR"  + color);
System.out.println("length" +length + " cms");
System.out.println("width" +width + " cms");
System.out.println("height " + height + "cms");
System.out.println("volume is " +length*width*height);

	
}
	
}


