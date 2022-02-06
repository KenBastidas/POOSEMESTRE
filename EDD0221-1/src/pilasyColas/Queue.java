package pilasyColas;

public interface Queue <E> {
	//size
	int size();
	//si esta vacia
	boolean isEmpty();
	//retrorne el priemr valor
	E first();
	//remove
	E dequeue();
	void enqueue(E e);
	

}
