package Operaciones;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperacionesMatematicas op= new OperacionesMatematicas();
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Numero :1"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Numero :2"));
		System.out.println("la suma es:"+op.suma(n1,n2));
		System.out.println("la resta es:"+op.resta(n1,n2));
		System.out.println("la multi es:"+op.multiplicacion(n1,n2));
		System.out.println("la divi es:"+op.division(n1,n2));
	}

}
