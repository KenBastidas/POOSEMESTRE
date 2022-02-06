package actividadesenclaseBastidas;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

public class VolumenCono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Que ingrese el radio (r) y la altura ( h) de un cono 
		y calcule su volumen. Sabiendo que:  V = 13hPIr2.
		El resultado del volumen debe redondearlo a 2 decimales.
		*/
		double volumen,radio=0,h = 0;
		radio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio radio de un cono:"));  
		h=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura de un cono:")); 
		volumen=(Math.PI*(radio*radio)*h)/3;
		BigDecimal resultado= new BigDecimal(volumen).setScale(2, RoundingMode.HALF_UP); 
		System.out.println("resultado:" + resultado);
	}
}