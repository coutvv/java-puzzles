package ru.coutvv.puzzle;

/**
 * puzzle [ The Case of the Confusing Constructor ]
 * 
 * why   ? Когда применяется перегруженный конструктор выигрывает наиболее специфичный 
 * fix	 ? обычно такое не встречается и не нужно, но если очень хочется тупо кастуем: (Object)null
 *
 * moral : 
 * 			- Избегай перегрузок конструктора!
 * 			- Если уж перегружаешь -- избегай неопределённости
 * 			- Если допускаешь неопределённость -- сделай поведение идентичным
 * 			- Если таки используешь подобный говнокласс -- уточни свои намерения кастом(см. fix) 
 *   
 * @author coutvv
 */
public class Confusing {

	public Confusing(Object o){
		System.out.println("Object");
	}
	
	public Confusing(double[] dArray) {
		System.out.println("double array");
	}
	
	
	public static void main(String[] args) {
		new Confusing(null);
//		new Confusing((Object)null); //fix
	}
}
