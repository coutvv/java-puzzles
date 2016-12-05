package ru.coutvv.puzzle.library;

import java.util.IdentityHashMap;
import java.util.Map;

/**
 * why   ? строковые литералы идентичны друг другу, поэтому всё норм
 *
 * moral : 
 * 			- не юзать IdentityHashMap пока не понадобится identic-based семантика
 *   
 * @author coutvv
 */
public class NameGame {

	public static void main(String[] args) {
		Map<String, String> m = new IdentityHashMap<String, String>();
		m.put("Mickey", "Mouse");
		m.put("Mickey", "Mantle");
		System.out.println(m.size());
	}
	
//	public static void main(String[] args) { // вэтом случае выведет 2
//		Map<String, String> m = new IdentityHashMap<String, String>();
//		String mick = new String("Mickey");
//		m.put(mick, "Mouse");
//		m.put("Mickey", "Mantle");
//		System.out.println(m.size());
//	}
}
