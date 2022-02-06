package bastidasExamenfinal;

public class NODOLista<E> {
	public static class Node<E>{
	    private E element; //elemento que se gurada en el nodo
	    private Node<E> next; //referencia al siguiente nodo
	    //constructor
	    
	    public Node(E e, Node<E> n) {
	    element = e;
	    next = n;
	    }
	    //getters and setters o encapsulacion
	    public E getElement() {
	    return element;
	    }
	    public void setNext(Node<E> n) {
	    next = n;
	    }
	    public Node<E> getNext(){
	    return next;
	    }
	}
}