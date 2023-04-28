package week1.day2;

public class PalindromeNumber {
	public static void main(String[] args) {
		int number=343;
		int rev=0,rem;
		int temp=number;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		if (rev==number)
			System.out.println("It is a Palindrome Number");
		else
			System.out.println("Not a Palindrome Number");
	}

}
