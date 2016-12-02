package ru.coutvv.puzzle.library;

import java.util.HashSet;
import java.util.Set;
/**
 * puzzle [ What's in a Name? ]
 * 
 * why   ? Объект в сете, но сет не может найти его потому что класс Name нарушает контракт hashCode
 * fix	 ? Переопределить метод hashCode класса Name  
 *
 * moral : 
 * 			- ВСЕГДА переопределяйте метод hashCode когда переопределяете метод equals
 * 			- соблюдайте контракты при переопределении метода 
 * 			- про/перечитайте Effective Java chapter 03  
 * 			- при поиске в хешсете, сравниваются хэшкоды, ибо дешевле сравнения объектов
 * @author coutvv
 */
public class Name {
	private String first, last;
	public Name(String first, String last) {
		this.first = first;
		this.last =last;
	}
	
	public boolean equals(Object o)  {
		if(!(o instanceof Name) ) return false;
		Name n = (Name) o;
		return n.first.equals(first) && n.last.equals(last);
	}
	
	// решение
//	public int hashCode() {
//		return 31 * first.hashCode() + last.hashCode();
//	}
	
	public static void main(String[] args) {
		Set s = new HashSet();
		s.add(new Name("Donald", "Duck"));
		System.out.println(s.contains(new Name("Donald", "Duck")));
	}
}
