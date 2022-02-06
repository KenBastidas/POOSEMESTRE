package actividadesenclaseBastidas;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

public class CalificacionFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*La calificación final de un estudiante de TI se calcula con base a las calificaciones
		de cuatro aspectos de su rendimiento académico:
		participación, primer examen, segundo examen y examen final.
		Sabiendo que las calificaciones anteriores entran a la calificación final
		con ponderaciones del 4%, 28%, 28% y 40%.
		Hacer un programa que calcule e imprima la calificación final
		obtenida por un estudiante (redondeo a 2 decimales). 
		*/
		double participacion=0, primerexamen=0, segundoexamen=0,examenfinal=0;
		participacion=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de participacion: "));  
		primerexamen=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del primer examen: "));
		segundoexamen=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del segundo examen: "));  
		examenfinal=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del examen final: "));
		double p2new=participacion*0.04;
		double pe2new2new=primerexamen*0.28;
		double pse2new=segundoexamen*0.28;
		double pef2new=examenfinal*0.40;
		double calificacionfinal = 0;
		calificacionfinal= p2new + pe2new2new + pse2new + pef2new;
		BigDecimal resultado= new BigDecimal(calificacionfinal).setScale(2, RoundingMode.HALF_UP); 
		System.out.println("resultado:" + resultado);
	}
}