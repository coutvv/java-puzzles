package ru.coutvv.puzzle.character;

/**
 * why   ? строковые литералы не рассматриваются внутри комментариев
 * fix	 ? не использовать блочные комментарии?
 *
 * moral : 
 * 			- блочные комментарии не оч надёжны в закомментировании куска кода
 *   
 * @author coutvv
 */
public class Classifire {

	public static void main(String[] args) {
		System.out.println(classify('n') + classify('+') + classify('2'));
	}
	
	static String classify(char ch) {
		if("0123456789".indexOf(ch) >= 0) {
			return "NUMERAL ";
		}
		//uncomment below for this pazzle
//		/*
//		if("+-*/&|!=".indexOf(ch) >= 0)
//				return "OPERATOR ";
//		*/
		if("abcdefghijklmnopqrstuwvxyz".indexOf(ch) >= 0) 
			return "LETTER ";
		return "UNKNOWN";
	}
}
