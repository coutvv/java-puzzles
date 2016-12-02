package ru.coutvv.puzzle.library;

import java.util.Calendar;
import java.util.Date;

/**
 * why   ? месяцы начинаются с 0, соответственно 12 -- 13ый месяц, getDay -- устаревший метод, показывающий день недели
 * fix	 ? использовать наркоманское апи Calendar  
 *
 * moral : 
 * 			- будь осторожен(следи за собой) в использовании Calendar и Date, это апи чёртово минное поле!
 *   
 * @author coutvv
 */
public class DatingGame {

	//original pazzle
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(1999, 12, 31);
		
		System.out.print(cal.get(Calendar.YEAR) + " ");
		
		Date d = cal.getTime();
		System.out.println(d.getDay());
	}
	
	//solving
//	public static void main(String[] args) {
//		Calendar cal  = Calendar.getInstance();
//		cal.set(1999, Calendar.DECEMBER, 31);
//		System.out.print(cal.get(Calendar.YEAR) + " ");
//		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
//	}
}

