package pucese.edu.unidad1;

import java.util.Scanner;

public class Suma2Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//Sumar dos nuemros
		
		//objeto para ingresop de datos
		
		Scanner entrada = new Scanner(System.in);
		//variables
		int n1;
		int n2;
		int suma;
		//pedir los datos
		System.out.print("escriba el n1:");
		//leer lsod atos del n1
		n1= entrada.nextInt();
		
		//pedir los datos del n2
				System.out.print("escriba el n2:");
				//leer lsod atos del n2
				n2= entrada.nextInt();
		// procesar lsod atos sumar
				suma=n1+n2;
				//imprimir la suma
				System.out.printf("la suma es %d \n", suma);
		*/		
		//formatos
		double n11 = 1.25036;
		//imprim8ir
		System.out.printf("%.3f", n11);
		//System.out.println();
		
		System.out.printf("%.4f", n11);
		
		double q =1.0/3.0;
		System.out.printf("1.0/3.0 =%5.3f %n", q);
		System.out.printf("1.0/3.0 =%7.5f %n", q);
		q= 1.0/2.0;
		System.out.printf("1.0/2.0 =%09.3f %n", q);
		q = 1000.0/3.0;
		System.out.printf("1000/3.0 =%7.1e %n", q);
		q = 3.0/4567.0;
		System.out.printf("3.0/4567.0 =%7.3e %n", q);
		q = -1.0/0.0;
		System.out.printf("-1.0/0.0 =%7.2e %n", q);
		q = 0.0/0.0;
		System.out.printf("0.0/0.0 =%5.2e %n", q);
		System.out.printf("pi =%5.3f, e = %10.4f %n", Math.PI, Math.E);
		double r =1.1;
		System.out.printf("C = 2 * %1$5.5f * %2$4.1f, "+"A = %2$4.1f * %2$4.1f * %1$5.5f %n", Math.PI, r);
	}

}
