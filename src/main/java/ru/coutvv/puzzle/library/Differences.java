package ru.coutvv.puzzle.library;

import java.util.HashSet;
import java.util.Set;

/**
 * why   ? интежеры начинающиеся с 0 интерпретируются в восьмиричной системе(нихерасебе)
 *
 * moral : 
 * 			- не заполняйте интежеры начиная их с нуля... только по нужде в 8ичной системы 
 *   
 * @author coutvv
 */
public class Differences {

	public static void main(String[] args) {
		int[] vals = {789, 678, 567, 456,
					  345, 234, 123, 012};
		for(int v : vals) System.out.print(v + " ");
		System.out.println();
		Set<Integer> diffs = new HashSet<Integer>();
		for(int i = 0; i < vals.length; i++) {
			for(int j = i; j < vals.length; j++) {
				diffs.add(vals[i] - vals[j]);
			}
		}
		System.out.println(diffs.size());
		System.out.println(diffs);
	}
}
