package pucese.edu.unidad1;

import java.util.Scanner;

public class BastidasTAREAENCLASEFUNCIONES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
	    int x1, x2, y1, y2;
	    double distancia;
	    
	 // ingreso de datos
	    System.out.print("Introduzca un valor para x1: ");
	    x1 = scanner.nextInt();
	    System.out.print("Introduzca un valor para y1: ");
	    y1 = scanner.nextInt();
	    System.out.print ("Introduzca un valor para x2: ");
	    x2 = scanner.nextInt();
	    System.out.print ("Introduzca un valor para y2: ");
	    y2 = scanner.nextInt();
	    
	    distancia = Math.sqrt (Math.pow ((x2-x1),2) + Math.pow ((y2-y1),2));
	    System.out.println("La distancia entre los puntos puntos es: " +distancia);

	}

}
