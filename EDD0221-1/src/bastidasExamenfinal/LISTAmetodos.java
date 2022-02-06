package bastidasExamenfinal;

public class LISTAmetodos<E> extends NODOLista<E> {
	private Node<E> head = null;
    private Node<E> tail = null;
    //numero de nodos de la lista
    private int size = 0; //EDD Dinamica!!
    //constructor
    public LISTAmetodos() {
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
    public Node<E> removeLast() {
    	if(isEmpty()) return null;
    	Node<E> p1= head;
    	Node<E> p2= head.getNext();
    	while(p1!=null && p2!=null) {
    		if(p2.getNext()==null) {
    			tail=p1;
    			p1.setNext(null);
    		}
    	}
    	if(head.getNext()==null)
    		tail=null;
    	return tail;
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
    /*public void getAll() {
    	Node<E>tmp=head;
    	while(tmp!=null){
    		System.out.println(tmp.getElement().toString());
    		tmp=tmp.getNext();
    	}
    }*/
    public void getAllPes() {
    	@SuppressWarnings("unchecked")
		Node<Persona>tmp=(Node<Persona>) head;
    	while(tmp!=null){
    		System.out.println(tmp.getElement().mostrar());
    		tmp=tmp.getNext();
    	}
    }
}