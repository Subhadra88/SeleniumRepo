package week1.day1;

public class Bike {
	public void applyBreak() {
		System.out.println("Bike Break is applied");
	}
	public static void main(String[] args) {
		Car car=new Car();
		car.applyBreak();
		car.soundHorn();
		Bike bike=new Bike();
		bike.applyBreak();
	}

}
