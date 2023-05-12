package Assignment;

public class Automation extends MultipleLanguage {
	public static void main(String[] args) {
		Automation auto=new Automation();
		auto.java();
		auto.selenium();
		auto.python();
		auto.ruby();
	}
		

		

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("This Selenium method from TestTool Interface");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("This java method from Language Interface");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("This Ruby method from MulltipleLanguage");
	}

}
