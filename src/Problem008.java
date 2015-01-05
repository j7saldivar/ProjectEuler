/**
 * 
 * @author Jorge.Saldivar
 *
 * The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.
 * 
 * File Problem008.txt
 * 
 * Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. 
 * What is the value of this product?
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem008 {

	static String readFile() {

		String thousandDigits = "";

		try (BufferedReader br = new BufferedReader(
				new FileReader(
						"C:\\Users\\jorge.saldivar\\git\\ProjectEuler\\files\\Problem008.txt"))) {

			String readCurrentLine;

			while ((readCurrentLine = br.readLine()) != null) {
				thousandDigits += readCurrentLine;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return thousandDigits;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long largestProduct = 0;
		long product = 1;
		String thousandDigits = readFile();
		String productString = "";

		for (int i = 0; i + 12 < thousandDigits.length(); i++) {

			product = 1;

			for (int j = i; j < i + 13; j++) {
				product *= Integer.parseInt(String.valueOf((thousandDigits
						.charAt(j))));
			}

			if (product > largestProduct) {
				largestProduct = product;
				productString = "";

				for (int j = i; j < i + 13; j++) {
					productString += String.valueOf((thousandDigits.charAt(j)))
							+ " x ";
				}

			}

		}

		System.out.println(productString.substring(0,
				productString.length() - 3) + " = " + largestProduct);

	}

}
