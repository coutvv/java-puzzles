package ru.coutvv.puzzle.exceptional;

/**
 * why   ? thirdElementIsThree споткнётся на первом попавшемся массиве из менее чем 3 элемента и грохнет цикл
 * fix	 ? 1). проходить массив for || foreach  2). Использовать && вместо &(ибо && не будет проверять правое выражение, если левое false); 
 *
 * moral : 
 * 			- юзать & и | только как побитовые операции
 *   
 * @author coutvv
 */
public class Loop {

	public static void main(String[] args) {
		int[][] tests = { { 6, 5, 4, 3, 2, 1 }, { 1, 2 },
				{ 1, 2, 3 }, { 1, 2, 3, 4 }, { 1 } };
		int successCount = 0;
		
		try {
			int i = 0;
			while(true) {
				if(thirdElementIsThree(tests[i++])) {
					successCount++;
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		System.out.println(successCount);
	}
	
	private static boolean thirdElementIsThree(int[] a) {
		return a.length >= 3 & a[2] ==3;
	}
}
