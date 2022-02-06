package actividadesclassUnit2Bastidas;
import java.util.Scanner;
public class CalculadoraBastidas {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1.Construir un programa que simule el funcionamiento de una calculadora
		que puede realizar las cuatro operaciones aritméticas básicas (suma, resta, producto y división)
		con valores numéricos. El usuario debe especificar la operación con el primer carácter:
		S o s para la suma, R o r para la resta, P o p para el producto y D o d para la división.	 
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
			System.out.println("La división de los numeros ingresados es " + (numero1 / numero2));
		}
	}
}