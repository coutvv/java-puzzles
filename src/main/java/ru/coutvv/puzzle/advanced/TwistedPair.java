package ru.coutvv.puzzle.advanced;

/**
 * why   ? потому что видит метод родительского класса!
 * fix	 ? make method name protected again!
 *
 * moral : 
 * 			- если посмотрев нельзя сказать что делает
 * 			программа, возможно стоит её переписать? 
 *   
 * @author coutvv
 */
public class TwistedPair {

	private final String name;
	
	TwistedPair(String name) {
		this.name = name;
	}
	
	private String name() {
		return name;
	}
	
	private void reproduce() {
		new TwistedPair("reproduce") {
			void printName() {
				System.out.println(name());
			}
		}.printName();
	}
	
	public static void main(String[] args) {
		new TwistedPair("main").reproduce();
	}
}
