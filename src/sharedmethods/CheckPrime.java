package sharedmethods;

public class CheckPrime {

	private static boolean isEven(long number) {
		if(number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	static public boolean isPrime(long number) {
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

}
