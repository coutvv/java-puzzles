package ru.coutvv.puzzle.expressive;

/**
 * why   ? метод isOdd не работает для отрицательных чисел
 * fix	 ? n%2 != 0;
 *
 * moral : 
 * 			- следите за знаками операндов, когда получаете осстаток
 *   
 * @author coutvv
 */
public class Oddity {

	public static boolean isOdd(int n){
		return n % 2 == 1;
	}
	
	public static void main(String[] args) {
		print(isOdd(2));
		print(isOdd( 3));
		print(isOdd(-1));
		print(isOdd(2));
	}
	
	public static void print(boolean b) {
		System.out.println(b);
	}
}
