package bastidasExamenfinal;

import java.util.Scanner;

public class RunLISTA {

	public static void main(String[] args) {
		LISTAmetodos<Persona> listaenlazadaPersona = new LISTAmetodos<Persona>();
		Scanner reader = new Scanner(System.in);
		
		int op=0,op1=0;
		do {
			System.out.println("Menu principal");
			System.out.println("1.Insertar al frente(persona)");
			System.out.println("2.Insertar al final");
			System.out.println("3.Eliminar al frente");
			System.out.println("4.Eliminar al final");
			System.out.println("5.Imprimir datos de la lista");
			System.out.println("6.Finalizar");
			op= reader.nextInt();
		switch(op) {
			case 1:
				agregarpersonasalfrente(listaenlazadaPersona);
				break;
			case 2:
				agregarpersonasalfrente(listaenlazadaPersona);
				break;
			case 3:
				deletingpersonasalfrente(listaenlazadaPersona);
				break;
			case 4:
				deletingpersonasalfinal(listaenlazadaPersona);
				break;
			case 5:
				listaenlazadaPersona.getAllPes();
				break;
		}
		System.out.println("Desea volver");
		System.out.println("1:Regresar");
		System.out.println("2:Salir");
		op1=reader.nextInt();
		}while(op1!=5);
		System.out.println("Cerrado");
	}
	public static void agregarpersonasalfrente(LISTAmetodos<Persona> listaenlazadaPersona) {
		String cedu,name,lastnam,fnac;
		Scanner reader = new Scanner(System.in);
		System.out.println("Ingrese su cedula");
		cedu= reader.next();
		System.out.println("Ingrese nombre");
		name= reader.next();
		System.out.println("Ingrese apellido");
		lastnam= reader.next();
		System.out.println("Ingrese fecha de nacimiento");
		fnac= reader.next();
		Persona adperson= new Persona(cedu,name,lastnam,fnac);
		listaenlazadaPersona.addfirst(adperson);
	}
	public static void agregarpersonasalfinal(LISTAmetodos<Persona> listaenlazadaPersona) {
		String cedu,name,lastnam,fnac;
		Scanner reader = new Scanner(System.in);
		System.out.println("Ingrese su cedula");
		cedu= reader.next();
		System.out.println("Ingrese nombre");
		name= reader.next();
		System.out.println("Ingrese apellido");
		lastnam= reader.next();
		System.out.println("Ingrese fecha de nacimiento");
		fnac= reader.next();
		Persona adperson= new Persona(cedu,name,lastnam,fnac);
		listaenlazadaPersona.addlast(adperson);
	}
	public static void deletingpersonasalfrente(LISTAmetodos<Persona> listaenlazadaPersona) {
		listaenlazadaPersona.removeFirst();
	}
	public static void deletingpersonasalfinal(LISTAmetodos<Persona> listaenlazadaPersona) {
		listaenlazadaPersona.removeLast();
	}
}