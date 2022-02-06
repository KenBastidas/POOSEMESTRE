package pucese.edu.unidad1;

import java.util.Random;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejempl0s de operadores logicos
		
		//generar un numero randomico
		Random aleatorio = new Random();
		//asignando el valor aleatorio a al variable
		double i = aleatorio.nextInt()% 100;
		int j = aleatorio.nextInt()% 100;
		
		System.out.println("i= " + i);
		System.out.println("i= " + j);
		
		//mayor que
		System.out.println("i> j es: " +(i>j));
		System.out.println("i< j es: " +(i<j));
		//mayor o igual que
		System.out.println("i>= j es: " +(i>=j));
		System.out.println("i<= j es: " +(i<=j));
		//igual y no es igual
		System.out.println("i== j es: " +(i==j));
		System.out.println("i!= j es: " +(i!=j));
		
		//and
		System.out.println("i>10) && (j<10) es: " + ((i<10) && (j<10)));
		
		//or
		System.out.println("i<10) || (j<10) es: " + ((i<10) || (j<10)));
		
		//conjunto e ufnciones para las mattematucas impemetnar en funciones
		//esta es la libreria: math
		//Potencia
		System.out.println("POTENCIA: " + Math.pow(i, j));
		//raiz cuadrada
		System.out.println("Raiz ^2: " + Math.sqrt(i));
		//logaritmso
		System.out.println("loga decimal: " + Math.log10(i));
		//values absolutes
		System.out.println("Valor abso: " + Math.abs(i));
		//redodneo
		System.out.println("Redon: " + Math.floor(i));
		//maximo
		System.out.println("maximo: " + Math.max(i, j));
		//minimo
		System.out.println("minimo: " + Math.min(i, j));
		//pi
		System.out.println("PI: " + Math.PI);
		
		
		
		
	}

}
