package ru.coutvv.puzzle.loopy.loopers;

/**
 * петли вечности!
 * 
 * moral : 
 * 			- даблы и флоаты могут быть бесконечностями
 * 			- добавление маленьких чисел к гигантским не изменят гигантских чисел =(
 * 			- бинарная арифметика чисел с плавающей запятой только приблизительно к реальной арифметике, тобишь неточно
 * @author lomovtsevrs
 */
public class Looper {

	public static void main(String[] args) {
		Double i = Double.POSITIVE_INFINITY;
		i = 1.0e40d;//можно и так
		while (i == i+1) {
			//вечный цикл
		}
	}
}
