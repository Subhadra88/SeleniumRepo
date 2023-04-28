package week1.day2;
public class PrimeNumber {

	public static void main(String[] args) {
		//Check if the7iven number is prime number or not
		
		int input= 2;
		
		boolean flag = false;
		
		for (int i = 2; i < input; i++) {
		    if(input%i ==0) {
            	flag=true;
            	break;
            }
		}
		if(flag==false) {
        	System.out.println(input +" is a Prime Number");
        }
        else {
        	System.out.println(input +" is not a Prime Number");
        }
	}
}