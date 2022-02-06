package tipos_datos;
import java.util.Scanner;
public class Ejercicic6 {
	public static void main(String[] args) {
		//Programa que imprimka lso 20 primeros numeros pares imprimir 10, ni 20
		//programa que imprima hasta el n numero par
		//no imprimir los umitplos de 8
		int i = 0,n;
		Scanner scan= new Scanner(System.in);
		System.out.println("Ingrese el limite de numeros pares");
		n= scan.nextInt();
		while(i<=n){
			i++;
			if((i==4)||(i==8))
			{
					continue;
			}
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}