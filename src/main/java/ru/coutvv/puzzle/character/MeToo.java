package ru.coutvv.puzzle.character;

import java.io.File;

/**
 * why   ? в replaceAll второй аргумент тоже RegExp, в винде будет \ а это не валидно :(
 * fix	 ? использовать replace(".", File.separator), введённый в java 5  
 *
 * moral : 
 * 			- будь осторожен когда юзаешь малознакому библиотеку
 *   
 * @author coutvv
 */
public class MeToo {

	public static void main(String[] args) {
		System.out.println(
				Me.class.getName().replaceAll("\\.", File.separator) + ".class"
		);
	}
}
