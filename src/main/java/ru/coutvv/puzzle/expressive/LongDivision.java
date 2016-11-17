package ru.coutvv.puzzle.expressive;

/**
 * why   ? Потому что перемножаются инты и получаем интовый результат умножения -> переполнение MICROS_PER_DAY
 * fix	 ? При каждом перемножении ставить литерал L в первом множителе
 *
 * moral : 
 * 			- Когда работаешь с большими числами следи за переполнением -- оно тихий убийца!
 *   
 * @author coutvv
 */
public class LongDivision {

	public static void main(String[] args) {
		final long MICROS_PER_DAY = 24*60*60*1000*1000;
		final long MILLIS_PER_DAY = 24*60*60*1000;
		System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
	}
}
