package ru.coutvv.puzzle.expressive;

/**
 * why   ? порядок: int tmp1 = x, tmp 2 = y, tmp3 = x ^ y; x = tmp3; y = tmp2 ^ tmp3; x = tmp1 ^ y;
 * fix	 ? y = (x ^= (y ^= x)) ^ y;
 *
 * moral : 
 * 			- НЕ ПРИСВАИВАЙТЕ ОДНУ И ТУЖЕ ПЕРЕМЕННУЮ НЕСКОЛЬКО РАЗ В ЕДИНОМ ВЫРАЖЕНИИ!!!
 * 			- избегайте ловких трюков, они не очень в жабе
 *   
 * @author coutvv
 */
public class CleverSwap {
	public static void main(String[] args) {
		int x = 1984;
		int y = 2001;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		x ^= y ^= x ^= y;
		System.out.println("x = " + x + "; \t y = " + y);
	}
}
