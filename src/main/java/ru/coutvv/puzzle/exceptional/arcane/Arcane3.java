package ru.coutvv.puzzle.exceptional.arcane;

/**
 * why   ? скомпилится 0_о !!! 
 *
 * moral : 
 * 			- иллюстрирует, ну видно что иллюстрирует, офигеть.
 *   
 * @author coutvv
 */
public class Arcane3 implements Type3{

	public void f()  {
		System.out.println("Hello world!");
	}

	public static void main(String[] args) {
		Type3 t = new Arcane3();
		t.f();
	}
}
