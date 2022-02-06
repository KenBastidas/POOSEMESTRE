package poo;

import javax.swing.JOptionPane;

public class Operaciones {
//atributos
	float numero1;
	float numero2;
	float suma;
	float resta;
	float multiplicacion;
	float division;
	public void igresarNumeros() {
	numero1=Float.parseFloat(JOptionPane.showInputDialog("numero 1:"));
	numero2=Float.parseFloat(JOptionPane.showInputDialog("numero 2:"));
	}
	//methodsuma
	public void sumar() {
		suma=numero1+numero2;
	}
	public void restar() {
		resta=numero1-numero2;
	}
	public void multiplicar() {
		multiplicacion=numero1*numero2;
	}
	public void dividir() {
		division=numero1/numero2;
	}
	public void showresulst(){
		// TODO Auto-generated method stub
		System.out.println("El color del coche 1 es:"+ suma);
		System.out.println("El color del coche 2 es:"+ resta);
		System.out.println("El color del coche 1 es:"+ multiplicacion);
		System.out.println("El color del coche 2 es:"+ division);
	}
	public static void main(String[] args) {
		Operaciones op= new Operaciones();
		op.igresarNumeros();
		op.sumar();
		op.restar();
		op.multiplicar();
		op.dividir();
		op.showresulst();
	}
}