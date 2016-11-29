package ru.coutvv.puzzle.exceptional.cutclass;
/**
 * Если удалить Missing.class тута всё словится, как так то? 
 * 
 * @author lomovtsevrs
 */
public class Strange2 {

	public static void main(String[] args) {
		Missing m;
		try {
			m = new Missing();
		} catch (NoClassDefFoundError e) {
			System.out.println("Got it!");
		}
	}
}