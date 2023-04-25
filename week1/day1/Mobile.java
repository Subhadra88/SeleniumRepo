package week1.day1;

public class Mobile {
	public void sendSms() {
		System.out.println("Send sms...");
	}
	protected void allowVoiceCall() {
		System.out.println("Allow voice call...");
	}
	private void takeVideo() {
		System.out.println("Take video...");
	}
	public static void main(String[] args) {
		Mobile mob=new Mobile();
		mob.sendSms();
		mob.allowVoiceCall();
		mob.takeVideo();
	}

}
