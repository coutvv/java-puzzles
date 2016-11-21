package ru.coutvv.puzzle.expressive;

/**
 * task  ? написать код, в котором x += i; работает, а x = x + i не работает 
 * why   ? x += i делает следующее: x = (typeofX) (x + i), то есть кастует в тип x, в другом выражении этого нет 
 *
 * moral : 
 * 			- не использовать комбинированные присваивания на типах byte, short, char
 *   
 * @author coutvv
 */
public class Tweedledum {

	public static void main(String[] args) {
		int i = 123456;
		short x = 0;
		
		x += i;
		System.out.println(x+0);
//		x =x + i; //uncomment
	}
}
