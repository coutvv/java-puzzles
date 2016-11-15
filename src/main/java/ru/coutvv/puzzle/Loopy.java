package ru.coutvv.puzzle;

/**
 * puzzle [ Loopy Behaviour ]
 * 
 * why   ? на последней итерации i приплюсовывается 1 и он становится снова меньше макс-валуе(overflow!)
 * fix	 ? юзать long или больше размышлять над созданием циклов
 *
 * moral : 
 * 			- инты не интежеры!!
 * 			- Думай о возможном переполнении
 * 			- используй, если необходимо, типы большего размера
 *   
 * @author coutvv
 */
public class Loopy {

	public static void main(String[] args) {
		final int start = Integer.MAX_VALUE -100;
		final int end = Integer.MAX_VALUE;
		int count = 0;
		for(int i= start; i <= end; i++) {
			count++;
		}
		
	}
}
