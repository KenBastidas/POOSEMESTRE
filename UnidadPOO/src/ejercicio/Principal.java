package ejercicio;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		/*Construir un programa en JAVA que calcule el área
		y el perímetro de un cuadrilátero dada la longitud de sus dos lados.
		Los valores de la longitud deberán introducirse por teclado. 
		Si es un cuadrado, sólo se ingresará la longitud de uno de sus lados
		al constructor.
		*/
		Cuadrilatero c;
		double lado1, lado2, perimetro, area;
		lado1=Double.parseDouble(JOptionPane.showInputDialog("Lado:1"));
		lado2=Double.parseDouble(JOptionPane.showInputDialog("Lado:2"));
		if(lado1==lado2) {
			 System.out.println("es un caudrado ");
			c= new Cuadrilatero(lado1);
		}
		else {
			System.out.println("es un rectangulo ");
			c= new Cuadrilatero(lado1,lado2);
		}
		perimetro= c.getPerimetro();
		area= c.getArea();
		//c.mostrarResultados();
		System.out.println(c.toString());
		}
}