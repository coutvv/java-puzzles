package ru.coutvv.puzzle.exceptional;

/**
 * why   ? System.exit закрывает выполнение текущего потока 
 * fix	 ? использовать shutdown hooks //закоменченый код
 *
 * moral : 
 * 			- System.exit останавливает все программные треды незамедлительно и плевать он хотел на блоки finally
 * 			- Используй shutdown hooks для закрытия всякой херни при exit'e программы
 *   
 * @author coutvv
 */
public class HelloGoodbye {

	public static void main(String[] args) {
		try {
			System.out.println("Hello World");
			System.exit(0);
		} finally {
			System.out.println("Goodbuy world");
		}
	}
	
//	public static void main(String[] args) {
//		System.out.println("Hello world");
//		Runtime.getRuntime().addShutdownHook(new Thread() {
//			public void run() {
//				System.out.println("Goodbuy world");
//			}
//		});
//		System.exit(0);
//	}
}
