package oops_programing_optimizing_style2;
/*write a program for the below requirements
a. program for balloon 
characteristics are 
balloon color
balloon gas 
price of a balloon 
Data requirement
Balloon color can be = white yellow green, gold, silver
all the balloon are filled with helium gas
balloon price range is 2 rupees to 15 rupees
perform below operation 
1. initilazatio 
2. convert rupees to pisa
3. display balloon information
4.create a separate validation layer business logic layer user layer
*/
public class Balloon {
	public static String balloonGas = "helium";
	private String balloonColor;
	private double price;
	public Balloon(String ballonColor,double price)
	{
		if(Validation.verifyColor(balloonColor)==1)
		{
			this.balloonColor=balloonColor;
		}
		if(Validation.verifyPrice(price)==1)
		{
			this.price = price;
		}
		else
		{
			System.err.println("invalid...");
		}
		
	}
	public double getPaisa()
	{
		double rupee = price*100;
		return rupee;
		
	}
	public void balloonInfo()
	{
		System.out.println("enter the balloon details...");
		System.out.println("the balloon color is :" + balloonColor + " and its consists of " + balloonGas + " with the price of" +price + "/Rs" );
		
	}
}
