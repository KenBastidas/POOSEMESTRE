package Lambda;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class LambdaApp {
	public void ordenar() {
		ArrayList<String> lista = new ArrayList<>();
		lista.add("Redes");
		lista.add("Sistemas Operativos");
		lista.add("Programacion Oreintada a Objetos");
		lista.add("Base de datos");
		lista.add("Interent de la cosas");
		/*Collections.sort(lista,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});*/
		Collections.sort(lista,(String a, String b)->a.compareTo(b));
		for(String emlemento:lista) {
			System.out.println(emlemento);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaApp app= new LambdaApp();
		app.ordenar();

	}

}
