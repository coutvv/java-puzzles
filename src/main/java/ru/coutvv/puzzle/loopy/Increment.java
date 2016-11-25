package ru.coutvv.puzzle.loopy;

/**
 * why   ? ++ - post-fix оператор, значение выражения j++ это оригинальное j до инкремента. тобишь происходит следующее : int tmp = j; j = j + 1; j = tmp;
 * fix	 ? удалить лишнее присваивание, тупо j++;  
 *
 * moral : 
 * 			- Не присваивай одну и туже переменную больше одного раза в едином выражении! 
 *   
 * @author coutvv
 */
public class Increment {

	public static void main(String[] args) {
		int j = 0;
		for(int i = 0; i < 100; i++) {
			j = j++;
		}
		System.out.println(j);
	}
}
