package actividadesclassUnit2Bastidas;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class CalculodeAreasBastidas {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Elaborar un programa que calcule e imprima el área de las siguientes figuras 
		geométricas según la opción seleccionada:
		a.- Área del triángulo (Ingresar base y altura)
		b.- Área del Cuadrado (Ingresar lado)
		c.- Área del Círculo (Ingresar radio)
		d.- Área del Rectángulo (Ingresar base y altura)
		*/
		System.out.println("MENU DE CALCULO");
		System.out.println("a.Área del triángulo");
		System.out.println("b.Área del Cuadrado");
		System.out.println("c.Área del Círculo");
		System.out.println("d.Área del Rectángulo");
		Scanner tan= new Scanner(System.in);
		double base,h,radio,lado;
		char funa;
		funa= tan.next().charAt(0);
		if(funa=='a') {
			System.out.println("Área del triángulo");
			System.out.println("Ingrese la base:");
			base = tan.nextDouble();
			System.out.println("Ingrese la altura:");
			h = tan.nextDouble();
			double artri= (base*h)/2;
			BigDecimal resultadotri= new BigDecimal(artri).setScale(2, RoundingMode.HALF_UP); 
			System.out.println("Área del triángulo es:" + resultadotri);
		}
		else if(funa=='b') {
			System.out.println("Área del Cuadrado");
			System.out.println("Ingrese el valor de los lados del cuadrado:");
			lado = tan.nextDouble();
			double arcuadrado = Math.pow(lado,2);
			System.out.println("Área del Cuadrado es:" + arcuadrado);
		}
		else if(funa=='c') {
			System.out.println("Área del Círculo");
			System.out.println("Ingrese el valor del radio:");
			radio = tan.nextDouble();
			final double PI=3.141516;
			Double areacir =PI*radio*radio;
			BigDecimal resultadocircu= new BigDecimal(areacir).setScale(2, RoundingMode.HALF_UP); 
			System.out.println("Área del triángulo es:" + resultadocircu);
		}
		else if(funa=='d') {
			System.out.println("Área del Rectángulo");
			System.out.println("Ingrese la base:");
			base = tan.nextDouble();
			System.out.println("Ingrese la altura:");
			h = tan.nextDouble();
			double arrecta= base*h;
			System.out.println("Área del Rectángulo es:" + arrecta);
		}
	}
}