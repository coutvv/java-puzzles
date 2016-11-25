package ru.coutvv.puzzle.loopy;

/**
 * why   ? % и * имеют равную силу
 * fix	 ?  скобочки решают всё, а вообще лучше избавиться от магических чисел 
 *
 * moral : 
 * 			- храни все магические чиисла в константах
 *   
 * @author coutvv
 */
public class Clock {
	
	public static void main(String[] args) {
		int minutes = 0;
		for(int ms = 0; ms < 60*60*1000; ms++) {
			if(ms%60*1000 == 0) {
				minutes++;
			}
		}
		System.out.println(minutes);
	}
}
