package ru.coutvv.puzzle.character;

/**
 * why   ? 1). + > == 2). ==  -- равенство по ссылкам
 * fix	 ? equals
 *
 * moral : 
 * 			- юзай equals вместо ==, и не забывай про очерёдность операций!
 *   
 * @author coutvv
 */
public class AnimalFarm {

	public static void main(String[] args) {
		final String pig = "length: 10";
		final String dog = "length: " + pig.length();
		System.out.println("animals is equal: " + pig == dog);
	}
	
}
