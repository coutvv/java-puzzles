package ru.coutvv.puzzle.advanced;

/**
 * why   ? дефолтный конструктор Inner2 пытается достучаться до ссылки this
 * 			до вызова конструктора суперкласса, что нелегально
 * fix	 ? ну там нарисовано внизу, да...
 *
 * moral : 
 * 			- редко когда необходимо расширять внутренний класс, но если вдруг 
 * 			ты решился на это, продумай тщательно все моменты
 *   
 * @author coutvv
 */
public class Outer {

	class Inner1 extends Outer {};
//	class Inner2 extends Inner1{};//uncomment to original
}

//fix:
class Out {
	public Out(){};
	
	class In1 extends Out {
		In1(){super();}
	}
	
	class In2 extends In1 {
		In2(){Out.this.super();}
	}
}