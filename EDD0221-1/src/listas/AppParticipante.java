package listas;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class AppParticipante {

	public static void main(String[] args) {
		int op =0;
		Scanner reader = new Scanner(System.in);
		LinkedList<Paticipando> Parti =new LinkedList<Paticipando>();
		System.out.println("Menu principal");
		System.out.println("1.Añadir pariticpante;");
		System.out.println("2.Mostrar listados de datos(listado por numero");
		System.out.println("3.Mostrar listados por marcas");
		System.out.println("4.Finalizar");
		op= reader.nextInt();
		switch(op) {
		case 1:
			System.out.println("Seleccione Claro");
			ingresarRecargaClaro(Parti);
			break;
		case 2:
			System.out.println("Seleccione CNT");
			//ingresarRecargaCNT(recargacnt);
			break;
		case 3:
			System.out.println("Seleccione MOVISTAR");
			//ingresarRecargaMOVISTAR(recargamovi);
			break;
		}while(op!=4);
		Iterator<Paticipando> Part= Parti.iterator();
		System.out.println("Recargas de claro:");
		System.out.println();
		while(Part.hasNext()){
		System.out.println("*"+Part.next().mostrar());
		}
	}
	
	public static void artr(int w) {
		for(int a=0;a<w;a++) {
			System.out.print("*");		
		}
	}
	public static void ingresarRecargaClaro(LinkedList<Paticipando> Parti) {
		Scanner reader = new Scanner(System.in);
		int ageold;
		String num,numerocfm;
		String nom,lastnom;
		Paticipando savenum;
		double bestMk2, bestMk1, bestMk0;
			System.out.println("Ingrese numero");
			num= reader.next();
			do {
			System.out.println("Ingrese nombre");
			nom= reader.next();
			System.out.println("Ingrese apellido");
			lastnom= reader.next();
			System.out.println("Ingrese edad");
			ageold= reader.nextInt();
			System.out.println("Ingrese Mejor_Marca2002");
			bestMk2= reader.nextDouble();
			System.out.println("Ingrese Mejor_Marca2001");
			bestMk1= reader.nextDouble();
			System.out.println("Ingrese Mejor_Marca2000");
			bestMk0= reader.nextDouble();
			System.out.print("Confrime ingresando el numero de movil otra vez: ");
			numerocfm= reader.next();
				if(!num.equals(numerocfm)) {
					System.out.print("Numero incorrecto ingrese de nuevo: ");						
				}
				else {
					System.out.print("numero correcto");
					savenum= new Paticipando(num);
					Parti.push(savenum);
				}
			}while(!num.equals(numerocfm));
	}
}