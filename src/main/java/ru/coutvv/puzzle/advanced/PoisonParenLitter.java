package ru.coutvv.puzzle.advanced;

/**
 * task  : написать выражение в котором, если добавить скобок код перестанет компилироваться
 * 
 * solve :  INTEGER_MAX = 2147483647
 * 			LONG_MAX = 9223372036854775807L
 * 			и скобки начинают всё портить ^_^
 * 
 * moral :
 * 			- it's amusing, that's it? ¯\_(ツ)_/¯
 * 
 * @author lomovtsevrs
 */
public class PoisonParenLitter {

	public static void main(String[] args) {
		int i = -2147483648;//legal
//		i = -(2147483648); //illegal
		
		
		long j = -9223372036854775808L;//legal
//		j = -(9223372036854775808L);//illegal
	}
}
