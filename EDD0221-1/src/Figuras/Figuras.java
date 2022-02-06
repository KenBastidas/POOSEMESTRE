package Figuras;

import java.util.Scanner;

public class Figuras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		* execesi 
		* bucle exterior 5 times
		* bucle interno imprimor 10 numeros de esaS 5 VECES
		* para un total de 50 numeros impresos
		*/
		//bucle exterior de 5
		/*
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print((i *j)+ "");
			}
			System.out.println();
		}
		*/
		//next
		//draw a cuadrado
		/*
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				//System.out.println((i *j)+ "");
				System.out.print(" * ");
			}
			System.out.println();
		}
		*/
		/*
		//dibujar la mmiatd d eun triangulo
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=i; j++)
			{
				//System.out.println((i *j)+ "");
				System.out.print(i);
			}
			System.out.println();
		}
		*/
		/* que codiugo es necesairo para generar esta salida
		 * 1,1
		 * 2,1
		 * 3,1
		 * 1,2
		 * 2,2
		 * 3,2
		 * */
		/*
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.println(j + " , " + i);
			}
			System.out.println();
		}
		*/
		/*
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=(-1 * i + 5); j++)
			{
				//System.out.println((i *j)+ "");
				System.out.print(".");
			}
			System.out.print(i);
			
			for(int j=1; j<=(i-1); j++)
			{
				System.out.print(".");
			}
			System.out.println();
		}
		*/
		
		Scanner input = new Scanner(System.in);
		int n;
		int fila, col;
		System.out.print("Lado del cuadrado: ");
		n= input.nextInt();;
		for(fila=1; fila<=6; fila++)
		{
			for(col=1; col<=n; col++)
			{
				
				System.out.print(" * ");
				System.out.println("");
			}
		}
		
		//TAREA EN CLASE GENERAR LA CODIFICACION Y DISEÑAR LOS PATRONES PARA LAS SIGUIENTES FIGURAS
				//triangulo
				//rectangulo
				//un cuadrado solo los bordes
				// un triangulo solo los bordes
		        //dibujar la mmiatd d eun triangulo
				// un rectangulo solo los bordes
		
		
	}

}
