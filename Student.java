package oops_programing_business_logica_layer;

public class Student {
	public String name;
	public double tength;
	public double inter;
	public double degree;
	public double masters;
	public Student(String name, double tength) {
		
		this.name = name;
		this.tength = tength;
	}
	public Student(String name, double tength, double inter) {
		
		this(name,tength);
		this.inter = inter;
	}
	public Student(String name, double tength, double inter, double degree) {
		this(name,tength,inter);
		this.degree = degree;
	}
	public Student(String name, double tength, double inter, double degree, double masters) {
		this(name,tength,inter,degree);
		this.masters = masters;
	}
	public void display()
	{
		System.out.println("student name:"+name);
		System.out.println("student tength percentage:"+tength);
		System.out.println("student inter"+inter);
		System.out.println("student degree percentage"+degree);
		System.out.println("student masters percentage"+masters);
	}
	
	

}
