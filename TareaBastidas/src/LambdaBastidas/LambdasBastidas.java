package LambdaBastidas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class LambdasBastidas {
	public static void calcular (double number1, double number2) {
		Operaciones suma= (numero1, numero2) -> (numero1+numero2);
		Operaciones resta= (numero1, numero2) -> (numero1-numero2);
		Operaciones multiplicacion = (numero1, numero2)-> (numero1*numero2);
		Operaciones division = (numero1, numero2) -> (numero1/numero2);
		System.out.println("La suma es: "+ suma.Calcular(number1, number2));
		System.out.println("La resta es: " + resta.Calcular(number1,number2));
		System.out.println("La multiplicacion es: " + multiplicacion.Calcular(number1,number2));
		System.out.println("La division es: " + division.Calcular(number1,number2));
	}
	public static void ORDENARMAYORMENOR (double ONUMB1, double ONUMB2) {
		ArrayList<Double> NUMEROS = new ArrayList<>();
		NUMEROS.add(ONUMB1);
		NUMEROS.add(ONUMB2);
		
		Collections.sort(NUMEROS,(number1, number2)->number1.compareTo(number2));
		for(double emlemento:NUMEROS) {
			System.out.println(emlemento);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdasBastidas app= new LambdasBastidas();
		double numb1,numb2;
		Scanner entarda = new Scanner(System.in);
		System.out.println("INGRESE NUMERO 1: ");
		numb1= entarda.nextDouble();
		System.out.println("INGRESE NUMERO 2: ");
		numb2= entarda.nextDouble();
		app.calcular(numb1,numb2);
		app.ORDENARMAYORMENOR(numb1, numb2);
		//System.out.println(emlemento);
	}
}	