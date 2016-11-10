package ru.coutvv.puzzle;

import java.util.Arrays;
import java.util.Comparator;

/**
 * puzzle [ The Saga of the Sorded Sort ]
 * 
 * why   ? Сравниватель(Компаратор) сломан! Он полагается на разность интов! А эти сучки очень маленькие по диапазону!
 * fix	 ? не полагаться на разницу в сравнении!!
 *
 * moral : 
 * 			- Примитив инт не интегер!!! 
 * 			- Задуймайся над переполнением
 * 			- Такая техника сравнения норм, если max - min <= Integer.MAX_VALUE или ∀ ints > 0
 *			- Не пиши чрезмерно заумный код!!! 			 
 *   
 * @author coutvv
 */
public class SordidSort {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {new Integer(2000000000), new Integer(-2000000000), new Integer(0)};
		Arrays.sort(arr, new Comparator() {

			public int compare(Object o1, Object o2) {
				return ((Integer) o2).intValue() - ((Integer) o1).intValue();
			}
			
//			public int compare(Object o1, Object o2) { //not relies on subtraction
//				int i1 = ((Integer) o1).intValue() ;
//				int i2 = ((Integer) o2).intValue() ;
//				return (i2 < i1 ? -1 : (i2 == i1 ? 0 : 1));
//			}
		});
		System.out.println(Arrays.asList(arr));
	}
}
