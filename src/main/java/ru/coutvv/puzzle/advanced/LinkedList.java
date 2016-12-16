package ru.coutvv.puzzle.advanced;

/**
 * why   ? не работает потому что Node внутри себя использует свой параметр E
 * 			а не параметр E из LinkedList'a, отсюда невозможность присвоить 
 * 			несоответствующие друг другу типы
 * 
 * fix	 ? сделать Node не параметризированным, использовать параметр E класса LinkedList,
 * 			благо доступ к нему есть. Но это хреновенький вариант, потому что сама логика
 * 			LinkedList'a сложновата для понимания, в TrueLinkedList приведён вариант рефакторинга
 *
 * moral : 
 * 			- внутренние классы имеют доступ к параметризированным типа внешнего класса, что смущает
 * 			- если используешь генерик-класс внутри другого дженерика, давай их параметрам разные имена!
 *   
 * @author coutvv
 */
public class LinkedList<E> {

	private Node<E> head = null;
	
	private class Node<E> {
		E value; 
		Node<E> next;
		
		Node(E value) {
			this.value = value;
			//original uncomment below
//			this.next = head; 
//			head = this;
		}
	}
	
	public void add(E e) {
		new Node<E>(e);
	}
	
	public void dump() {
		for(Node<E> n = head; n != null; n = n.next) {
			System.out.print(n.value + " ");
		}
	}
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("world");
		list.add("Hello");
		list.dump();
	}
}

/**
 * по идее класс Node не нужно знать что там у листа внутри, поэтому NOde статичный!
 * 
 * Данная реализация предпочтительней, потому что устроена прагматичнее 
 * класс TrueLinkedList манипулирует структурой Node, 
 * Node же представляет собой просто структуру, без какой либо бизнес-логики внутри
 * 
 * @param <E>
 * @author lomovtsevrs
 */
class TrueLinkedList<E> {
	private Node<E> head = null;
	
	private static class Node<T> {
		T value;
		Node<T> next;
		
		Node(T value, Node<T> next) {
			this.value = value;
			this.next = next;
		}
	}
	
	public void add(E e) {
		head = new Node<E>(e, head);
	}
	
	public void dump() {
		for(Node<E> n = head; n != null; n = n.next) {
			System.out.print(n.value + " ");
		}
	}
}
