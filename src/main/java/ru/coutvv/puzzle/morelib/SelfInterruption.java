package ru.coutvv.puzzle.morelib;

/**
 * why   ? interrupted очищает статус прекращения текущего потока
 * fix	 ? использовать isInterrupted
 *
 * moral : 
 * 			- не использовать interrupted, пока нет ясного понимания зачем
 *   
 * @author coutvv
 */
public class SelfInterruption {

	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		
		if(Thread.interrupted()) {
			System.out.println("Interrupted : " + Thread.interrupted());
		} else {
			System.out.println("Not interrupted : " + Thread.interrupted());
		}
	}
}
