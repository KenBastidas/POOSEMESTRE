package tipos_datos;

import javax.swing.JOptionPane;

public class archivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double archivo;
		archivo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ta,m�n del archivo en KB"));
		Double archivo_convertido=archivo*1024*8;
		JOptionPane.showMessageDialog(null, "El tama�o dela rchivo en bit es:"+ archivo_convertido);
		
	}
}