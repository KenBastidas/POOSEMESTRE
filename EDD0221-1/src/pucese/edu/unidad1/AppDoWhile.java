package pucese.edu.unidad1;

import java.io.BufferedReader;

public class AppDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader bufferedReader = new BufferedReader(new
				InputStreamReader(System.in));
		String cadenaRepeticion, cadenaAConvertir;
		int numero;
		int contador=0;
		int acumualdor=0;
		try
		{
			do
			{
				System.out.print("Introducaz nuemro:");
				cadenaAConvertir = bufferedReader.readLine();
				numero = Integer.parseInt(cadenaAConvertir);
				contador++;
				acumulador+=numero;
				System.out.print("Introducaz nuemro:(S/N):");
				cadenaAConvertir = bufferedReader.readLine();
				
				
			}while
		}
		

	}

}
