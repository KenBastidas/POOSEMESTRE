package MSGBastidas;

import javax.swing.JOptionPane;

public class principalbas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		esferaBastidas c= new esferaBastidas();
		double radio, volumen;
		radio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio de una esfera:"));
		volumen= c.getVolumen();
		System.out.println(c.toString());
	}
}