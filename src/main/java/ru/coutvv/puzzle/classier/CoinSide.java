package ru.coutvv.puzzle.classier;

import java.util.Random;

/**
 * why   ? под 1.4 не компилится, так как требует привести один из операндов в супертип
 * fix	 ? Я сделаль...  
 *
 * moral : 
 * 			- Обновляемся на самые последние релизы Java...
 *   
 * @author coutvv
 */
public class CoinSide {

	private static Random rnd = new Random();
	
	public static CoinSide flip() {
		return rnd.nextBoolean() ? Heads.INSTANCE : Tails.INSTANCE;
//		return rnd.nextBoolean() ?(CoinSide) Heads.INSTANCE : Tails.INSTANCE; //fix
	}
	
	public static void main(String[] args) {
		System.out.println(flip());
	}
}


class Heads extends CoinSide {
	private Heads() {}
	public static final Heads INSTANCE = new Heads();
	
	public String toString() {
		return "head2s";
	}
}

class Tails extends CoinSide {
	private Tails() {}
	public static final Tails INSTANCE = new Tails();
	
	public String toString() {
		return "tail2s";
	}
}