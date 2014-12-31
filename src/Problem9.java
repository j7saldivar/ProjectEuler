/**
 * 
 * @author Jorge Saldivar
 *
 *         Problem Description A Pythagorean triplet is a set of three natural
 *         numbers, a < b < c, for which, a2 + b2 = c2
 * 
 *         For example, 32 + 42 = 9 + 16 = 25 = 52. There exists exactly one
 *         Pythagorean triplet for which a + b + c = 1000. Find the product abc.
 */

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		a = b = c = 0;

		outer: for (a = 1; a <= 1000; a++) {

			for (b = 1; b <= 1000; b++) {

				for (c = 1; c <= 1000; c++) {

					if ((a * a) + (b * b) == (c * c)) {

						if ((a + b + c) == 1000) {
							break outer;
						}
					}

				}

			}

		}

		System.out.println(a * b * c);
	}

}
