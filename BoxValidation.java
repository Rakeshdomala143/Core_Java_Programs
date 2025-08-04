package oops_programing_validation_layer;


public class BoxValidation {
	public static boolean validation(int dimension)
	{
	
		if(dimension>=5 && dimension <=25)
		{
			return true;
		}
		else
		{
		return false;
		}
	}

}
