package ru.coutvv.puzzle.classier.totalnamereuse;

/**
 * Сокрытие(статические методы, поля или типы)
 * 
 * @author lomovtsevrs
 */
public class Hiding {

	public static void main(String[] args) {
	}

	private static class Base {
		public static void f() {System.out.println("method");};
	}
	
	private static class Derived extends Base {
		public static void f() {System.out.println("overrides!");}//hides Base.f();
	}
}
