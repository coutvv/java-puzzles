package ru.coutvv.puzzle.expressive;

/**
 * why   ? int -> byte = -1; byte -> char = 0xff; char -> int = 65535
 * fix	 ? множьте на маски как показано в статике поле класса Fixing
 *
 * moral : 
 * 			- не творите херни! если непонятно что делает кусок кода, перепишете его немедленно!
 *   
 * @author coutvv
 */
public class Multicast {
	
	public static void main(String[] args) {
		System.out.println((int)(char)(byte) -1);
	}
}





class Fixing {
	static {
		char c;
		byte b = -70;
		
		c = (char) b; // декодируется в инт и затем копируется в чар
		System.out.print((int)c);
		System.out.println("\t 0x" + String.format("%04x", (int) c).toUpperCase());
		
		c = (char)(b & 0xff); //тупо копируется значение байта(т.е. по хексам кодам они одинаковые)
		System.out.print((int)c);
		System.out.println("\t 0x" + String.format("%04x", (int) c).toUpperCase());
	}
	
	@SuppressWarnings("unused") 
	private void printHexString() {
		
		byte b = -10;
		System.out.println( "0x" + String.format("%02x", (int) (b&0xFF)).toUpperCase());//распечатка хекса байта
		
		int i = 0x12341232;
		System.out.println( "0x" + String.format("%08x", i).toUpperCase());//распечатка хекса инта
		
		char c = 'a';
		System.out.println( "0x" + String.format("%04x", c).toUpperCase());//распечатка хекса чара
	}
}