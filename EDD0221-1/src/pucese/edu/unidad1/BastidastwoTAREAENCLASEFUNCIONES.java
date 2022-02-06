package pucese.edu.unidad1;
import java.util.Scanner;
public class BastidastwoTAREAENCLASEFUNCIONES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int a = (int) (Math.random()*6);
		int b = (int) (Math.random()*6);
		
		int multi = a*b, resul;
		System.out.printf("¿Cuanto es %d * %d?\n ",a,b);
		resul= entrada.nextInt();
		if(resul==multi)
		{
			System.out.println("Muy bien!");
		}
		else
		{
			while(resul !=multi)
			{
				System.out.println("No, por favor intente de nuevo \n");
				resul= entrada.nextInt();
				if(resul==multi)
				System.out.println("Muy bien!");
			}
		}
		
		

	}

}
