/**
 * 
 * @author Jorge.Saldivar
 *
 * Problem Description In the 20×20 grid below, four numbers along a
 * diagonal line have been marked in red.
 *         
 * File Problem011.txt
 *         
 * The product of these numbers is 26 × 63 × 78 × 14 = 1788696. What is the
 * greatest product of four adjacent numbers in the same direction (up,
 * down, left, right, or diagonally) in the 20×20 grid?
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem011 {

	private static Integer[][] readFile() {

		String[] readLineTemporal = new String[20];
		Integer[][] thousandDigits = new Integer[20][20];
		int left, right;
		left = right = 0;

		try (BufferedReader br = new BufferedReader(
				new FileReader(
						"C:\\Users\\jorge.saldivar\\git\\ProjectEuler\\files\\20x20Problem011.txt"))) {

			String readCurrentLine;

			while ((readCurrentLine = br.readLine()) != null) {
				readLineTemporal = readCurrentLine.split(" ");

				right = 0;
				for (String s : readLineTemporal) {
					thousandDigits[left][right] = Integer.parseInt(s);
					right++;
				}
				left++;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return thousandDigits;

	}

	private static long checkSides(Integer[][] thousandDigits, int i, int j) {

		long right, left, down, up, downRight, downLeft;
		right = left = down = up = downRight = downLeft = 1;

		for (int k = 0; k < 4; k++) {

			// Check Right
			if (j + k < 20) {
				right *= thousandDigits[i][j + k];
			}

			// Check Left
			if (j - k >= 0) {
				left *= thousandDigits[i][j - k];
			}

			// Check Down
			if (i + k < 20) {
				down *= thousandDigits[i + k][j];
			}

			// Check Up
			if (i - k >= 0) {
				up *= thousandDigits[i - k][j];
			}

			// Check Diagonal Down Right
			if (i + k < 20 && j + k < 20) {
				downRight *= thousandDigits[i + k][j + k];
			}

			// Check Diagonal Down Left
			if (i + k < 20 && j - k >= 0) {
				downLeft *= thousandDigits[i + k][j - k];
			}

		}

		return findMax(right, left, down, up, downRight, downLeft);

	}

	private static long getGreatestProduct(long product, long greatestProduct) {
		if (product > greatestProduct) {
			greatestProduct = product;
		}
		
		return greatestProduct;
	}

	private static long findMax(long... vals) {
		long max = 0;

		for (long l : vals) {
			if (l > max)
				max = l;
		}

		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[][] thousandDigits = readFile();
		long product = 1;
		long greatestProduct = 1;

		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				product = checkSides(thousandDigits, i, j);
				greatestProduct = getGreatestProduct(product, greatestProduct);
			}
		}

		System.out.println(greatestProduct);
	}
}
