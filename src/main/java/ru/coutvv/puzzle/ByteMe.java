package ru.coutvv.puzzle;

/**
 * puzzle [ A big delight in every Byte ]
 * 
 * why   ? 0x90 == 144 так как это int, а у Byte'a максимум == 127, чтобы сравнивать с байтом нужно кастить 0x90
 * fix	 ? или кастить к байту то с чем сравниваешь или маской херачить байт
 *
 * moral : 
 * 			- байты не инты!
 * 			- осторожнее с примитивами!
 * 			- сравнивайте как типизированные выражения: кастуйте или конверьте один из операндов
 *   
 * @author coutvv
 */
public class ByteMe {
	public static void main(String[] args) {
		for(byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
			if(b == 0x90) { // b == (byte) 0x90 // or // (b & 0xff) == 0x90
				System.out.print("Byte me! ");
			}
		}
	}
}
