/**
 * 
 * @author Jorge Saldivar
 *
 * Problem Description
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 
 * without any remainder. What is the smallest positive number that is evenly divisible 
 * by all of the numbers from 1 to 20?
 */

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean keepLoop = true;
		int smallestNumber = 20;
		
		while (keepLoop) {
			smallestNumber++;
			
			for(int i = 1; i <= 20 ; i++) {
				if(smallestNumber % 1 == 0) {
					if(smallestNumber % 2 == 0) {
						if(smallestNumber % 3 == 0) {
							if(smallestNumber % 4 == 0) {
								if(smallestNumber % 5 == 0) {
									if(smallestNumber % 6 == 0) {
										if(smallestNumber % 7 == 0) {
											if(smallestNumber % 8 == 0) {
												if(smallestNumber % 9 == 0) {
													if(smallestNumber % 10 == 0) {
														if(smallestNumber % 11 == 0) {
															if(smallestNumber % 12 == 0) {
																if(smallestNumber % 13 == 0) {
																	if(smallestNumber % 14 == 0) {
																		if(smallestNumber % 15 == 0) {
																			if(smallestNumber % 16 == 0) {
																				if(smallestNumber % 17 == 0) {
																					if(smallestNumber % 18 == 0) {
																						if(smallestNumber % 19 == 0) {
																							if(smallestNumber % 20 == 0) {
																								keepLoop = false;
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			
		}
		
		System.out.println(smallestNumber);
		

	}

}
