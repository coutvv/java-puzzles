package ru.coutvv.puzzle.exceptional;

/**
 * why   ? финальные поля могут быть присвоены только в тех тчках программы, где они стопудово неопределены
 * fix	 ? использовать вариант changeble
 *
 * moral : 
 * 			- если нужно отрефакторить программу изза проблемы присвоения, лучше добавить новый метод
 *   
 * @author coutvv
 */
public class UnwelcomeGuest {

	public static final long GUEST_USER_ID = -1;
	private static final long USER_ID;
	
	//	original
//	static {
//		try {
//			USER_ID = getUserIdFromEnvironment();
//		} catch (IdUnavailableException e) {
//			USER_ID = GUEST_USER_ID;
//			System.out.println("Logging as Guest");
//		}
//	}
	
	////changeble working case
	static {
		USER_ID = getUserIdOrGuest();
	}
	private static long getUserIdOrGuest() {
		try {
			return getUserIdFromEnvironment();
		} catch (IdUnavailableException e) {
			System.out.println("LOgging as guest");
			return GUEST_USER_ID;
		}
	}
	////changeble ends
	
	private static long getUserIdFromEnvironment() throws IdUnavailableException{
		throw new IdUnavailableException();
	}
	
	public static void main(String[] args) {
		System.out.println("USER ID: " + USER_ID);
	}
}

class IdUnavailableException extends Exception {
	IdUnavailableException() {}
}
