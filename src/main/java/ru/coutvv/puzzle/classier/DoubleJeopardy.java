package ru.coutvv.puzzle.classier;

/**
 * why   ? модификатор final запрещает оверрайдить только методы, а поля нельзя переприсваивать.
 *
 * moral : 
 * 			- инкапсулируй, сучка!!
 *   
 * @author coutvv
 */
public class DoubleJeopardy extends Jeopardy{

	public static final String PRIZE = "2 cents";
	
	public static void main(String[] args) {
		System.out.println(DoubleJeopardy.PRIZE);
	}
	
}

class Jeopardy {
	public static final String PRIZE = "$64,000";
}
