package ru.coutvv.puzzle.classier.totalnamereuse;

/**
 * Переопределение
 * 
 * @author lomovtsevrs
 */
public class Overriding {

	public static void main(String[] args) {
		Base b = new Derived();
		b.f();
	}

	private static class Base {
		public void f() {System.out.println("method");};
	}
	
	private static class Derived extends Base {
		public void f() {System.out.println("overrides!");}//overrides Base.f();
	}

}
