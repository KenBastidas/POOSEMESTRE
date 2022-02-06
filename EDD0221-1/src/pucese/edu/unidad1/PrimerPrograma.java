package pucese.edu.unidad1;

import java.util.Scanner;

//este es un comentario

public class PrimerPrograma {

	//meotod-funciones-procedimientos(metodo) empieza la
	//ejecuion de la aplicaion en java
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//imprimir un mensaje de bienvenida
		
		System.out.println("bienvenidos a la progaramcion en java!");
		
		//utilizamos el metodo prinftf para mostrar datos con formato
		System.out.printf("%s\n %s\n %s %s","bienvenidos","a la programacion en java", "es otra variable",
				"cuarta linea");
		
		//Entarda y salida de datos
		//Libro como progarmar en java de deitel cap 2,3
		
		Scanner input =new Scanner (System.in);
		//envioar un mensaje de ingresod e datos
		System.out.println("\n inserte un texto a continuacion");

		//ingresod e datos
		String text =input.nextLine();
		
		//imprimir o mostarr loq ue ingrese en al vairbale text
		System.out.println(text);
		
		//cerar variable
		input.close();
		
	}//fin del metodo main

}//fin de la clase primer programa
