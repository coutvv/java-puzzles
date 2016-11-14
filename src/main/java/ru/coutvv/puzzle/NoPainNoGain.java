package ru.coutvv.puzzle;

import java.util.Random;

/**
 * puzzle [ NoPainNoGain ]
 * 
 * Выведется "ain"
 * 
 * why   ? не существует конструктора StringBuffer для char'a, nextInt даёт 0/1 а также нет break; в вариантах свитча
 *
 * moral : 
 * 			-
 *   
 * @author coutvv
 */
public class NoPainNoGain {
	private static Random rnd = new Random();
    public static void main(String[] args) {
      StringBuffer word = null;
         switch(rnd.nextInt(2)) {
            case 1: word = new StringBuffer('P');
            case 2: word = new StringBuffer('G');
            default: word = new StringBuffer('M');
       }
      word.append('a');    
      word.append('i');
      word.append('n'); 
      System.out.println(word);
   }
}
