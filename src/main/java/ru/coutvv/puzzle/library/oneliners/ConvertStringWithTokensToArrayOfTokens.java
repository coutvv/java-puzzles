package ru.coutvv.puzzle.library.oneliners;

/**
 * task : написать метод берущий строку с токенами(>=0)разделёнными запятыми и возвращающий массив токенов и без пробелов побокам!
 * 
 * solving : юзайте regexp'ы, но с осторожностью!
 * 
 * @author lomovtsevrs
 */
public class ConvertStringWithTokensToArrayOfTokens {

	public static void main(String[] args) {
		String tokens = "token1, token 2 , another token, megatoken, die mother fucker die!";
		for(String token : parseTokens(tokens)) {
			System.out.println("<" + token + ">");
		}
	}
	
	static String[] parseTokens(String tokens) {
//		return tokens.split(","); //with spaces
		return tokens.split("\\s*,\\s*"); //without space from any side
//		return tokens.split(",\\s*"); //without spaces from left
	}
}
