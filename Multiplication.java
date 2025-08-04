package oops_polymorphism_compiletime;

public class Multiplication {
	public static void product(int a, int b)
	{
		System.out.println(a*b);
	}
	public static void product(int i , double j)
	{
		System.out.println(i*j);
		
	}
	public static void product(int i, int j, int k)
	{
		System.out.println(i*j*k);
	}
	public static void main(String[] args)
	{
		product(4,5);
		product(5,2.5);
		product(4,5,6);
	}

}
