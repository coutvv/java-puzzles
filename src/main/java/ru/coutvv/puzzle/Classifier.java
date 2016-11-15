package ru.coutvv.puzzle;

public class Classifier {

	public static String classify(char c) {
		if("0123456789".indexOf(c) >= 0) {
			return "NUMBER";
		}
		if("abcdefghijklmnopqrstuwvxyz".indexOf(c) >= 0) {
			return "LETTER";
		}
		if("=-+&/&|!".indexOf(c) >= 0) {
			return "OPERATOR";
		}
		return "UNKNOWN";
	}
	
	private static String nclas(char c) {
		return ("0123456789".indexOf(c) >= 0 ? "NUMBER " : ("abcdefghijklmnopqrstuwvxyz".indexOf(c) >= 0) ? "LETTER " : ("=-+&/&|!".indexOf(c) >= 0 ? "OPERATOR " : "UNKNOWN "));
	}
	
	public static void main(String[] args) {
		System.out.println(nclas('n') + nclas('+') + nclas('2'));
	}
}
