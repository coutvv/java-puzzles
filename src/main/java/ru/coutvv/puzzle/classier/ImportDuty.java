package ru.coutvv.puzzle.classier;

//import static java.util.Arrays.toString;//original

import java.util.Arrays;


/**
 * why   ? this > import static
 * fix	 ? using standard import
 *
 * moral : 
 * 			- использовать статические импорты нужно очень редко и только по необходимости
 *   
 * @author coutvv
 */
public class ImportDuty {

	static void printArgs(Object... args) {
//		System.out.println(toString(args));//original
		System.out.println(Arrays.toString(args));//fixing
	}
	
	public static void main(String[] args) {
		printArgs(1,2,3,4,5);
	}
}
