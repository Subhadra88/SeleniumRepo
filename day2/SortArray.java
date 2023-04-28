package week1.day2;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int[] arr= {5,2,4,1,3,7,6,7,10,9};
		for(int i=0;i<arr.length;i++) {
			Arrays.sort(arr);
			System.out.println(arr[i]);
		}
	}

}
