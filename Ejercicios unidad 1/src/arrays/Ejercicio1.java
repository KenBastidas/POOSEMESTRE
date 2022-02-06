package arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ejercicio1 {
	public static void main(String[] args) {
		/*int[] numeros = new int[3];numeros[0]=7;numeros[1]=10;
		numeros[2]=13;*/
		//int[] numeros = [5, 10, 40, 65];
		Scanner entrada=new Scanner(System.in);
		int nElementos;
		nElementos=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de elementos: "));
		char[] letras= new char[nElementos];
		String[] nombres= {"jose","luis","david","carla"};
		System.out.println("Inrgese lso elementos del vector: ");
		for(int i=0;i<nElementos;i++) {
			System.out.println("Vector[" +(i+1)+"]=");
			letras[i]=entrada.next().charAt(0);
		}
		/*for(int i=0;i<letras.length;i++) {
			System.out.println("Vector[" +(i+1)+"]=" + letras[i]);
			letras[i]=entrada.next().charAt(0);}*/
		/*for(String k:nombres) {
			System.out.println("Nombres:"+k);
		}*/
		//int[] numeros= {2,3,5,7,9};
		/*double[] numeros = new double[5];
	    double acu = 0,i;
	    System.out.println("Ingrese los elementos del array: ");
	    for (int i=0;i<numeros.length; i++) {
	         System.out.print("numeros[" + i + "]= ");
	         numeros[i] = entrada.nextDouble();
	    }
	    for(int i=0;i<numeros.length;i++) {
	    	acu = acu + numeros[i];
	    }
	    System.out.println("Media es: "+ acu/5);*/
		
		
	}
}