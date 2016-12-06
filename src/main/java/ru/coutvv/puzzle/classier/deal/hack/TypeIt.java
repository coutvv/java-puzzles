package ru.coutvv.puzzle.classier.deal.hack;

import ru.coutvv.puzzle.classier.deal.click.CodeTalk;

/**
 * why   ? 
 * fix	 ?   
 *
 * moral : 
 * 			-
 *   
 * @author coutvv
 */
public class TypeIt {

	private static class ClickIt extends CodeTalk {
		void printMessage() {
			System.out.println("Hack");
		}
	}
	
	public static void main(String[] args) {
		ClickIt clickit = new ClickIt();
		clickit.doIt();
	}
}
