package oops_programing_user_layer;

public class MainRunner {
	public static void main(String[] args)
	{
		Runner r1=new Runner();
		Runner r2=new Runner();
		r1.firstName_lastName="Domala Rakesh";
		r1.jerseyNumber=18;
		r1.runnerSpeed=7.5;
		r2.firstName_lastName="Balaboina sai kumar";
		r2.jerseyNumber=7;
		r2.runnerSpeed=6.6;
		double time = r1.runnerSpeed/Runner.mertahSpeed;
		double time1=r2.runnerSpeed/Runner.mertahSpeed;
		double timeInSec = time*60*60;
		double time1InSec=time1*60*60;
System.out.println("....runner 1 Details....");
		System.out.println("Name  : "+r1.firstName_lastName);
		System.out.println("jersey number : "+r1.jerseyNumber);
		System.out.println("Runner speed : "+r1.runnerSpeed);
		System.out.println("time "+time+ " kmph");
		System.out.println("time "+timeInSec+ " Sec");
		System.out.println("....runner 2 Details....");
		System.out.println("Name  : "+r2.firstName_lastName);
		System.out.println("jersey number : "+r2.jerseyNumber);
		System.out.println("Runner speed : "+r2.runnerSpeed);
		System.out.println("time "+time1+ " kmph");
		System.out.println("time "+time1InSec+ " Sec");
		
		
		
		
		
	}

}
