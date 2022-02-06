package tipos_datos;

import javax.swing.JOptionPane;

public class Trinaguloisoceles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Realizar un prgrama que permita calcular la altura
		//de un trianuglo isoceles, previo ingreso de su base
		//y de sus aldos iguales
		double base, lados, h, b1, resultado;
		base= Double.parseDouble(JOptionPane.showInputDialog("ingrese base"));
		lados=Double.parseDouble(JOptionPane.showInputDialog("ingrese lago igual del triangulo isoceles"));
		b1= base/2;
		h= Math.sqrt(Math.pow(lados, 2)-Math.pow(b1, 2));
		JOptionPane.showMessageDialog(null, "La altura del triangulo sicoeles es: " + h);
		
		
				

	}

}
