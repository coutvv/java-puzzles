package ru.coutvv.puzzle.morelib;

import java.lang.reflect.Constructor;

/** 
 * pre   : I'm really really have a lot of gaps in reflection!
 * 
 * why   ? компилятор добавляет в конструктор вложенного нестатического класса
 * 			ещё один параметр, и везде где встречает его вызов тоже добавляет(ну нихера себе)
 * 			поэтому рефлексивный вызов и роняется 
 * fix	 ?   исправить сей косяк можно, получив рефлексивный конструктор и вставив параметр внешнего класса
 *			v_2: сделать Inner-класс статичным
 * moral : 
 * 			- использование рефлексии не тоже самое что использование нормальной Jav'ы
 * 			эта херня очень серьёзно помешана на логике jvm и тут опасно играться
 * 			- избегайте всеми правдами и неправдами инициацию объектов посредством рефлексии
 *   
 * @author coutvv
 */
public class Outer {
	public class Inner{
		public String toString() {
			return "Inner class";
		}
		
		public Inner(){};
	}
	
	public void greetWorld() throws Exception{
//		Constructor c = Inner.class.getConstructor(Outer.class); //fixing by reflexive constructor
//		System.out.println(c.newInstance(Outer.this));
		System.out.println(Inner.class.newInstance());
	}
	
	public static void main(String[] args) throws Exception{
		new Outer().greetWorld();
	}
}
