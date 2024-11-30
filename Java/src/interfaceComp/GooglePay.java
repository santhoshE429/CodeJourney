package interfaceComp;
interface Upi
{
	void sendMoney();
	void receiveMoney();
}
class PhonePay implements Upi
{
	@Override
	public void sendMoney() {
		System.out.println("send Money from PhonePay");
	}
	@Override
	public void receiveMoney() {
		System.out.println("Recieve Money from PhonePay");
	}
}

public class GooglePay implements Upi
{
	 		@Override
		public void sendMoney() {
			System.out.println("send Money from GooglePay");
		}
		@Override
		public void receiveMoney() {
			System.out.println("Recieve Money from  GooglePay");
		}
		public static void main(String[] args) 
		{
			Upi ref=new GooglePay();
			Upi ref1=new PhonePay();
			ref.sendMoney();
			ref1.receiveMoney();
		}

}
