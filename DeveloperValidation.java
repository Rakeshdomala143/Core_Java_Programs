package oops_programing_validation_layer;

public class DeveloperValidation {
	public static boolean verifyName(String name)
	{
		int count=0;
		for(int i=0;i<=name.length()-1; i++)
		{
			char ch = name.charAt(i);
			if(Character.isAlphabetic(ch))
			{
				count++;
			}
		}
		if(count==name.length()) {
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean verifyDesignation(String designation){
		String[] designationList = {"Developer","senior Developer","Asociate engineer","software engineer"};
		boolean status = false;
		for(int i=0; i<=designationList.length-1; i++)
		{
			if(designationList[i].equals(designation))
			{
				status = true;
				break;
			}
			
		}
		return status;
	}
	public static boolean verifyLanguage(String language)
	{
		String[] languageList = {"java","python",".net","php"};
		boolean status = false;
		for(int i=0; i<=languageList.length-1; i++)
		{
			if(languageList[i].equals(language))
			{
				status = true;
				break;
			}
		}
		return status;
	}
	public static boolean verifySalary(double salary)
	{
		if(salary>=10000&&salary<=85000)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean verifyYop(double yop)
	{
		if(yop>=2.0&&yop<=4.5)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean verifyCompany(String company)
	{
		String[] companyList = {"Capgemini","BridgeSoft","TGH","TCS","PYRO"};
		boolean status = false;
		for(int i=0; i<=companyList.length-1; i++)
		{
			if(companyList[i].equals(company))
			{
				status = true;
				break;
			}
		}
		return status;			
		
	}

}
