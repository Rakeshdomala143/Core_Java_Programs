package oops_programing_user_layer;

import oops_programing_business_logica_layer.Box;

public class BoxMainClass
{
	public static void main(String[] args)
	{
		Box box1 = new Box(2,4,5);
		Box box2 = new Box(8,9,10);
		Box box3 = new Box(7,3);
		box1.Display();
		box2.Display();
		box3.Display();

	}
 }
