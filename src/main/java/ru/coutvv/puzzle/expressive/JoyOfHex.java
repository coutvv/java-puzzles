package ru.coutvv.puzzle.expressive;

/**
 * why   ? 0xcafebabe -- интовое число -889275714 оно конвертится в лонговое 0xffffffffcafebabeL и прибавляется 0x100000000L и получаем: 0xcafebabeL всё логично
 * fix	 ? юзать L во втором операнде
 *
 * moral : 
 * 			- избегайте вычислений с миксом типов, может возникнуть путаница
 *   
 * @author coutvv
 */
public class JoyOfHex {

	public static void main(String[] args) {
		System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));
	}
	
}
