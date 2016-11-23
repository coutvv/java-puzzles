package ru.coutvv.puzzle.character;

/**
 * why   ? виновен конструктор СТринга с byte'ами. Он использует дефолтную кодировку, и следовательно может иметь отличную от байтового массива длину.
 * 		 ? посмотреть дефолтную можно так:  System.out.println(Charset.defaultCharset());
 * fix	 ? нормально выведет только при условии, что кодировка ISO-8859-1, тобишь создавать так: new String(bytes, "ISO-8859-1");
 *
 * moral : 
 * 			- каждый раз когда переводишь байты в строку помни о кодировке из которой переводишь!!!
 *   
 * @author coutvv
 */
public class StringCheese {

	public static void main(String[] args) {
		byte[] bs = new byte[256];
		for(int i = 0; i < 256; i++)
			bs[i] = (byte)i;
		String str = new String(bs);
		for(int i = 0, n = str.length(); i < n; i++) {
			System.out.print((int) str.charAt(i) + " ");
		}
	}
}
