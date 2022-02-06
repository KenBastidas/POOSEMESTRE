package pilasyColas;
import java.util.Scanner;
public class AppPais {
public static void main(String[] args) {
	int op =0;
	int op2 =0;
	Metodos ingresopais;
	Stack<Metodos> pila = new ArrayStack<Metodos>(); //declarada la pila
	Scanner reader = new Scanner(System.in);
	do {
		System.out.println("Menu principal");
		System.out.println("1.Añadir pais");
		System.out.println("2.Mostrar");
		System.out.println("3.Eliminar ultimo pais y sus datos");
		System.out.println("4.Salir");
		op= reader.nextInt();
		String nom;
		String cap;
		int habi;	
		switch(op) {
		case 1:
			System.out.println("inserte la cantidad de datos a insertar");
			int N = reader.nextInt();
			for(int i=0; i<N; i++) {
			System.out.println("Ingrese name");
			nom= reader.next();
			System.out.println("Ingrese capi");
			cap= reader.next();
			System.out.println("Ingrese cantidad");
			habi= reader.nextInt();
			ingresopais= new Metodos(nom, cap, habi);
			pila.push(ingresopais);
			}
			break;
		case 2:
			Metodos arPais[]= new Metodos[pila.size()];
			if(!pila.isEmpty())
			{
				int w=1;
				System.out.println("mostrando");
				while(!pila.isEmpty())
				{
					System.out.println("Pais-"+w+":"+pila.top().mostrar());
					Metodos pilap=pila.pop();
					arPais[pila.size()]=pilap;
					w++;
				}
				for(int s=0;s<arPais.length;s++)
				{
					pila.push(arPais[s]);
				}
			}else {
				System.out.println("esta vacio");
			}break;
		case 3:
			System.out.println("pais delete" +pila.pop().eliminar());
			break;
		case 4: 
			System.out.println("bye");
		}	
		System.out.println("Desea vovler");
		System.out.println("1");
		System.out.println("2");
		op2=reader.nextInt();
		}while(op2==1);
	System.out.println("Cerrado");
	}
}