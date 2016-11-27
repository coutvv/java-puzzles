package ru.coutvv.puzzle.exceptional.arcane;

/**
 * why   ? не скомпилится потому что ничего не выдаст IOException
 *
 * moral : 
 * 			- иллюстрация того что кэтч будет легален только если будет вероятность выкидыша соответствующего эксепшена в трае
 *   
 * @author coutvv
 */
public class Arcane1 {

	public static void main(String[] args) {
		//uncomment for original!!
//		try {
//			System.out.println("Hello World!");
//		} catch (IOException e) {
//			System.out.println("I’ve never seen println fail!");
//		}
	}
}
