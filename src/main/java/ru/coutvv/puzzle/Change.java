package ru.coutvv.puzzle;

import java.math.BigDecimal;

/**
 * puzzle [ Time for a Change ]
 * 
 * why   ? десятичные значения не точны
 * fix	 ? use BigDecimal
 *
 * moral : 
 * 			- Избегай float и double там, где необходима точность
 * 			- Используй вместо них BigDecimal, int или long
 *   
 * @author coutvv
 */
public class Change {
	public static void main(String[] args) {
		
		System.out.println(2.00 - 1.10);
//		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10"))); //fix
	}
}
