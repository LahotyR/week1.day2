package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num = 8;
		boolean flag = false;
		
		for (int i = 2; i <= num/2; i++) {
			
			int rem = num%i;
			
			if (rem == 0) {
				flag = true;
				break;
			} 
			
		}
			
			if (flag == true) {
				System.out.println(num + " is not prime");
				
			} else {
				System.out.println(num + " is a prime number");
			}
			

	}

}
