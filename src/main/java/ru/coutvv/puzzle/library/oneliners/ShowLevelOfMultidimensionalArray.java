package ru.coutvv.puzzle.library.oneliners;

import java.util.Arrays;

/**
 * task : имеется мегавложенный(неизвестно насклько) массив, показать все элементы на каждом уровне массива
 * 
 * solving : Array надо знать еп. Как и все остальные стандартные библиотеки
 * 
 * @author lomovtsevrs
 */
public class ShowLevelOfMultidimensionalArray {

	public static void main(String[] args) {
		int[][][] i = {{{1,2, 3}},{{1,2, 3}},{{1,2, 3}}};
		System.out.println(Arrays.deepToString(i));
	}
}
