package tipos_datos;

import javax.swing.JOptionPane;

public class circulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ingrese el radio de un circulo y calcule e imprima el area y perimetro.
		double radio;
		final double PI=3.141516;
		//Usar JOptioPane para el ingreso y visualizacion de reusltados.
		radio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio de un circulo: "));
		Double area =PI*radio*radio;
		Double perimetro= 2*PI*radio;
		JOptionPane.showMessageDialog(null, "El area  es: " + area);
		JOptionPane.showMessageDialog(null, "La perimetro es: " + perimetro);
		
				

	}

}
