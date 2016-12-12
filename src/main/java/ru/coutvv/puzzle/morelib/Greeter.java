package ru.coutvv.puzzle.morelib;

/**
 * why   ? метод write(int) не вываливает записываемое
 * fix	 ? добавить System.out.flush() после цикла или использовать стандарнтый print();
 *
 * moral : 
 * 			- используйте знакомые вещи везде где только возможно
 * 			- консультируйтесь с документацией при использовании незнакомого апи
 *   
 * @author coutvv
 */
public class Greeter {

	public static void main(String[] args) {
		String greeting = "Hello world";
		for(int i = 0 ; i < greeting.length(); i++) 
			System.out.write(greeting.charAt(i));
		
	}
}
