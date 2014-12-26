/**
 * 
 * @author Jorge Saldivar
 *
 * Problem Description
 * The prime factors of 13195 are 5, 7, 13 and 29. 
 * What is the largest prime factor of the number 600851475143 ?
 */

public class Problem3 {

	public static boolean isEven(long number) {
		if(number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isPrime(long number) {
		if(isEven(number)) {
			return false;
		} else {
			for(long i = 3; i < number - 1; i += 2) {
				if(number % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long saveGreatestFactor = 0L;
		long number = 600851475143L;
		final long numberToCheck = Math.round(Math.sqrt(number));
		
		for(long i = 3; i < numberToCheck; i++) {
			if(number % i == 0) {
				if(isPrime(i)) {
					saveGreatestFactor = i;
					System.out.println("Factor: " + i);
				}
			}
		}
		
		System.out.println("\nGreatest Prime Factor of " + number + " : " + saveGreatestFactor);
	}

}
