package ru.coutvv.puzzle.classy;

import java.util.Calendar;

/**
 * why   ? конструктов вызывается раньше инициализации CURRENT_YEAR и берётся 0 заместо
 * fix	 ? сделать CURRENT_YEAR non-static || поменять порядок инициализации static полей
 *
 * moral : 
 * 			- Этот пример показывает как обратиться к final static полю до его инициализации 
 * 			- Будь осторожен(следи за собой) с круговоротом инициализаций в классе(так называемая менструация)
 * 			- Ещё раз: статичные поля, даже сцуко final!, могут быть обнаружены с дефолтными значения(тобишь неинициализированными)
 *   
 * @author coutvv
 */
public class Elvis {

	public static final Elvis INSTANCE = new Elvis();
	private final int beltSize;
	private static final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);
	
	private Elvis() {
		beltSize = CURRENT_YEAR - 1930;
	}
	
	public int beltSize() {
		return beltSize;
	}
	
	public static void main(String[] args) {
		System.out.println("Elvis wears a size " + INSTANCE.beltSize + " belt");
	}
}
