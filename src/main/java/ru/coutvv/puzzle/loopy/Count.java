package ru.coutvv.puzzle.loopy;

/**
 * why   ? 50 слишком маленькое число для 2млрд, поэтому float 2e09 == 2000000050, пипец да?
 * fix	 ? int > float'ов в точности... -_-
 *
 * moral : 
 * 			- не используй числа с плавающей точкой для отсчёта итераций в циклах, еп
 * 			- на изичь теряется точность при конвертации int/long в float/double
 * 			- прдпочитай double вместо float
 *   
 * @author coutvv
 */
public class Count {
	public static void main(String[] args) {
		final int START = 2000000000;
		int count = 0; 
		for(float f = START; f < START + 50; f++) {
			count++;
		}
		System.out.println(count);
	}
}
