package ru.coutvv.puzzle.morelib;

/**
 * why   ? тред не стартуется, а тупо исполняется метод run в том же потоке что и main
 * fix	 ? запустить поток t.start();
 *
 * moral : 
 * 			- be careful about invoke thread's run method instead of start
 *   
 * @author coutvv
 */
public class PingPong {

	public static synchronized void main(String[] args) throws InterruptedException {
		Thread t = new Thread() {
			public  void run() {pong();};
		};
		
		t.start();
		System.out.println("Ping");
	}
	
	static synchronized void pong() {
		System.out.println("Pong");
	}
}
