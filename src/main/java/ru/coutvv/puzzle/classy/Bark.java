package ru.coutvv.puzzle.classy;

/**
 * puzzle [ all I get is static ]
 * 
 * why   ? Тут у нас отсутствует динамическая диспетчеризация на статических методах
 * fix   ! сделать методы не статичными
 * 
 * moral : 
 * 		   - статичные методы не переопределяются(они могут быть только спрятаны)
 * 		   - не прячьте статичные методы, проблем не оберётесь потом...
 * 		   - НИКОГДА не вызывайте статичные методы через экземпляры, только через классы!!! 
 *
 * @author coutvv
 */
public class Bark {
	
	public static void main(String[] args) {
		SomeDog woofer = new SomeDog();
		SomeDog nipper = new Basenji();
		//Basenji nipper = new Basenji(); //таким образом спрятаный сработает
		woofer.bark();
		nipper.bark();
	}
}

class SomeDog {
	public static void bark() {
		System.out.println("woof ");
	}
}

class Basenji extends SomeDog {
	public static void bark() {}
}

