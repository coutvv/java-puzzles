package ru.coutvv.puzzle;
/**
 *	Здесь рассмотрим операции x += i && x = x + i;
 *   
 * @author coutvv
 */
public class CompoundLegalAndNotLegal {

	//случай 1
	/**
	 *  x += i; // разрешается
	 *  x = x + i; //запрещено
	 */
	private static void compoundLegal() {
		short x = 0;
		int i = 123456;
		x += i;
//		x = x + i; //не скомпилится
		System.out.println(x);
	}
	
	//случай 2
	/**
	 * x += i; //запрещено
	 * x = x + i; //разрешено
	 */
	private static void compoundIllegal() {
		Object x = "Object String";
		String i = "true string";
//		x += i;//не дозволено комплиятором
		x = x + i;//можна
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		compoundLegal();
		compoundIllegal();
	}
	
}
