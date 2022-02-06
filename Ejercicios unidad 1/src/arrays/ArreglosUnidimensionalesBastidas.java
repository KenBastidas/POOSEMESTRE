package arrays;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ArreglosUnidimensionalesBastidas {
	public static void main(String[] args) {
		//1. Un programa que permita ingresar un vector de N elementos 
		//e imprima la posición y el número menor. 
		Scanner s = new Scanner (System.in);
		int ntos;
		ntos=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de elementos: "));
		int[] nmds= new int[ntos];
		System.out.println("Ingrese los elementos del vector: ");
		for(int i=0;i<ntos;i++) {
			System.out.println("Vector[" +(i+1)+"]=");
			nmds[i]=s.nextInt();
		}
		int menor= nmds[0];
		
	    for(int i=0;i<nmds.length;i++) {
	        if(nmds[i]<menor){
	           menor=nmds[i];
	         }
	    }
	    for(int i=0;i<nmds.length-ntos+1;i++) {
	    System.out.println("El menor es:"+"Vector[" +(i+1)+"]="+menor);}
	}
}