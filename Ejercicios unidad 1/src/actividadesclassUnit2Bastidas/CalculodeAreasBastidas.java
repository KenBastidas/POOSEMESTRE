package actividadesclassUnit2Bastidas;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class CalculodeAreasBastidas {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Elaborar un programa que calcule e imprima el �rea de las siguientes figuras 
		geom�tricas seg�n la opci�n seleccionada:
		a.- �rea del tri�ngulo (Ingresar base y altura)
		b.- �rea del Cuadrado (Ingresar lado)
		c.- �rea del C�rculo (Ingresar radio)
		d.- �rea del Rect�ngulo (Ingresar base y altura)
		*/
		System.out.println("MENU DE CALCULO");
		System.out.println("a.�rea del tri�ngulo");
		System.out.println("b.�rea del Cuadrado");
		System.out.println("c.�rea del C�rculo");
		System.out.println("d.�rea del Rect�ngulo");
		Scanner tan= new Scanner(System.in);
		double base,h,radio,lado;
		char funa;
		funa= tan.next().charAt(0);
		if(funa=='a') {
			System.out.println("�rea del tri�ngulo");
			System.out.println("Ingrese la base:");
			base = tan.nextDouble();
			System.out.println("Ingrese la altura:");
			h = tan.nextDouble();
			double artri= (base*h)/2;
			BigDecimal resultadotri= new BigDecimal(artri).setScale(2, RoundingMode.HALF_UP); 
			System.out.println("�rea del tri�ngulo es:" + resultadotri);
		}
		else if(funa=='b') {
			System.out.println("�rea del Cuadrado");
			System.out.println("Ingrese el valor de los lados del cuadrado:");
			lado = tan.nextDouble();
			double arcuadrado = Math.pow(lado,2);
			System.out.println("�rea del Cuadrado es:" + arcuadrado);
		}
		else if(funa=='c') {
			System.out.println("�rea del C�rculo");
			System.out.println("Ingrese el valor del radio:");
			radio = tan.nextDouble();
			final double PI=3.141516;
			Double areacir =PI*radio*radio;
			BigDecimal resultadocircu= new BigDecimal(areacir).setScale(2, RoundingMode.HALF_UP); 
			System.out.println("�rea del tri�ngulo es:" + resultadocircu);
		}
		else if(funa=='d') {
			System.out.println("�rea del Rect�ngulo");
			System.out.println("Ingrese la base:");
			base = tan.nextDouble();
			System.out.println("Ingrese la altura:");
			h = tan.nextDouble();
			double arrecta= base*h;
			System.out.println("�rea del Rect�ngulo es:" + arrecta);
		}
	}
}