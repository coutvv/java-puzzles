package ru.coutvv.puzzle.loopy;

/**
 * why   ? операции << >> >>> используют только 5(6 если лонг) последних битов правого выражения, тобишь максимум 31(63) разряда можно за раз сдвинуть
 * fix	 ? использовать цикл for (int val = -1; val != 0; val <<= 1)
 *
 * moral : 
 * 			- размер сдвига должен быть по возможности константой
 *   
 * @author coutvv
 */
public class Shifty {

	public static void main(String[] args) {
		int i = 0; 
		while(-1 << i != 0) 
			i++;
		System.out.println(i);
	}
	
}

