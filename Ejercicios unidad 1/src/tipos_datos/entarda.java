package tipos_datos;

import javax.swing.JOptionPane;

public class entarda {

	public static void main(String[] args) {
		//clase del 4/11/2021
		// TODO Auto-generated method stub
		String cadena;
		int edad;
		float nota;
		char letra;
		cadena=JOptionPane.showInputDialog("Ingrese al cadena: ");
		edad=Integer.parseInt(JOptionPane.showInputDialog("Inrgese al edad: "));
		nota=Float.parseFloat(JOptionPane.showInputDialog("Inrgese la nota: "));
		letra=JOptionPane.showInputDialog("Ingrese una letra: ").charAt(0);
		JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);		
		JOptionPane.showMessageDialog(null, "La edad es: " + edad);
		JOptionPane.showMessageDialog(null, "La nota es: " + nota);
		JOptionPane.showMessageDialog(null, "La letra es: " + letra);
			
	}
}