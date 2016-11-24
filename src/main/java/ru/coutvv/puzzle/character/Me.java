package ru.coutvv.puzzle.character;

/**
 * why   ?  regExp вместо точки 
 * fix	 ?  юзать экранирование точки (два бэкслэша): Me.class.getName().replaceAll("\\.", "/")
 *
 * moral : 
 * 			- be awaaaare of regular expression!!!
 *   
 * @author coutvv
 */
public class Me {
	public static void main(String[] args) {
		System.out.println(
				Me.class.getName().replaceAll(".", "/") + ".class"
		);
	}
}
