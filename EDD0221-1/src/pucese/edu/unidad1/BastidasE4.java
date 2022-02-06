package pucese.edu.unidad1;

import java.util.Random;

public class BastidasE4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  Suppose that a and b are int values.
		  Simplify the following expression: (!(a < b) && !(a > b))
		  Solution: (a == b) 
		*/
		//generar un numero randomico
		Random aleatorio = new Random();
		//asignando el valor aleatorio a al variable
		int a = aleatorio.nextInt()% 100;
		int b = aleatorio.nextInt()% 100;
		System.out.println("(!(a < b) && !(a > b)) es: " +(a == b));
	}

}
