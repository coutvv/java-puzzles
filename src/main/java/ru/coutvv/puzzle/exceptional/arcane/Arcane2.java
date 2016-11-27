package ru.coutvv.puzzle.exceptional.arcane;
/**
 * why   ? скомиплится ибо Exception & Throwable законные представители трая!
 *
 * moral : 
 * 			- тоже что и аркан1, только иллюстрирует, где на те условия пофиг
 *   
 * @author coutvv
 */
public class Arcane2 {
	public static void main(String[] args) {
		try {
			// If you have nothing nice to say, say nothing
		} catch (Exception e) {
			System.out.println("This can't happen");
		}
	}
}
