package oops_programing_business_logica_layer;
import java.util.ArrayList;
import java.util.Random;

import oops_programing_validation_layer.DeveloperValidation;
public class Developer {
	private String id;
	private String firstName;
	private String lastName;
	private String designation;
	private String language;
	private double salary;
	private double yop;
	private String company;
	private static ArrayList<Integer> ids = new ArrayList<>();
	
	public Developer(String firstName, String lastName, String designation, String language, double salary,
			double yop, String company) {
		if(DeveloperValidation.verifyName(firstName))
		{
			this.firstName=firstName;
		}
		else
		{
			System.err.println("invalid");
		}
		if(DeveloperValidation.verifyName(lastName))
		{
			this.lastName=lastName;
		}
		else
		{
			System.err.println("invalid");
		}
		if(DeveloperValidation.verifyDesignation(designation))
		{
			this.designation=designation;
		}
		else
		{
			System.err.println("invalid");
		}
		if(DeveloperValidation.verifyLanguage(language))
		{
			this.language=language;
		}
		else
		{
			System.err.println("invalid");
		}
		if(DeveloperValidation.verifySalary(salary))
		{
			this.salary=salary;
		}
		else
		{
			System.err.println("invalid");
		}
		if(DeveloperValidation.verifyYop(yop))
		{
			this.yop=yop;
		}
		else
		{
			System.err.println("invalid");
		}
		if(DeveloperValidation.verifyCompany(company))
		{
			this.company=company;
		}
		else
		{
			System.err.println("invalid");
		}
		this.id=getId(company,ids);
	
	}
	public String getId(String company,ArrayList<Integer> ids)
	{
		
		String firstHalf = "";
		for(int i=0; i<=2; i++)
		{
			char ch = company.charAt(i);
			firstHalf=firstHalf+ch;
		}
	
		boolean status;
		int secondHalf;
		do
		{
			Random random = new Random();
			secondHalf = random.nextInt(100,999);
			status = ids.contains(secondHalf);
			if(!status)
			{
				break;
			}
		}while(status);
		ids.add(secondHalf);
		String id=firstHalf+secondHalf;
		return id;
	}
public double annualSalary(double salary)
{
	return salary*12;
}
public void developerDetails()
{
	System.err.println("........Developer details....");
	System.out.println("id:" + id);
	System.out.println(" Name  : " +firstName+lastName);
	System.out.println("job role:" +designation);
	System.out.println("working as :" + language + "developer");
	System.out.println("working in "+company+" from past "+yop+"years");
	System.out.println("monthly salary "+salary+"/-Rs");
	System.out.println("annual salary "+annualSalary(salary)+salary+"/-Rs");
	
	
}
	

}
