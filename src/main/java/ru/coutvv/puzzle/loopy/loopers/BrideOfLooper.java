package ru.coutvv.puzzle.loopy.loopers;

/**
 * петли вечности из нечисел!
 * 
 * moral : 
 * 			- единожды сгенерив NaN все дальнейшие вычисления отправляются в унитаз
 * 
 * @author lomovtsevrs
 */
public class BrideOfLooper {

	public static void main(String[] args) {
		double i = Double.NaN;
		while(i != i) {
			System.out.println("hey!");
		}
	}
}
