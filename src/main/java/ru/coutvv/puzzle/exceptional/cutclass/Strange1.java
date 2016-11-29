package ru.coutvv.puzzle.exceptional.cutclass;

/**
 * Если удалить Missing.class тута вылетит экзепшн
 * 
 * @author lomovtsevrs
 */
public class Strange1 {

	public static void main(String[] args) {
		try {
			Missing m = new Missing();
		} catch (NoClassDefFoundError e) {
			System.out.println("Not Got it!");
		}
	}
}
