package ru.coutvv.puzzle.expressive;

/**
 * task  ? написать код, в котором x += i; не работает, а x = x + i работает 
 * why   ? (x + i) -- объект типа String'a, += можно использовать только на примитивах и их боксах, но есть одно исключение -- стринги!!! 
 *
 * moral : 
 * 			- а нету, какая ещё может быть мораль
 *   
 * @author coutvv
 */
public class Tweedledee {

	public static void main(String[] args) {
		String x = "asdfasd a";
		Object i = "sdfasdf";
		i = x + i;
		System.out.println(i);
//		i += x; //illegal
	}
}
