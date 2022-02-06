package tipos_datos;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class BastidasMetatri {
	/* Un programa que permita ingresar los lados de un triángulo isósceles
	y calcule e imprima su área y perímetro. Utilice métodos con retorno de valor.
	*/
	public double perimetro(double lsame, double b) {
		double pertriiso=(2*lsame)+b;
		return pertriiso;
	}
	//h= Math.sqrt(Math.pow(lados, 2)-Math.pow(b1, 2));
	public double area(double lsame, double b) {
		double bb=b/2;
		double areatriisioh= Math.sqrt(Math.pow(lsame, 2)-Math.pow(bb, 2));
		double areatriisio = (b*areatriisioh)/2;
		return areatriisio;
	}
	//metodo para mostrar resultado
	public void mostrarResultado(double pertriiso, double areatriisio) {
			System.out.println("El perimetro es = " + pertriiso);
			System.out.println("El area es = " + areatriisio);
	}
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		//double b11=Double.parseDouble(JOptionPane.showInputDialog("ingrese base:"));
		//double b22=Double.parseDouble(JOptionPane.showInputDialog("Ingrese lados iguales:"));
		BastidasMetatri op = new BastidasMetatri();
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese base: "));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("ngrese lados iguales: "));
		double s = op.perimetro(n1,n2);
		double r = op.area(n1,n2);
		op.mostrarResultado(s,r);
	}
}