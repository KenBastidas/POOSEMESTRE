package pilasyColas;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class BastidasTIColas1 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*		 1.En un cola hallar su suma de los elementos;
		 el mayor; el menor; los elementos K que se repiten; suma de pares
		*/
		int Sp=0;;
		LinkedList<Integer> cola= new LinkedList<Integer>();
		cola.addFirst(4);
		cola.addFirst(6);
		cola.addFirst(8);
		cola.addFirst(11);
		cola.addFirst(17);
		cola.addFirst(24);
		cola.addFirst(9);
		cola.addFirst(9);
		System.out.println("Number mayor :"+ Collections.max(cola));
		System.out.println("Number menor :"+ Collections.min(cola));
		int suma=0;
		//4+6+8+11+17+24+9=
		for(Integer i:cola)
		{
			suma+= i;
		}
		System.out.println("Suma de elementos :"+ suma);
		HashSet repiten= new HashSet();
		for(Integer i:cola) {
			if(!repiten.add(i))
			{
				System.out.println("element Repetido:"+i);				
			}
		}
		for(Integer i:cola) {
			if(i%2==0)	{
				Sp+=i;
			}
		}
		System.out.println("Suma de Elementos pares :"+ Sp);
	}
}