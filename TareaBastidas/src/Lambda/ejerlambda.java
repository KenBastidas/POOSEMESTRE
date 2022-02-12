package Lambda;

import java.util.Scanner;

public class ejerlambda {
	
	public double calcular(double n1, double n2) {
		//sinlambda
		/*Operacion op= new Operacion() {

			@Override
			public double CalcularPromedio(double n1, double n2) {
				// TODO Auto-generated method stub
				return (n1+n2)/2;
			}
		};*/
		//conlambda
		//Operacion op =(double n1, double n2)->{
		Operacion op =(double x, double y) ->{
			//return(n1+n2)/2;
			//double a=4;
			//System.out.println(a);
			//return(n1+n2)/2+a;
			//int x=3;
			//int y=8;
			return (x+y)/2;
			};
			//return op.CalcularPromedio(10, 15);
			return op.CalcularPromedio(n1,n2);
		}
		
		//System.out.println("Promedio: "+op.CalcularPromedio(14, 20));
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejerlambda app= new ejerlambda();
		Scanner entrada = new Scanner (System.in);
		double num1,num2;
		System.out.println("n1:");
		num1= entrada.nextDouble();
		System.out.println("n2:");
		num2=entrada.nextDouble();
		System.out.println("promedio:"+app.calcular(num1,num2));
	}

}
