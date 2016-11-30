package ru.coutvv.puzzle.classy.noturtype;

/**
 * moral : 
 * 			- ну тип не может кастануть(тип противоречит примеру Type2, но Я не прошарил чёт)
 * 
 * @author lomovtsevrs
 */
public class Type3 {

	public static void main(String[] args) {
		Type3 t3 = (Type3) new Object();
	}
}
