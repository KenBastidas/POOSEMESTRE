package listas;

import java.util.Scanner;

///claxse padre
public class SimpleLinkedList<E> {
	//CLASE PADRE
	        //CLASE INTERNA O CLASE HIJO DENTRO DE LA CLASE PADRE
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
	    }//fin clase interna
	    //instanciar objetos y metodos de la clase simplelinkdlist
	    //head o cabeza del nodo de la lista
	    private Node<E> head = null;
	    private Node<E> tail = null;
	    //numero de nodos de la lista
	    private int size = 0; //EDD Dinamica!!
	    //constructor
	    public SimpleLinkedList() {
	    }
	   // emtodos apra la lista enlzada
	    
	   //tamaño
	    public int size() {
	    	return size;
	    }
	    public boolean isEmpty() {
	    	return size==0;
	    }
	    public E first() {
	    	if(isEmpty()) return null;
	    	return head.getElement();
	    }
	    public E last() {
	    	if(isEmpty()) return null;
	    	return tail.getElement();
	    }
	    public void addfirst(E e) {
	    	head= new Node<>(e,head);//e= elemnto y ehad=r eference
	    	if(size==0)
	    	tail=head;
	    	size++;
	    }
	    public void addlast(E e) {
	    	Node<E> newest= new Node<>(e,null);//e= elemnto y ehad=r eference
	    	if(isEmpty())
	    	tail.setNext(newest);
	    	tail=newest;
	    	size++;
	    }
	    //remove
	    public E removeFirst() {
	    	if(isEmpty()) return null;
	    	//n1,n2,n3
	    	E e1= head.getElement();//obetenen r el avlrod el priemr eleemto n1
	    	head= head.getNext();//apunto o reference al next n2
	    	size--;
	    	if(size==0)
	    		tail=null;
	    	return e1;
	    }
	    public E getElementObject(int index) {
	    	int c=0;
	    	//n1n2n3
	    	Node<E>tmp=head;
	    	//recorre
	    	while(c<index)
	    	{
	    		tmp=tmp.getNext();
	    	c++;
	    	}
	    	return tmp.getElement();
	    }
	    //shwo sall
	    public void getAll() {
	    	Node<E>tmp=head;
	    	while(tmp!=null){
	    		System.out.println(tmp.getElement().toString());
	    		tmp=tmp.getNext();
	    	}
	    }
	    @SuppressWarnings("unchecked")
		public double promedio() {
	    	Node<Estudiante> tmp=(Node<Estudiante>)head;
	    	double suma =0, promedio=0;
	    	while(tmp!=null) {
	    		suma+= tmp.getElement().edad;
	    		tmp=tmp.getNext();
	    	}
	    	promedio=suma/size;
	    	return promedio;
	    }
	    
	    @SuppressWarnings("unchecked")
		public String estudiantemayor() {
	    	Node<Estudiante> tmp= (Node<Estudiante>) head;
	    	int cestumayort =0;
	    	String sdsa=null;
	    	while(tmp!=null) {
	    		if(tmp.getElement().edad>cestumayort)
	    		{
	    			cestumayort= tmp.getElement().edad;
	    			sdsa= tmp.getElement().mostrar();
	    		}
	    		tmp=tmp.getNext();
	    	}
	    	return sdsa;
	    }
	    
	    @SuppressWarnings("unchecked")
		public int sacaramayo() {
	    	Node<Estudiante> tmp= (Node<Estudiante>) head;
	    	int cont =0;
	    	while(tmp!=null) {
	    		if(tmp.getElement().edad>20)
	    		{
	    			cont++;	    				    			
	    		}
	    		tmp=tmp.getNext();
	    	}
	    	return cont;
	    }
	    @SuppressWarnings("unchecked")
		public void getAllestudiante() {
	    	Node<Estudiante> tmp= (Node<Estudiante>) head;
	    	while(tmp!=null) {
	    		System.out.println(tmp.getElement().mostrar());
	    		tmp=tmp.getNext();
	    	}
	    }
}//fin clase padre