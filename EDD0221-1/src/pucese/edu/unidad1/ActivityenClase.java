package pucese.edu.unidad1;

import java.util.Scanner;

public class ActivityenClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programa que lea una cantidad de grados cent�grados
		//y la pase a grados Fahrenheit.
		//La f�rmula correspondiente para pasar de grados cent�grados a fahrenheit es:
		//F = 32 + ( 9 * C / 5)
		Scanner z = new Scanner(System.in);
        double GC, GF;
        System.out.println("Introduzca la cantidad de grados centigrados: ");
        GC = z.nextDouble();
        GF = 32 + (9 * GC / 5);
        System.out.println( GC +" �C =  en fahrenheit es " + GF + "�F");

	}
}