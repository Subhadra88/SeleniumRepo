package week1.day1;

public class Mobile1 {
	public void makeCall() {
		String mobileModel="Redmi 9";
		float mobileWeight=1.5f;
		System.out.println("Mobile model is " + mobileModel +" Weight is " +mobileWeight);
		
	}
	public void sendSms() {
		boolean isFullCharged=true;
		int mobileCost=150000;
		System.out.println("Mobile is fully charged or not " +isFullCharged+"Mobile cost is "+mobileCost);
	}
	public static void main(String[] args) {
		Mobile1 mob=new Mobile1();
		mob.makeCall();
		mob.sendSms();
	}

}
