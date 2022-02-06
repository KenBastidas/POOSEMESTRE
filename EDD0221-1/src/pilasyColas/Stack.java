package pilasyColas;
//aplicaciones genericas
//<E> significa que la clase interface o metodo es generico 
public interface Stack <E> {
	//una interfaz es una clase donde se tiene declarado metodos
		//que no estan implementandos pero pueden ser utilizados por el programa
		//metodos1
	
		//tamaño de la pila
		public int size();
		//si esta vacia
		boolean isEmpty();
		//inserta datos a la pila
		public void push(E e);
		//remover
		public E pop();
		//obtener el ultimo elemento de la pila
		public E top();
}
