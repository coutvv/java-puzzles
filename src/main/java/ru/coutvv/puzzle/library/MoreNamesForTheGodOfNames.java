package ru.coutvv.puzzle.library;

import java.util.HashMap;
import java.util.Map;

/**
 * why   ? Конструктор!!! :peka:
 * fix	 ? remove void у типа конструктора
 *
 * moral : 
 * 			- будь внимателен =)
 *   
 * @author coutvv
 */
public class MoreNamesForTheGodOfNames {

	private Map<String, String> m = new HashMap<String, String>();
	
	public void MoreNamesForTheGodOfNames() {
		m.put("Mickey", "Mouse");
		m.put("Mickey", "Mantle");
	}
	
	public int size() {
		return m.size();
	}
	
	public static void main(String[] args) {
		MoreNamesForTheGodOfNames mn = new MoreNamesForTheGodOfNames();
		System.out.println(mn.size());
	}
}
