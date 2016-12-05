package ru.coutvv.puzzle.library;

/**
 * why   ? abs(INTEGER_MINIMUM) == INTEGER_MINIMUM, блииин, мы же проходили уже!
 * fix	 ? написать свой mod метод с блэкджеками и... 
 *
 * moral : 
 * 			- Math.abs не гарантирует что вернёт положительное число
 *   
 * @author coutvv
 */
public class Mod {

	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE == -Integer.MIN_VALUE);
		final int MODULUS = 3;
		int[] histogram = new int[MODULUS];
		
		int i = Integer.MIN_VALUE;
		do {
			int val = Math.abs(i);
			histogram[val % MODULUS]++;
		} while(i++ != Integer.MAX_VALUE);
		
		for(int j = 0; j < MODULUS; j++) {
			System.out.print(histogram[j] + " ");
		}
	}
	
	//this method... правильное деление отрицательных чисел -2 % 3 == 1, i.e. i = -34, modus = 3; i = modus * q + result; q = -12, result = 2 
//	private static int mod(int i, int modus) {
//		int result = i % modus;
//		return i < 0 ? result + modus : result;
//	}
	
	
}
