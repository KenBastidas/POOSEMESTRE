package pilasyColas;

import java.util.Iterator;

import java.util.LinkedList;

public class AppQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pata implementar uan cola
		//1array generico
		//2.libreria linkedlist
		//cola con linkelsit
		//creamos una cola
		LinkedList<String> cola= new LinkedList<String>();
		//agregar datos
		cola.add("juan");
		cola.add("jua");
		cola.add("jun");
		cola.add("jan");
		cola.addFirst("susana");
		cola.addFirst("sbruno");
		//agregagra datos ne posiciones kemplo0
		cola.add(2,"carlitos");
		//remover pues
		cola.remove(3);
		//obetner
		Object datoObtenido = cola.get(1);
		System.out.println("datos pocision 1"+ datoObtenido);
		cola.add(2,"cambio por jorge");
		//show datos
		//collections -->arralist linkdlist map hastables
		Iterator<String> iterator= cola.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		Queue<Integer> s= new ArrayQueue<>();
		s.enqueue(8);
		s.enqueue(9);
		s.enqueue(26);
		s.enqueue(26);
		//System.out.println(s.first());
		while(!s.isEmpty()) {
			System.out.println(s.dequeue());
		}
		
	}
}