package ru.coutvv.puzzle.classy;

/**
 * why   ? двойная сумма, потому что статик блок инициализируется раньше initialized, а затем инициализируется initialized == false и по новой! 
 * fix	 ? поместить статик блок позже поля initialized, но это убого... -_- лучше перепишите с одной инициализацией! (как пример есть внизу)
 *
 * moral : 
 * 			- используйте либо "горячую" инициализацию, либо ленивую инициализацию, а не обе... -_-
 * 			- ещё раз! продумайте порядок инициализации в классе! Особенно если всё непросто!
 *   
 * @author coutvv
 */
public class SumFun {

	public static void main(String[] args) {
		System.out.println(Cache.getSum());
	}
	
}

class Cache {
	static {
		initializeIfNecessary();
	}
	
	private static int sum;
	
	public static int getSum() {
		initializeIfNecessary();
		return sum;
	}
	
	private static boolean initialized = false;
	
	private static synchronized void initializeIfNecessary() {
		if(!initialized) {
			for(int i = 0; i < 100; i++) {
				sum += i;
			}
			initialized = true;
		}
	}
}

//class Cache {
//	private static final int sum = computeSum();
//	private static int computeSum() {
//		int result = 0;
//		for(int i = 0; i< 100; i++) {
//			result += i;
//		}
//		return result;
//	}
//	
//	public static int getSum() {
//		return sum;
//	}
//}
