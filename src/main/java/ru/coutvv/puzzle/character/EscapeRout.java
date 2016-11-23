package ru.coutvv.puzzle.character;

/**
 * why   ? unicode-выражение обрабатывается компилятором как символ и происходит такая хня. в итоге две ленгтх(1+1) складываются и получается 2
 * fix	 ? экранировать символы(в данном случае ")
 *
 * moral : 
 * 			- никогда не использовать unicode-escapes для ASCII-символов, вместо этого юзать экранирование!!!
 *   
 * @author coutvv
 */
public class EscapeRout {

	public static void main(String[] args) {
		// \u0022 is the Unicode escape for double quate (")
		System.out.println("a\u0022.length() + \u0022b".length());
	}
}
