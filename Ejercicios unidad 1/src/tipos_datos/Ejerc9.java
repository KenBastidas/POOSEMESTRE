package tipos_datos;

import javax.swing.JOptionPane;
public class Ejerc9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=1;i<=10;i++) {
			System.out.println(i);
		}*/
		//Leer un numero y mostrar su cuadrado;
		//Repertir el proceso hasta qe se introdfuzca un numero negativo
		//Ingrese numeros hasta que se introduzca uno negativo y calcula el proemdio de dichos numeros
		double w, contador = 0,acu=0,promedio;
		do {
			w=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
			if(w>=0) {
				contador++;
				acu=acu+w;
			}
		}while(w>=0);
		promedio=acu/contador;
		System.out.println("promedio"+promedio);
		}
}