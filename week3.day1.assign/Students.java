package Assignment;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student Id is: "+id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student Id is: "+id+ " Name is: "+name);
	}
	public void getStudentInfo(String email, long phone) {
		System.out.println("Student email is: "+email+" Phone number: "+phone );
	}
	public static void main(String[] args) {
		Students stud=new Students();
		stud.getStudentInfo(1234);
		stud.getStudentInfo(1234, "Subhadra");
		stud.getStudentInfo("Subhadra@gmail.com",987654324) ;
	}


}
