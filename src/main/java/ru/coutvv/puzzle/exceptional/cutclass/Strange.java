package ru.coutvv.puzzle.exceptional.cutclass;

/**
 * РЕШЕНИЕ: для того чтобы написать программу определяющую отсутствие классов нужно юзать reflection
 * 
 * moral : 
 * 			- не пытайтесь пойтамть NoClassDefFoundError
 * 			- да и вообще потомков Error трогать не нужно
 * @author lomovtsevrs
 */
public class Strange {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		try {
			Object m = Class.forName("ru.coutvv.puzzle.exceptional.cutclass.Missing").newInstance();
		} catch (ClassNotFoundException e) {
			System.err.println("got it!");
		}
	}
}
