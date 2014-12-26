
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2;
		int c = a + b;
		long sum = 2;
		
		while (c <= 4_000_000) {
			a = b;
			b = c;
			c = a + b;
			
			if(c % 2 == 0) {
				sum += c;
			}
		}
		
		System.out.println(sum);
	}

}
