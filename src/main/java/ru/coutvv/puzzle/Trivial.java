package ru.coutvv.puzzle;


/**
 * puzzle [ You're such a Character ]
 * 
 * why   ? 'H' + 'a' оценивается как int и конвертится как число в String. Упс
 *
 * moral : 
 * 			- Используйте строковую конкатенацию с осторожностью:
 * 			по крайней мере один операнд является Строкой
 * 			если таки нет -- кастуем/конвертим его в строку
 * 			- Радуйтесь, что перегрузка операторов не поддерживается( wtf? ) 
 *   
 * @author coutvv
 */
public class Trivial {
	public static void main(String[] args) {
		System.out.println("H" + "a");
		System.out.println('H' + 'a');
//		System.out.println(new Character('H').toString() + 'a'); ///конвертим в стринг один из операндов
	}
}
