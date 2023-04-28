package week1.day2;

public class FindIntersection {
	public static void main(String[] args) {
		int arr1[]= {3,6,8,4,5};
		int arr2[]= {7,9,1,2,8};
		for(int i=0;i<arr1.length;i++) {
			for (int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j])
					System.out.println(arr1[i]);
			}
		}
	}
}
