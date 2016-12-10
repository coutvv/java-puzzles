package ru.coutvv.puzzle.morelib;

/**
 * why   ? не видит метода слип для пета, только у thread'a
 * fix	 ? сменяем имя метода для спанья и норм. Или указываем скоуп -- Pet.this.sleep();
 * 		   А в идеале вообще используем конструктор Thread'a с Runnable и всё пучком
 *
 * moral : 
 * 			- будь осторожен в который раз с shadowing'ом стандартных методов...
 *   
 * @author coutvv
 */
public class Pet {

	public final String name;
	public final String food;
	public final String sound;
	
	public Pet(String name, String food, String sound) {
		this.name = name;
		this.food = food;
		this.sound = sound;
	}
	
	public void eat() {
		System.out.println(name + ": mmmmm... " + food);
	}
	
	public void play() {
		System.out.println(name + " sound: " + sound);
	}
	
	public void sleep() {
		System.out.println(name + " : Zzzzzzzzzzz...");
	}
	
	public void live() {
		new Thread() {
			public void run() {
				while(true) {
					eat();
					play();
//					sleep();//original, uncomment!
				}
			}
		}.start();
	}
	
	public static void main(String[] args) {
		new Pet("Fido", "Bone", "Woof!").live();
	}
}
