package ru.coutvv.puzzle.morelib;

/**
 * why   ? deadlock! мэйн ждёт инициализацию, инициализацию ждёт новый тред, новый тред ждёт инициализацию(ибо не доделалось же!)
 * fix	 ? не делать многопоточной херни на этапе инициализации, максимум свести t.join в main(), но и это херня та ещё...  
 *
 * moral : 
 * 			- ожидание в фоне во время инициализации классов к дедлоку ведёт , юный падаван
 * 			- делайте инициализацию классов максимально простой
 *   
 * @author coutvv
 */
public class Lazy {

	private static boolean initialized = false;
	
	static {
		Thread t = new Thread(new Runnable() {
			public void run() {
				initialized = true;
			}
		});
		t.start();
		try {
			t.join();
		} catch(InterruptedException e) {
			throw new AssertionError(e);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(initialized);
	}
}
