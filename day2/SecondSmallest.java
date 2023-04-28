package week1.day2;
import java.util.Arrays;

public class SecondSmallest {
	public static void main(String[] args) {
		int arr[]= {25,13,18,56,34,67,27};
		Arrays.sort(arr);
			System.out.println("The Second Smallest Number is " +arr[1]);
	}
}
