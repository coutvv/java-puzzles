package ru.coutvv.puzzle.character;

/**
 * why   ? вызывается toString обжекта, в котором строится строка из названия класса "[C" и хешкод объекта, в alt() представлена идея почему не
 * fix	 ?  System.out.println(letters + " easy as " + String.valueOf(numbers)); 
 *
 * moral : 
 * 			- массивы чаров нифига не строки!! Всегда Конверть массив чаров в строку
 *   
 * @author coutvv
 */
public class Abc {

	public static void main(String[] args) {
		String letters = "ABC";
		char[] numbers = {'1', '2', '3'};
		System.out.println(letters + " easy as " + numbers);
	}
	
	
	private static void alt() {
		Object numbers = new char[] {'1', '2', '3'};
		System.out.println(numbers);
	}
}
