package arrays;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Eejricico4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int matriz[][],nFilas,nCol;
		nFilas=Integer.parseInt(JOptionPane.showInputDialog("numero de Filas: "));
		nCol=Integer.parseInt(JOptionPane.showInputDialog("numero de Columnas "));
		matriz=new int[nFilas][nCol];
		if(nFilas==nCol){
			for(int i=0;i<nFilas;i++) {
				for(int j=0;j<nCol;j++) {
					System.out.print("Inrgese un hnuemro["+(i+1)+"]["+(j+1)+"]=");
					matriz[i][j]= entrada.nextInt();
				}
			}
			boolean x=true;
			for(int i=0;i<nFilas;i++) {
				for(int j=0;j<nCol;j++) {
					if(matriz[i][j]!=matriz[j][i])
					x=false;
				}
			}
			if(x==true) {
				System.out.print("Es simetrica");
			}
			else {
				System.out.print("No es simetrica");
			}
		}else {
			System.out.print("El numero de filas es diferente al numero de columnas");	
		}
	}
}