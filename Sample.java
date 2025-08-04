package Rakesh;

public class Sample {
	public void run(int a)
	{
		System.out.println(a);
	}
	public void run()
	{
		System.out.println("Running");
	}
	public void run(String s)
	{
		System.out.println(s);
		
	}
	public static void main(String[] args)
	{
		Sample s = new Sample();
		s.run(5);
		s.run("rakesh");
		s.run();
		
	}

}
