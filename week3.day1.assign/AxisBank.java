package Assignment;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("This deposit method from Axis Bank OverRide");
		
	}
	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.savings();
		ab.fixed();
		ab.deposit();
	}
}
