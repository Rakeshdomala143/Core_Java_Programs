package oops_programing_user_layer;

import oops_programing_business_logica_layer.AC;

public class MainAC {
	public static void main(String[] args) 
	{
		AC ac1 = new AC(12);
		AC ac2 = new AC(75);
		ac1.getFarheint();
		ac2.getFarheint();
		ac1.Display();
		ac2.Display();
	}
}


