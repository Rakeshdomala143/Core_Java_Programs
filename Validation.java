package oops_programing_validation_layer;

public class Validation {
	public static int verifyColor(String s)
	{
		String [] colors = {"white","yellow","green","silver","gold"};
		int valid = 0;
	for(int i=0; i<=colors.length-1; i++)
	{
		
		if(colors.equals(colors[i]))
		{
		valid = 1;
		break;
		}
	}
	return valid;
	}
	public static int verifyPrice(double price)
	{
	if(price<=15.0 && price>=2.0)
	{
		return 1;
	}
	else
	{
		return 0;
	}
	}
}
