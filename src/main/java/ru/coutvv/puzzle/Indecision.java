package ru.coutvv.puzzle;

/**
 * puzzle [ What's in a Name? ]
 * 
 * why   ? finally обязательно срабатывает после try, вообще без вариантов 
 * fix	 ? не тупить  
 *
 * moral : 
 * 			- избегать неожиданных завершений в блоке finally
 * 			тобишь не return'ить и не кидать исключения в finally 
 * 			заворачивать непредсказуемые действия во вложенных try 
 *   
 * @author coutvv
 */
public class Indecision {

	public static void main(String[] args) {
		System.out.println(waffle());
	}
	
	static boolean waffle() {
		try {
			return true;
		} finally {
			return false;
		}
	}
}
