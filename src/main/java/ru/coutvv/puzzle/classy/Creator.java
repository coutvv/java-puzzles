package ru.coutvv.puzzle.classy;

//import java.util.concurrent.atomic.AtomicLong;

/**
 * why   ? не скомпилится потому что запрещено объявлять переменные внутри циклов(тобишь без блока {})
 * fix	 ? заключить в блок или убрать присваивание(нафига оно вообще?)  
 *
 * moral : 
 * 			- внутри безблочных циклов нельзя создавать локальные переменные
 * 			- используйте long для подсчёта всякой всячины, ибо создать так много объектов для overflow можно только за 3к лет
 * 			- при многопотовщине синхронизируйте доступ или используйте AtomicLong
 * 			- модификатор volatile гарантирует, что треды увидят самое свежее значение поля, но оно не гарантирует атомарную* инкрементацию 
 * 			  * атомарную инкрементация -- стопроцентное инкремнирование переменной, тобишь ты увеличиваешь значение переменной на 1 и следующее обращение к ней даст именно это значение
 *   
 * @author coutvv
 */
public class Creator {

	public static void main(String[] args) {
		for(int i = 0; i < 100; i++) 
//			Creation creation = new Creation(); //uncomment for original puzzle
			new Creation();//remove for original 
		System.out.println(Creation.numCreated());
	}
}


class Creation { //original
	private static long numCreated = 0;
	
	public Creation() {
		numCreated++;
	}
	
	public static long numCreated() {
		return numCreated;
	}
}

//class Creation { //для многопотовщины
//	private static long numCreated;
//	
//	public Creation() {
//		synchronized (Creation.class) {
//			numCreated++;	
//		}
//	}
//
//	public static long numCreated() {
//		return numCreated;
//	}
//}

//class Creation { //для многопотовщины 2
//	private static AtomicLong numCreated = new AtomicLong();
//	
//	public Creation() {
//		numCreated.incrementAndGet();
//	}
//	
//	public static long numCreated() {
//		return numCreated.get();
//	}
//}