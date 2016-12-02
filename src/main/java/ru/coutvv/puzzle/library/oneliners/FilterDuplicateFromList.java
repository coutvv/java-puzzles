package ru.coutvv.puzzle.library.oneliners;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Consumer;

/**
 * task : написать метод который возвращает список без дубликатов элементов исходного(эл-ты в том же порядке)
 * 
 * solving : проще всего сделать это с Set'ом, ибо нам нужно множество, но нам нужно соблюсти порядок
 * 			 поэтому используем реализацию LinkedHashSet. Эта коллекция реализована как хэш-таблица
 * 			 с возможностью перемещаться, ну кароч выучи уже коллекции и гугли!
 * 
 * @author lomovtsevrs
 */
public class FilterDuplicateFromList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		createList(list);
		
		list = filterList(list);
		
		list.forEach(new Consumer<String>() {

			public void accept(String t) {
				System.out.println(t);
			}
		});
	}
	
	static void createList(List<String> list) {
		list.add("spam");
		list.add("sausage");
		list.add("spam");
		list.add("spam");
		list.add("bacon");
		list.add("spam");
		list.add("tomato");
	}
	
	static <E> List<E> filterList(List<E> original) {
		return new ArrayList<E>(new LinkedHashSet<E>(original));
	}
}
