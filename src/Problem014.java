/**
 * 
 * @author Jorge.Saldivar
 *
 * Problem Description 
 * The following iterative sequence is defined for the set of positive integers:
 * n → n/2 (n is even) 
 * n → 3n + 1 (n is odd)
 * 
 * Using the rule above and starting with 13, we generate the following sequence:
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1 
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
 * Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 * 
 * Which starting number, under one million, produces the longest chain?
 * 
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */

public class Problem014 {

	static long isEven(long n) {
		return n / 2;
	}

	static long isOdd(long n) {
		return (3 * n) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sequence = 0;
		long terms = 0;
		long largestStartingSequence = 1;
		long largestChainTerms = 1;

		for (long i = 1; i < 1_000_000; i++) {

			sequence = i;
			terms = 1;

			while (sequence != 1) {
				
				if (sequence % 2 == 0) {
					sequence = isEven(sequence);
				} else {
					sequence = isOdd(sequence);
				}
				terms++;
			}

			if (terms > largestChainTerms) {
				largestChainTerms = terms;
				largestStartingSequence = i;
			}

		}

		System.out.println("Largest Starting Sequence: "
				+ largestStartingSequence);
		System.out.println("Number of terms: " + largestChainTerms);

	}

}
