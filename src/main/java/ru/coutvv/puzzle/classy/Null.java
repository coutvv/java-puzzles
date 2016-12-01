package ru.coutvv.puzzle.classy;

/**
 * why   ? greet -- статичный метод, и наличие объекта(само его существование) игнорируется
 *
 * moral : 
 * 			- всегда вызывайте статичный метод через класс!!! или не вызывайте вообще нахер!
 *   
 * @author coutvv
 */
public class Null {

	public static void greet() {
		System.out.println("Hello World!");
	}

	public static void main(String[] args) {
		((Null) null).greet();
	}
}
