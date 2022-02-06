package listas;
import java.util.Scanner;

public class AppSimpleLinkedList<E> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*SimpleLinkedList<Integer> listaEnlazada=new SimpleLinkedList<>();
		listaEnlazada.addfirst(15);
		listaEnlazada.addfirst(25);
		listaEnlazada.addfirst(35);
		System.out.println(listaEnlazada.last());
		listaEnlazada.getAll();
		System.out.println("indice--2--:"+listaEnlazada.getElementObject(2));
		Realizar un programa utilizando listas enlazadas, se debe crear una clase
		estudiantes con los siguientes datos la cedula, nombre,edad los procesos que se deben realizar en la lista son
		(lista de Estudiante)son: calcular el promedio de los estudiantes,
		el estudiante mayor de la lista, y calcular la cantidad de estudiantes
		que tienen mas de 20 años*/
	
	SimpleLinkedList<Estudiante> listaEnlazada = new SimpleLinkedList<>();
	Estudiante ingresoestudiantes;
	Scanner reader = new Scanner(System.in);
	String nom;
	int age;
	String cedu;	
		System.out.println("inserte la cantidad de datos a insertar");
		int N = reader.nextInt();
		for(int i=0; i<N; i++){	
		System.out.println("Ingrese name");
		nom= reader.next();
		System.out.println("Ingrese edad");
		age= reader.nextInt();
		System.out.println("Ingrese cedula");
		cedu= reader.next();
		ingresoestudiantes= new Estudiante(nom, age, cedu);
		listaEnlazada.addfirst(ingresoestudiantes);
		}
		listaEnlazada.getAllestudiante();
		System.out.println("Promedio de las edades: "+listaEnlazada.promedio());
		System.out.println("El estudiante de mayor edad:"+ listaEnlazada.estudiantemayor());
		System.out.println("La cantidad de estudiantes mayores son en total:"+ listaEnlazada.sacaramayo());
	}
}