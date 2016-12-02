package ru.coutvv.puzzle.library;

import java.util.HashSet;
import java.util.Set;

/**
 * why   ? Не переопределён метод equals(Object o); 
 * fix	 ? переопределить по-пацански equals
 *
 * moral : 
 * 			- ВСЕГДА переопределяйте метод equals когда переопределяете метод hashCode
 * 			- соблюдайте контракты при переопределении метода !!!!!
 * 			- про/перечитайте Effective Java chapter 03 again
 * 			- EQUALS TRUMP! make hashCode great again! 
 * 
 * @author coutvv
 */
public class NameAgain {
	private String first, last;
	public NameAgain(String first, String last) {
		this.first = first;
		this.last =last;
	}
	
	public boolean equals(NameAgain n)  {
		return n.first.equals(first) && n.last.equals(last);
	}
	
	public int hashCode() {
		return 31 * first.hashCode() + last.hashCode();
	}
	
	public static void main(String[] args) {
		Set s = new HashSet();
		s.add(new NameAgain("Donald", "Dick"));
		System.out.println(s.contains(new NameAgain("Donald", "Dick")));
	}
}
