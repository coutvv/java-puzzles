package ru.coutvv.puzzle.library;

import java.math.BigInteger;

/**
 * why   ? BigInteger неизменяемый тип, метод add возвращает новый инстанс, а не прибавляет к текущему
 * fix	 ? total = total.add(someBigInteger); //so etc/  
 *
 * moral : 
 * 			- названия методов могут ввести заблуждение, be careful!!!
 *   
 * @author coutvv
 */
public class BigProblem {

	public static void main(String[] args) {
		BigInteger fiveThousand = new BigInteger("5000");
		BigInteger fiftyThousand = new BigInteger("50000");
		BigInteger fiveHundredThousand = new BigInteger("500000");
		BigInteger total = BigInteger.ZERO;
		total.add(fiveThousand);
		total.add(fiftyThousand);
		total.add(fiveHundredThousand);
		System.out.println();
	}
}
