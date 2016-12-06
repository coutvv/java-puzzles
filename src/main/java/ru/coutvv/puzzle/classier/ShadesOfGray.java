package ru.coutvv.puzzle.classier;

/**
 * why   ? Всякий раз когда переменная и тип(класс) имеют одинаковое имя, переменная преобладает
 * 		   К слову, переменная и тип также принижают название пэкэджа
 *
 * moral : 
 * 			- следуй ковенции стандартного именования чтобы избежать конфликты нэймспейсов
 *   
 * @author coutvv
 */
public class ShadesOfGray {
	public static void main(String[] args) {
		System.out.println(X.Y.Z);
	}
}

class X {
	static class Y {
		static String Z = "Black";
	}
	static C Y = new C();
}

class C {
	String Z = "White";
}