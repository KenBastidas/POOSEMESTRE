package actividadesclassUnit2Bastidas;
import java.util.Scanner;
public class CalculadoraBastidas {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1.Construir un programa que simule el funcionamiento de una calculadora
		que puede realizar las cuatro operaciones aritm�ticas b�sicas (suma, resta, producto y divisi�n)
		con valores num�ricos. El usuario debe especificar la operaci�n con el primer car�cter:
		S o s para la suma, R o r para la resta, P o p para el producto y D o d para la divisi�n.	 
		*/
		Scanner tan= new Scanner(System.in);
		
		double numero1, numero2;
		System.out.println("Ingrese el primer numero");
		numero1 = tan.nextDouble();
		System.out.println("Ingrese el segundo numero");
		numero2 = tan.nextDouble();
		char funarit;
		funarit= tan.next().charAt(0);
		if(funarit=='S' || funarit=='s') {
			System.out.println("La suma de los numeros ingresados es:" + (numero1 + numero2));
		}
		else if(funarit=='R' || funarit=='r') {
			System.out.println("La resta de los numeros ingresados es " + (numero1 - numero2));
		}
		else if(funarit=='P' || funarit=='p') {
			System.out.println("El producto de los numeros ingresados es " + (numero1 * numero2));
		}
		else if(funarit=='D' || funarit=='d') {
			System.out.println("La divisi�n de los numeros ingresados es " + (numero1 / numero2));
		}
	}
}