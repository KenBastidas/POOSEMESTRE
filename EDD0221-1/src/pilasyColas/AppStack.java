package pilasyColas;
import java.util.Arrays;

import poo.Persona;
public class AppStack {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// Repasar las listas enlazadas del libro de goodrich data structures and algorithms CAPITULO 7
		//ejemplo de una stack integer
			//implementar un obj stack tipo integer
			Stack<Integer> s1 = new ArrayStack<>();
			s1.push(60);
			s1.push(90);
			s1.push(100);
			//leer la pila
			//estructura de iteracion while
			while (! s1.isEmpty()) //mientras la pila no este vacia
			{
				//codificacion
				System.out.println(s1.pop());
			}
		//objeto stack de la libreria de java
			@SuppressWarnings("rawtypes")
			java.util.Stack pila = new java.util.Stack();
			 pila.push(65);
			 pila.push(125);
			 pila.push("stack desde libreria java");
			//leer pila
			 while(pila.empty() == false) {
					System.out.println(pila.pop());
			 }
		//stack o pila con objetos por ejmplo persona
			 //stack definido por el usuario del tipo persona
			 Stack<Persona> pilaPersona = new ArrayStack<Persona>();
			 //instanciar 3 objetos para luego ingresarlos a la pila
			 Persona p1 = new Persona("jaime", "sayago");
			 Persona p2 = new Persona("juan", "calle");
			 Persona p3 = new Persona("jose", "delgado");
			 //agregar los objetos a la pila
			 pilaPersona.push(p1);
			 pilaPersona.push(p2);
			 pilaPersona.push(p3);
			 
			 //mostrar los datos
			 while(!pilaPersona.isEmpty()) {
				 System.out.println(pilaPersona.pop().identificacion());
			 }
			 
		//ejemplo reverso a traves de una stack
			 Integer[ ] a = {4, 8, 15, 16, 23, 42};
			 String[ ] s = {"Jack", "Kate", "Hurley", "Jin", "Michael"};
			 
			 System.out.println("a = " + Arrays.toString(a));
			 System.out.println("a = " + Arrays.toString(s));
			 System.out.println("reverso...");
			 reverse(a);
			 reverse(s);
			 System.out.println("a = " + Arrays.toString(a));
			 System.out.println("a = " + Arrays.toString(s));
	}
	//funcion reverse utilizando una pila
	public static <E> void reverse(E [] a) {
		//crear una stack generica con el tamño del array a revertir
		Stack<E> reverso = new ArrayStack<>(a.length); 
		///recorrer el array 
		for(int i =0; i<a.length; i++) {
			reverso.push(a[i]);
			}
		//leer el array
		for(int i = 0; i<a.length;i++) {
			a[i] = reverso.pop();
			}
	}
}