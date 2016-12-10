package ru.coutvv.puzzle.morelib;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import ru.coutvv.puzzle.morelib.thelib.Api;

/**
 * why   ? нельзя получить доступ к объекту, непубличного типа(класса)
 * fix	 ? берём метод напрямую из класса, к которому имеем доступ  
 *
 * moral : 
 * 			- нельзя обращаться к члену непубличного типа в другом пакете, 
 * 			даже если член помечен модификатором public
 *   
 * @author coutvv
 */
public class Reflector {

	public static void main(String[] args) throws Exception {
		Set<String> s = new HashSet<String>();
		s.add("foo");
		Iterator it = s.iterator();
		Method m = it.getClass().getMethod("hasNext");
//		Method m = Iterator.class.getMethod("hasNext"); //fixing!
		System.out.println(m.invoke(it));
	}
	
	//other example confirming this rule //not compile!
//	public static void main(String[] args) {
//		System.out.println(Api.member.hashCode());
//	}
}
