package ru.coutvv.puzzle.morelib.dyslexic;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * task : создать ещё один объект класса Dog
 * 
 * solving : Exception сериализуется, вот этим вот и займёмся! 
 * 
 * @author lomovtsevrs
 */
public class God {

	public static void main(String[] args) throws Dog {
		Dog d = (Dog)deepCopy(Dog.INSTANCE);
		System.out.println(d == Dog.INSTANCE);
		
	}
	
	public static Object deepCopy(Object obj) {
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			new ObjectOutputStream(bos).writeObject(obj);
			
			ByteArrayInputStream bin = new ByteArrayInputStream(bos.toByteArray());
			return new ObjectInputStream(bin).readObject();
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
		}
	}
}
