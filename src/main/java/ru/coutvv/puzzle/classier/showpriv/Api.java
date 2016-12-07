package ru.coutvv.puzzle.classier.showpriv;

/**
 * task  ? Написать библиотеку так, чтобы клиентский код не компилился
 *
 * moral : 
 * 			-
 *   
 * @author coutvv
 */
public class Api {

//	private static class String{}; //uncomment
	public static String newString() {
		return new String();
	}
}

class Client {
	String s = Api.newString();
}