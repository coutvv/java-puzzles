package ru.coutvv.puzzle.advanced;

/**
 * Теория:  Операция ~ является equivalence тогда и только тогда, 
 * 			если она обладает свойствами:
 * 				1). Рефлексивность. x ~ x для ∀ x 
 * 				2). Транзитивность. если x ~ y && y ~ z then x ~ z
 * 				3). Симметрия. если x ~ y то и y ~ x
 * 
 * Практика:
 * 			В Java оператор == очень удивительный...
 * 
 * Мораль :
 * 			- будьте в сотый раз осторожнее, при переводе примитивов в float/double, сраное сравнение!
 * 			- вообще говоря, остерегайтесь любых операций где смешиваются примитивы разных типов 
 * 
 * @author lomovtsevrs
 */
public class StrainedRelations {

	public static void main(String[] args) {
		//рушим рефлексивность
		System.out.println(Float.NaN == Float.NaN);//для даблов также
		
		//ломаем транзитивность!		
		long x = Long.MAX_VALUE;
		double y = (double) Long.MAX_VALUE;
		long z = Long.MAX_VALUE -1;
		System.out.print((x == y) + " ");//неточно
		System.out.print((y == z) + " ");//неточно
		System.out.println(x == z);		 //точно!!
	}
}
