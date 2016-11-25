package ru.coutvv.puzzle.loopy.loopers;
/**
 * moral : 
 * 		- не использовать комбинированные присваивания(+=, -=, *== etc...) на short, byte или char переменных
 * 
 * @author lomovtsevrs
 */
public class GhostOfLooper {

	public static void main(String[] args) {
		byte i = (byte)0xffff;
		while( i != 0 ) {
			i >>>= 1;
		}
	}
}
