package pilasyColas;
//implementar ArrayStack generico <E>
public class ArrayStack<E> implements Stack<E> {

	//tamaño de la pila
	public static final int CAPACITY= 1000;
	//declarar mi array generico
	public E[] data;
	//declarar el valor del indice de elementos de mi pila
	private int t=-1;
	//constructor uno vacio y otro con los datos por defecto 1000
	public ArrayStack() {
		this(CAPACITY);
	}
	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
		data = (E[]) new Object[capacity];
	}
	//tamaño de la pila 
	@Override
	public int size() {
		return (t+1);
	}
	//si esta vacio
	@Override
	public boolean isEmpty() {
		return (t == -1);
	}
	//insertar 
	@Override
	public void push(E e) {
		//1. verificar si tiene un tamaño 
		if(size() == data.length) throw new IllegalStateException("la pila esta llena");
		//si no esta llena agrego el dato
		data[++t]=e;
	}
	//obtener el dato y se borra de la pila
	@Override
	public E pop() {
		// si esta vacia
		if(isEmpty()) return null;
		//crear un objeto temporatal y agregarlo
		E obj = data[t];
		data[t] = null; //borra el dato
		t--; //disminuye el stack
		return obj;
	}
	//top que envia los datos sin borrarlos
	@Override
	public E top() {
		if(isEmpty()) return null;
		return data[t];
	}
}