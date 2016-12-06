package ru.coutvv.puzzle.classier;

/**
 * task    ? вызывать Z класса Y не используя рефлексию и не меняя эти классы
 * solving : 1). обращаемся к классу таким образом, что синтактически вызвать поле не разрешает компилятор
 * 			 2). наследуемся от X2.Y
 * 			 3). Дженерики!!
 *
 * moral : 
 * 			- это всё чтобы повеселиться, никогда так не делайте!
 *   
 * @author coutvv
 */
public class FadeToBlack {
	
	class ShowY extends X2.Y { };
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		
		System.out.println(((X.Y)null).Z);//1
		System.out.println(ShowY.Z);//2
	}
	
	//3
//	public static <T extends X.Y> void main(String[] args) {
//		System.out.println(T.Z);
//	}
}

class X2 {
	static class Y {
		static String Z = "Black";
	}
	static C2 Y = new C2();
}

class C2 {
	String Z = "White";
}
