package ru.coutvv.puzzle;


/**
 * puzzle [ A Private Matter ]
 * 
 * why   ? приватные методы не могут переписать публичные, но приватные поля могут скрыть публичные  
 *
 * moral : 
 * 			- Избегать скрывания разрушающего категоризацию
 * 			- Избегать публичных полей, вместо них использовать методы доступа(геттеры)
 *   
 * @author coutvv
 */
public class PrivateMatter {

	public static void main(String[] args) {
//		System.out.println(new Derived().name); //original puzzle
	}
}

class Base {
	public String name = "Base";
}

class Derived extends Base {
	private String name = "Derived";
}
