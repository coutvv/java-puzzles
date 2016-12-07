package ru.coutvv.puzzle.classier;

/**
 * task  ? написать класс Enigma так чтобы вывело false, не переопределять метод Object equals
 * solve : перегружаем(sic!) equals! или хакаем программу(некруто)
 *
 * moral : 
 * 			- если уж одинаковые методы принимают разные параметры то и поведение одлжно быть идентичное у обоих
 *   
 * @author coutvv
 */
public class Conundrum {

	public static void main(String[] args) {
		Enigma e = new Enigma();
		System.out.println(e.equals(e));
	}
}

class Enigma {
	public boolean equals(Enigma e) {
		return false;
	}
}

//class Enigma { //hack!
//	public Enigma() {
//		System.out.println(false);
//		System.exit(0);
//	}
//}