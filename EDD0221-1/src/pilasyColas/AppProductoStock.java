package pilasyColas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AppProductoStock {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// agregar los productos por teclado y luego insertar en una pila
		//antes de insertarlos reaslizar una condicion
		//si el stock tiene cierta cantidad se muestra sino no
		Stack<Producto> proPila = new ArrayStack<Producto>(); //declarada la pila
		//java.util.Stack<Producto> proPila = new java.util.Stack<Producto>();
		//variable del producto
		Producto pro;
		//ingresar datos por teclado
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Scanner reader = new Scanner(System.in);
		System.out.println("inserte la cantidad de datos a insertar");
		int N = reader.nextInt();
		for(int i=0; i<N; i++) {
			//insertar los datos
			System.out.print("insertar el producto, codigo y stock");
			pro = new Producto(reader.next(), reader.nextInt(), reader.nextInt());
			// insertar los objetos pro a la pila
			proPila.push(pro);
		}
		while(!proPila.isEmpty()) {
		//mostrar los datos guardados en la pila
		pro = proPila.pop(); //asignar los datos de la pila a el objeto pro
		//obtener el stock de cada objeto
		int stock = pro.getStock();
		//condicion
		if (stock < 10) {
			pro.mostrar();
		}else {
			System.out.println("stock demasiado bajo");
		}
		}
	}
}