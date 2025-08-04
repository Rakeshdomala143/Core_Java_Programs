package oops_programing_user_layer;

public class mainLaptop {
	public static void main(String[] args)
	{
		Laptop l1=new Laptop();
		Laptop l2=new Laptop();
		Laptop l3=new Laptop();
		l1.brandName="hp";
		l1.processTye="i3";
		l1.ramSize=2;
		l1.user="Sai";
		l2.brandName="lenovo";
		l2.processTye="i5";
		l2.ramSize=4;
		l2.user="jagadheer";
		l3.brandName="dell";
		l3.processTye="i7";
		l3.ramSize=8;
		l3.user="rakesh";
		int convertRam=l1.ramSize*1024;
		int convertRam2=l2.ramSize*1024;
		int convertRam3=l3.ramSize*1024;
		
		
		System.out.println(".....laptop1 Details......");
		System.out.println(l1.user  +  " can using "  +   l1.brandName  +  " the processer is "  +  l1.processTye  +  " and the ram is "  +  convertRam);
		System.out.println(l2.user  +  " can using "  +   l2.brandName  +  " the processer is "  +  l2.processTye  +  " and the ram is  "  +  convertRam2);
		System.out.println(l3.user  +  " can using "  +   l3.brandName  +  " the processer is "  +  l3.processTye  +  " gujhhyjm mmuujjuj    ji89and the ram is  "  +  convertRam3);
		
		
		
		
		
		
	}

}
