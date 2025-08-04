package Rakesh;
//method overloading
public class PaymentGateway {
	public void payment(long creditcardNo,int cvv,int amount)
	{
		System.out.println(amount +"through paying creditcard no:"+creditcardNo);
		System.out.println("cvv number is"+cvv);
	}
	public void payment(long debitcardNo,int otp, double amount)
	{
		System.out.println(amount+"through paying debitcard no:"+debitcardNo);
		System.out.println("otp number is"+otp);
	}
	public void payment(String mode, int amount)
	{
		System.out.println(amount+"should pay with"+mode);
	}
	public void payment(String code,double amount)
	{
		System.out.println(code+"google pay"+amount);
	}
	public static void main(String[] args)
	{
		PaymentGateway pg = new PaymentGateway ();
		pg.payment(95152437, 324, 2000);
		pg.payment(935152437, 918, 3000);
		String phonepay = "phonepay";
		pg.payment(phonepay,500);
		String QR = "Googlepay QR code";
		pg.payment(QR,500);
	}

}
