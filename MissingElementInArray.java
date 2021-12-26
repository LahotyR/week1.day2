package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		
		int len = arr.length;
		
		for (int i = 0; i < len; i++) {
			
			
			if (arr[i] != i+1) {
				
				int j=i+1;
				System.out.println("The number is: " + j);
				
				break;
			}
		}

	}

}
