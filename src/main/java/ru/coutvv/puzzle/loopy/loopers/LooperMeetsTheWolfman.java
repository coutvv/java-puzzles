package ru.coutvv.puzzle.loopy.loopers;

/**
 * переполнение минимального значения равно ему жи
 * 
 * следите за переполнением, будьте осторожны 
 * 
 * @author lomovtsevrs
 */
public class LooperMeetsTheWolfman {

	public static void main(String[] args) {
		
//		Integer i = Integer.MIN_VALUE;
		long i = Long.MIN_VALUE;
		System.out.println(i + " " + -i);
		while( i == -i && i != 0) {
			
		}
	}
}
