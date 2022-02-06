package arrays;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int matriz[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println("");
		}*/
		Scanner entrada = new Scanner(System.in);
		int matriz[][],nFilas,nCol;
		nFilas=Integer.parseInt(JOptionPane.showInputDialog("numero de Filas: "));
		nCol=Integer.parseInt(JOptionPane.showInputDialog("numero de Columnas "));
		matriz=new int[nFilas][nCol];
		System.out.println("matriz");
		for(int i=0;i<nFilas;i++) {
			for(int j=0;j<nCol;j++) {
				System.out.print("amtrioz["+(i+1)+"]["+(j+1)+"]=");
				matriz[i][j]= entrada.nextInt();
			}
		}
		for(int i=0;i<nFilas;i++) {
			for(int j=0;j<nCol;j++) {
				System.out.print(matriz[i][j]+"");
			}
			System.out.println("");
		}
	}
}