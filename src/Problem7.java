
public class Problem7 {

	static boolean isEven(long number) {
		if(number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	static boolean isPrime(long number) {
		if(isEven(number) && number != 2) {
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
		int counter = 0;
		long number = 2;
		while(counter < 10_001) {
			if(isPrime(number)) {
				counter++;
				System.out.println(number + " ");
			}
			number++;
		}

	}
}
