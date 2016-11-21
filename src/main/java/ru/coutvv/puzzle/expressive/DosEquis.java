package ru.coutvv.puzzle.expressive;

/**
 * why   ? вызывается println один для char'a другой для инта, 
 * fix	 ? сделать 2 и 3 операнд оператора ? одним типом
 *
 * moral : 
 * 			- всегда использовать одинаковые типы операндов в условном выражении
 *   
 * @author coutvv
 */
public class DosEquis {

	public static void main(String[] args) {
		char x = 'X';
		int i = 0;
		System.out.println(true ? x : 0);
		System.out.println(false ? i : x);
	}
}
