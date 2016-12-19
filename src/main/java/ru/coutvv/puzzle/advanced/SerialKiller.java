package ru.coutvv.puzzle.advanced;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * why   ? Сериализация... бессердечная ты сука!
 * fix	 ?   
 *
 * moral : 
 * 			- какбы ещё раз перепрочитать 91 пазл
 *   
 * @author coutvv
 */
public class SerialKiller {
	
	public static void main(String[] args) {
		Sub sub = new Sub(666);
		sub.checkInvariant();
		
		Sub copy = (Sub) deepCopy(sub);
		copy.checkInvariant();
	}

	static public Object deepCopy(Object obj) {
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

class Super implements Serializable {
	final Set<Super> set = new HashSet<>();
}

final class Sub extends Super {
	private int id;
	public Sub(int id) {
		this.id= id;
		set.add(this);
	}
	
	public void checkInvariant() {
		if(!set.contains(this))
			throw new AssertionError("invariant violated");
		else 
			System.out.println("it's okey");
	}
	
	public int hashCode() {
		return id;
	}
	
	public boolean equals(Object o) {
		return (o instanceof Sub) && (id == ((Sub)o).id);
	}
}