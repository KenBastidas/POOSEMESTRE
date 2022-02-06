package listas;
import java.util.Iterator;


import java.util.LinkedList;
import java.util.Scanner;
public class AppRecargas {
	public static void main(String[] args) {
		int op =0;
		Scanner reader = new Scanner(System.in);
		LinkedList<CLARO> recargaclaro =new LinkedList<CLARO>();
		LinkedList<CNT> recargacnt =new LinkedList<CNT>();
		LinkedList<MOVISTAR> recargamovi =new LinkedList<MOVISTAR>();
		do {
			System.out.println("\nMenu principal_Seleccionar compañia");
			System.out.println("0.CLARO");
			System.out.println("1.CNT");
			System.out.println("2.MOVISTAR");
			System.out.println("3.Salir");
			op= reader.nextInt();
			switch(op) {
			case 0:
				System.out.println("Seleccione Claro");
				ingresarRecargaClaro(recargaclaro);
				break;
			case 1:
				System.out.println("Seleccione CNT");
				ingresarRecargaCNT(recargacnt);
				break;
			case 2:
				System.out.println("Seleccione MOVISTAR");
				ingresarRecargaMOVISTAR(recargamovi);
				break;
			}
		}while(op!=3);
		Iterator<CLARO> cla= recargaclaro.iterator();
		System.out.println("Recargas de claro:");
		System.out.println();
		while(cla.hasNext()){
		System.out.println("*"+cla.next().mostrar());
		}
		Iterator<CNT> cnt= recargacnt.iterator();
		System.out.println("Recargas de cnt:");
		System.out.println();
		while(cnt.hasNext()){
		System.out.println("*"+cnt.next().mostrar());
		}
		Iterator<MOVISTAR> movist= recargamovi.iterator();
		System.out.println("Recargas de movistar:");
		while(movist.hasNext()){
			System.out.println("*"+movist.next().mostrar());
		}
		System.out.println();
}
	public static void artr(int w) {
		for(int a=0;a<w;a++) {
			System.out.print("*");		
		}
	}
	public static void ingresarRecargaClaro(LinkedList<CLARO> recargaclaro) {
		Scanner reader = new Scanner(System.in);
		CLARO savenum;
		String numero;
		String numerocfm;
		System.out.print("Ingrese la cantidad a abonar en dolares: ");
		double abono= reader.nextDouble();
		do {
			System.out.print("Ingrese el numero de movil: ");
			numero= reader.next();
		System.out.print("Confrime ingresando el numero de movil otra vez: ");
		numerocfm= reader.next();
			if(!numero.equals(numerocfm)) {
				System.out.print("Numero incorrecto ingrese de nuevo: ");						
			}
			else {
				System.out.print("numero correcto");
				savenum= new CLARO(numero,abono);
				recargaclaro.push(savenum);
			}
		}while(!numero.equals(numerocfm));
	}
	public static void ingresarRecargaCNT(LinkedList<CNT> recargacnt) {
		Scanner reader = new Scanner(System.in);
		CNT savenum;
		String numero;
		String numerocfm;
		System.out.print("Ingrese la cantidad a abonar en dolares: ");
		double abono= reader.nextDouble();
		do {
			System.out.print("Ingrese el numero de movil: ");
			numero= reader.next();
		System.out.print("Confrime ingresando el numero de movil otra vez: ");
		numerocfm= reader.next();
			if(!numero.equals(numerocfm)) {
				System.out.print("Numero incorrecto ingrese de nuevo: ");						
			}
			else {
				System.out.print("numero correcto");
				savenum= new CNT(numero,abono);
				recargacnt.push(savenum);
			}
		}while(!numero.equals(numerocfm));
	}
	
	public static void ingresarRecargaMOVISTAR(LinkedList<MOVISTAR> recargamovi) {
		Scanner reader = new Scanner(System.in);
		MOVISTAR savenum;
		String numero;
		String numerocfm;
		System.out.print("Ingrese la cantidad a abonar en dolares: ");
		double abono= reader.nextDouble();
		do {
			System.out.print("Ingrese el numero de movil: ");
			numero= reader.next();
		System.out.print("Confrime ingresando el numero de movil otra vez: ");
		numerocfm= reader.next();
			if(!numero.equals(numerocfm)) {
				System.out.print("Numero incorrecto ingrese de nuevo: ");						
			}
			else {
				System.out.print("numero correcto");
				savenum= new MOVISTAR(numero,abono);
				recargamovi.push(savenum);
			}
		}while(!numero.equals(numerocfm));
	}
}