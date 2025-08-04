package oops_programing_user_layer;

import oops_programing_business_logica_layer.Developer;

public class DeveloperMain {
	public static void main(String[] args)
	{
		Developer d1 = new Developer("Sai","kiran","Developer","java",48000,2.3 ,"TGH");
		Developer d2 = new Developer("kiran","Raj","Developer","python",39000,2.3 ,"TGH");
		d1.developerDetails();
		d2.developerDetails();
	}

}
