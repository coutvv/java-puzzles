package ru.coutvv.puzzle.advanced;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

/**
 * why   ? Компилятор интерпретирует List<String> stringList() как List stringList()
 * 			из-за того что объект p не декларирует параметр в Pair
 * fix	 ?   Декларировать параметр: Pair<Object> p = new Pair<Object>(23, "skidoo");
 *
 * moral : 
 * 			- компилятор при разборе RAW-типа(непараметрезированных) стирает нахер все параметры 
 * 			у параметризированных типов полей и методов класса, чтобы симулировать поведение обычных типов
 * 			у дженериков(тип чтоб старый код работал с дженериками). Такая вот ситуёвина 
 * 			- тип List не то же самое, что параметризированный тип: List<Object> 
 * 			- ∃ клёвый подстановочный тип List<?>, не дающий засунуть ничего кроме null в этот список
 * 			- избегай использования RAW-типов(те которые не параметризированы)
 *   
 * @author coutvv
 */
public class Pair<T> {

	private final T first;
	private final T second;
	
	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}
	
	public T first() {
		return first;
	}
	
	public T second() {
		return second;
	}
	
	public List<String> stringList() {
		return Arrays.asList(String.valueOf(first), String.valueOf(second));
	}
	
	public static void main(String[] args) {
		Pair p = new Pair<Object>(23, "skidoo");
		
		System.out.println(p.first() + " " + p.second());
		//original uncomment below
//		for(String s : p.stringList()) { 
//			System.out.println(s + " ");
//		}
		
		try {
			Class c =Class.forName("ru.coutvv.puzzle.Trivial");
			System.out.println(c);
			Annotation ann = c.getAnnotation(Deprecated.class);
			System.out.println(ann);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
