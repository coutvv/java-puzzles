package ru.coutvv.puzzle.classy;

/**
 * why   ? cat & dog используют одно и тоже поле для подсчёта
 * fix	 ? юзать композицию перед наследованием(каждой зверине свой статик каунтер, зубы и злости)  
 *
 * moral : 
 * 			- static-поля шарятся между всеми наследниками 
 *   
 * @author coutvv
 */
public class Ruckus {

	public static void main(String[] args) {
		Dog[] dogs = {new Dog(),new Dog()};
		for(int i = 0; i < dogs.length; i++) 
			dogs[i].woof();
		Cat[] cats = { new Cat(), new Cat(), new Cat(),};
		for(int i = 0; i < cats.length; i++) {
			cats[i].meow();
		}
		System.out.print(Dog.getCount() + " woofs and ");
		System.out.println(Cat.getCount() + " meows");
		
	}

	
}

class Counter {
	private static int count;
	public static void increment() {count++;}
	public static int getCount() {return count;}
}

class Dog extends Counter {
	public Dog() {}
	public void woof() {increment();}
}

class Cat extends Counter {
	public Cat() {}
	public void meow() {increment();}
}
