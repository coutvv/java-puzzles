package ru.coutvv.puzzle.classier.totalnamereuse;

/**
 * Затенение(переменная, метод или тип)
 * 
 * @author lomovtsevrs
 */
public class Shadowing {

	static String sentence = "I don't know";
	
	public static void main(String[] args) {
		String sentence =" Fucking I know!";//затеняем статичное поле
		System.out.println(sentence);
	}
}
