package ru.coutvv.puzzle.classier.deal.hack;

import ru.coutvv.puzzle.classier.deal.click.CodeTalk;

/**
 * why   ?  методы ограниченные пакетом не могут быть переопределены вне этого пакета
 * fix	 ?  пометить переопределяемый метод в суперклассе как protected или public
 *
 * moral : 
 * 			- тоже что и в fix... :peka:
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
