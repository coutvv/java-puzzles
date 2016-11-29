package ru.coutvv.puzzle.exceptional;

/**
 * task  ? остановить поток(???) ибо thread.stop устарел
 * solve ? чёто херь какая-то если честно
 *
 * moral : 
 * 			-
 *   
 * @author coutvv
 */
public class ThreadingUnsafe {

	public static void sneakyThrow(Throwable t) {
		Thread.currentThread().stop(t);
	}
	
	public static void main(String[] args) throws Throwable {
//		sneakyThrow(new Exception("shitty"));
//		new ThreadingUnsafe();
		//
		sneakyThrowA(new Exception("shitty"));
	}
	
	
	
	private ThreadingUnsafe() throws Throwable {
		throw t;
	}
	
	static Throwable t;
	public static void sneakyThrowA(Throwable t) {
		ThreadingUnsafe.t = t; 
		try {
			ThreadingUnsafe.class.newInstance();
		} catch (InstantiationException e) {
			throw new IllegalArgumentException();
		}  catch (IllegalAccessException e2) {
			throw new IllegalArgumentException();
		} finally {
			ThreadingUnsafe.t = null;
		}
	}
}
