package ru.coutvv.puzzle.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

/**
 * what's up 	?  рандомно ли меняем элементы массива?
 * why   		?  нет, так как некоторые замены повторяют себя, в эксперементе ясно показано
 * fix	 		?  использовать метод из стандартной библиотеки: Collections.shuffle(Arrays.asList(a));
 * 					или писать свой велосипед, полностью копирующий метод выше
 *
 * moral : 
 * 			- исп
 *   
 * addition 	: на самом деле уже при 40 элементах вся эта математика разваливается(и использование 
 * 					SecureRandom не поможет...) Но нам всё это побоку
 * @author coutvv
 */
public class Shuffle {

	private static Random rnd = new Random();
	
	public static void shuffle(Object[] a) {
		for(int i = 0; i < a.length; i++) {
			swap(a, i , rnd.nextInt(a.length));
//			swap(a, i , i + rnd.nextInt(a.length - i ));// это используется в методе Collections.shuffle
		}
	}
	private static void swap(Object [] a, int i, int j) {
		Object tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i < 1000000; i++ ) {
			String[] shits = {"shit", "fuck off", "jerk off", "bitch", "suffer", "doughbag"};
			shuffle(shits); //original
//			Collections.shuffle(Arrays.asList(shits)); //fixing by real code practice
			String key =  "\n" +Arrays.toString(shits) + " \t";
			if(map.containsKey(key)) {
				Integer count = map.get(key); count++;
				map.put(key, count);
			} else {
				map.put(key, 0);
			}
		}
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(map.entrySet());
		list.sort(new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue() > o2.getValue() ? 1 : -1;
			}
			
		});
		System.out.println(list);
	}
}
