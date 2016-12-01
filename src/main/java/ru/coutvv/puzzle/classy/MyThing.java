package ru.coutvv.puzzle.classy;

/**
 * task : сохранить значение SomeOtherClass.func() до вызова конструктора
 * 
 * solution : используем альтернативный вызов конструктора ^_^
 * 
 * moral : 
 * 			- эта приём называется "Private Constructor Capture" и надо бы им запастись
 * 
 * @author lomovtsevrs
 */
public class MyThing extends Thing {

	private final int arg;

	public MyThing() {
		this(SomeOtherClass.func());
	}
	
	private MyThing(int i ){
		super(i);
		arg = i;
	}
	
	public static void main(String[] args) {
		new MyThing();
	}

}

class Thing {
	Thing(int i) {
		System.out.println(i);
	}
}

class SomeOtherClass {
	static int func() {return 1;}
}