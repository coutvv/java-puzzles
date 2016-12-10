package ru.coutvv.puzzle.library.oneliners;

/**
 * task : узнать больше ли единичек в одном интежере нежели в другом
 * 
 * solving : кучу операций для манипулирования битами есть в обёртках(изучи, а...)
 * 
 * @author lomovtsevrs
 */
public class HasMoreBitsInIntegerThan {

	public static void main(String[] args) {
		int i = 0B01010111;
		int j = 0B1111000;
		System.out.println(hasMoreBeatsSet(i, j));
	}
	
	static boolean hasMoreBeatsSet(int i, int j) {
		return (Integer.bitCount(i) > Integer.bitCount(j));
	}
}
