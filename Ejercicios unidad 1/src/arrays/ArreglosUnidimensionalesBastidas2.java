package arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ArreglosUnidimensionalesBastidas2 {
	public static void main(String[] args) {
		//2. Un programa que ingrese un vector de N elementos y los ordene
		//de mayor a menor.
		Scanner e = new Scanner (System.in);
		int tos;
		tos=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de elementos: "));
		int[] mds= new int[tos];
		System.out.println("Ingrese los elementos del vector: ");
		for(int i=0;i<tos;i++) {
			System.out.println("Vector[" +(i+1)+"]=");
			mds[i]=e.nextInt();
		}
		for(int i=0;i<mds.length;i++) {
		   	for(int k=0;k<mds.length-i-1;k++) {
		           if(mds[k]<mds[k+1]){
		             int tmp=mds[k+1];
		             mds[k+1]=mds[k];
		             mds[k]=tmp;
		       }
		    }
		}
		System.out.println("Numeros ordenados");
		for(int f=0;f<mds.length;f++) {
		  	System.out.println(mds[f]);
		}
	}
}