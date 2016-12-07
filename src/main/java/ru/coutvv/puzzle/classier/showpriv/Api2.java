package ru.coutvv.puzzle.classier.showpriv;

/**
 * task  ? Написать библиотеку так, чтобы клиентский код не компилился
 *
 * moral : 
 * 			- Избегай переиспользования имён!!! 
 *   
 * @author coutvv
 */
public class Api2 extends ApiBase{
//	private static final int ANSWER = 6*9; //uncomment
}

class ApiBase {
	public static final int ANSWER =42;
}

class Client2 {
	int answer = Api2.ANSWER;
}