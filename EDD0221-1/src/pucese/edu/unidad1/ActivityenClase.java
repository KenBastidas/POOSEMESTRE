package pucese.edu.unidad1;

import java.util.Scanner;

public class ActivityenClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programa que lea una cantidad de grados centígrados
		//y la pase a grados Fahrenheit.
		//La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:
		//F = 32 + ( 9 * C / 5)
		Scanner z = new Scanner(System.in);
        double GC, GF;
        System.out.println("Introduzca la cantidad de grados centigrados: ");
        GC = z.nextDouble();
        GF = 32 + (9 * GC / 5);
        System.out.println( GC +" ºC =  en fahrenheit es " + GF + "ºF");

	}
}