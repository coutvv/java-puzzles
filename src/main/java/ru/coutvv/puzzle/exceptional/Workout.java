package ru.coutvv.puzzle.exceptional;

/**
 * why   ? это не бесконечный цикл =) тут бинарное дерево stackoverflow'ов создаётся и пока оно построится, пройдёт 10^291 лет, что дофига
 *
 * moral : 
 * 			- в общем, читайте умные книжки, это интересно =)
 *   
 * @author coutvv
 */
public class Workout {

	private static void workHard() {
		try {
			workHard();
		} finally {
			workHard();
		}
	}
	
	public static void main(String[] args) {
		workHard();
		System.out.println("It's a nap time!");
	}
}
