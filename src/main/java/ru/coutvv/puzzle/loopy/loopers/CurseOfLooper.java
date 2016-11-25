package ru.coutvv.puzzle.loopy.loopers;

/**
 * moral :
 * 			- в то время как операторы сравнения(><) сравнивают значения, == может запросто сравнивать ссылки(если слева и справа непримитивы)
 * 
 * @author lomovtsevrs
 */
public class CurseOfLooper {

	public static void main(String[] args) {
		Integer i = new Integer(0),
				j = new Integer(0);
		while( i <= j && j <= i && i != j) {
			//infinity
		}
	}
}
