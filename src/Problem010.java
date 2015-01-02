/**
 * 
 * @author Jorge.Saldivar
 *
 * Problem Description
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */

import static sharedmethods.CheckPrime.isPrime;

public class Problem010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 0;
		int loading = 10;

		for (int i = 2; i < 2_000_000; i++) {
			if(i % 200_000 == 0) {
				System.out.println("Loading " + loading + "%");
				loading += 10;
			}
			
			if (isPrime(i)) {
				sum += i;
			}
		}

		System.out.println("\nThe sum is: " + sum);
		
	}

}
