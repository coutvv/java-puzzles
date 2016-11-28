package ru.coutvv.puzzle.exceptional;

/**
 * why   ? instance-переменная инициализируется раньше конструктора и получается рекурсия... -_-
 * fix	 ? использовать методы-креаторы объектов полей класса
 *
 * moral : 
 * 			- поля инициализируются раньше конструкторов
 *   
 * @author coutvv
 */
public class Reluctant {

	private Reluctant internalInstance = new Reluctant();
	
	public Reluctant() throws Exception {
		throw new Exception("I'm not coming out");
	}
	
	public static void main(String[] args) {
		try {
			Reluctant b = new Reluctant();
			System.out.println("Surprise, Mother Fucker!");
		} catch (Exception e) {
			System.out.println("I told you so");
		}
	}
}
