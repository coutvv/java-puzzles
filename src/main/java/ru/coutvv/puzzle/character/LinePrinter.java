package ru.coutvv.puzzle.character;

/**
 * originally : Unicode in comment was without // before
 * why   ? символ \u000A в комменте переносит строку проги и утю
 * fix	 ? не юзать unicode-последовательности в комментах?  
 *
 * moral : 
 * 			-
 *   
 * @author coutvv
 */
public class LinePrinter {

	public static void main(String[] args) {
		// Note: \u000A //Unicode representation of linefeed
		char c = 0x000A;
		System.out.println(c);
	}
}
