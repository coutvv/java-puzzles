package ru.coutvv.puzzle.classy;

/**
 * why   ? color инитится позже конструирования имени
 * fix	 ? лениво вызывать в toString'e переопределяемый метод(и убрать из конструктора офк)
 *
 * moral : 
 * 			- и снова пример, который показывает, что обратиться к final полю объекта, при том что он не инициализирован изи-пизи!
 *   		- никогда не используйте переопределяемые методы в конструкторе
 * @author coutvv
 */
public class ColorPoint extends Point {
	private final String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	protected String makeName() {
		return super.makeName() + " : " + color;
	}
	
	public static void main(String[] args) {
		System.out.println(new ColorPoint(4,2,"purple"));
	}
}

class Point {
	private final int x,y;
	private final String name;
	
	Point(int x, int y) {
		this.x = x; 
		this.y = y;
		name = makeName();
	}
	
	protected String makeName() {
		return "[" + x + ", " + y + "]";
	}
	
	public final String toString() {
		return name;
	}
}

////fix version:
//class Point {
//	private final int x,y;
//	private String name; //lazily initialized
//	
//	Point(int x, int y) {
//		this.x = x; 
//		this.y = y;
//	}
//	
//	protected String makeName() {
//		return "[" + x + ", " + y + "]";
//	}
//	
//	//lazily computes and caches name on first use
//	public final synchronized String toString() {
//		if(name == null) 
//			name = makeName();
//		return name;
//	}
//}

