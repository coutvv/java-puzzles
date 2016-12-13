package ru.coutvv.puzzle.morelib.dyslexic;

/**
 * Типа синглтон
 * 
 * @author lomovtsevrs
 */
public class Dog extends Exception {

	public static final Dog INSTANCE = new Dog();
	
	private Dog() {};
	
	public String toString() {
		return "Woof";
	}
	
//	private Object readResolve() { //fix creating another Dog object not INSTANCE
//		return INSTANCE;
//	}
}
