package ru.coutvv.puzzle.classy.noturtype;

/**
 * moral : 
 * 			- оператор instanceof всегда выдаёт false, если левый операнд -- null
 * 			- это полезно, чтобы не боятся NullPointerException && ClassCastException 
 * 
 * @author lomovtsevrs
 */
public class Type1 {

	public static void main(String[] args) {
		String s = null;
		System.out.println(s instanceof String);
	}
}
