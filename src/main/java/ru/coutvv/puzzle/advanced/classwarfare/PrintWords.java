package ru.coutvv.puzzle.advanced.classwarfare;

/**
 * what ?   При использовании того же бинарника printwords 
 * 			для другой библиотеки будет оч интересный результат
 * why  ?   Ссылочки на константы будут заменены на значения во время компиляции
 * 			а null - не compile-time константное выражение
 * 
 * moral : 
 * 			- enum-константы не являются константными переменными
 * 			- константные переменные при компиляции заменяются на 
 * 			переменные на которые они ссылаются. Это могут быть 
 * 			примитивы и строки, которые инициализируются как константные 
 * 			выражения.
 * 			- SURPRISE MOTHER FUCKER! null не является константной переменной
 * 
 * @author lomovtsevrs
 */
public class PrintWords {

	public static void main(String[] args) {
		System.out.println(Words.FIRST + " " +
						   Words.SECOND + " " + 
							Words.THIRD);
	}
}
