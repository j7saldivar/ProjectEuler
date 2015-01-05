/**
 * 
 * @author Jorge.Saldivar
 *  
 * Problem Description
 * Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
 * 
 * File Problem013.txt
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class Problem013 {

	private static String[] readFile() {

		String readLineTemporal = "";
		String[] returnString = new String[100];

		try (BufferedReader br = new BufferedReader(
				new FileReader(
						"C:\\Users\\jorge.saldivar\\git\\ProjectEuler\\files\\100Numbers50DigitsProblem013.txt"))) {

			String readCurrentLine;
			int i = 0;

			while ((readCurrentLine = br.readLine()) != null) {
				readLineTemporal += readCurrentLine;

				if (readLineTemporal.length() >= 50) {
					returnString[i] = readLineTemporal.substring(0, 50);

					if (readLineTemporal.length() > 50) {
						readLineTemporal = readLineTemporal.substring(50,
								readLineTemporal.length());
					} else {
						readLineTemporal = "";
					}
				}

				i++;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return returnString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] returnString = readFile();

		BigInteger sumBigIntFinal = new BigInteger("0");
		BigInteger sumBigInt = null;

		int i = 0;
		for (String s : returnString) {
			sumBigInt = new BigInteger(s);
			sumBigIntFinal = sumBigIntFinal.add(sumBigInt);

			if (i > 100) {
				break;
			}

			i++;
		}

		System.out.println(sumBigIntFinal.toString().substring(0, 10));

	}

}
