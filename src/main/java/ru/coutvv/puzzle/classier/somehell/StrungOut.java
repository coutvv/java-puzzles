package ru.coutvv.puzzle.classier.somehell;

/**
 * why ? String в мэйне не совсем стринг, да? :peka:
 *
 * moral : 
 * 			- избегай такой херни, бро. Использование платформенных имён карается законом о защите чувтсв верующих, ага
 *   
 * @author coutvv
 */
public class StrungOut {
	
	public static void main(String[] args) {
		String s = new String("Hello World");
		System.out.println(s);
	}
}

class String {
	private final java.lang.String s;
	
	public String(java.lang.String s) {
		this.s = s;
	}
	
	public java.lang.String toString() {
		return s;
	}
}
