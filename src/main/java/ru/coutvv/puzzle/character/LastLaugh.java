package ru.coutvv.puzzle.character;

/**
 * why   ?  char -- число, с плюсом они и 72, 97 == 169
 * fix	 ?  new StringBuffer().append('H'); //присоединять можно так например
 * 			System.out.println("" + 'H' + 'a'); //или так
 *
 * moral : 
 * 			- оператор плюс соединяет операнды в строки, только если один из них является строккой!!!
 *   
 * @author coutvv
 */
public class LastLaugh {

	public static void main(String[] args) {
		System.out.println("H" + "a");
		System.out.println('H' + 'a');
	}
	
}
