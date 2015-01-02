/**
 * 
 * @author Jorge.Saldivar
 *
 * Problem Description
 * A palindromic number reads the same both ways. The largest palindrome made 
 * from the product of two 2-digit numbers is 9009 = 91 × 99. 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Problem004 {

	static boolean isPalindrome(String number) {
		String copyNumber = "";
		final int lastPosition = number.length() - 1;
		
		for(int i = 0; i < number.length(); i++) {
			
			copyNumber += number.charAt(lastPosition - i);
		}
		
		return number.equalsIgnoreCase(copyNumber);
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer product = 0;
		int largestProduct = 0;
		int largestLeftDigit = 0;
		int largestRightDigit = 0;
		
		for(int i = 1; i < 1000; i++) {
			for(int j = 1; j < 1000; j++) {
				product = i * j;
				if(isPalindrome(product.toString())) {
					if(largestProduct < product) {
						largestProduct = product;
						largestLeftDigit = i;
						largestRightDigit = j;
					}
				}
			}
		}
		
		System.out.println("Largest Palindrome: ");
		System.out.println("" + largestLeftDigit + " x " + largestRightDigit + " = " + largestProduct);
		
	}

}
