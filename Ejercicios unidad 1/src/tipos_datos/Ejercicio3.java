package tipos_datos;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int edad;
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite la edad");
		edad= entrada.nextInt();
		System.out.println("la edad es: " + edad + " años");
		*/
		/*float nota;
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite la nota");
		nota = entrada.nextFloat();
		System.out.println("la nota es: " + nota + " /50");
		*/
		/*String cadena;
		Scanner entrada = new Scanner(System.in);
		System.out.println("escriba");
		cadena = entrada.nextLine();
		System.out.print("el texto es: " + cadena);
		*/
		/*
		char opcion;
		Scanner entrada = new Scanner(System.in);
		System.out.print("dgita la opcion(A o B): ");
		opcion= entrada.next();
		System.out.print("el texto es: " + opcion);
		*/
		//Un programa que ingrese el precio de un prodcuto
		//y calcule e imprima el IVA(12%) y el total a pagar del produto
		
		float precio;
		float iva=(float) 0.12;
		float total;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite el precio");
		precio = entrada.nextFloat();
		float siva= precio*iva;
		System.out.println("el iva es: " + siva);
		total=precio+siva;
		System.out.println("el total es: " + total);
	}
}
