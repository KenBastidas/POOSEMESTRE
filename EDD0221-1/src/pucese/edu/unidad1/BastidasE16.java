package pucese.edu.unidad1;

import java.util.Scanner;

public class BastidasE16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			A physics student gets unexpected results when using the code
			double force = G * mass1 * mass2 / r * r;
			to compute values according to the formula F = Gm1m2 / r2.
			Explain the problem and correct the code.
			Solution: Itdivides by r, then multiplies by r 
			(instead of dividing by r *r).
			Use parentheses:
			double force = G * mass1 * mass2 / (r * r);
		*/
		double G, m1, m2, r;
		Scanner entrada = new Scanner(System.in);
		System.out.print("escriba el G:");
		G= entrada.nextDouble();
		System.out.print("escriba el m1:");
		m1=  entrada.nextDouble();
		System.out.print("escriba el m2:");
		m2=  entrada.nextDouble();
		System.out.print("escriba el r:");
		r=  entrada.nextDouble();
		//resultado
		double force = G * m1 * m2 / (r * r);
		//imprimir el resultado
		System.out.printf("el resultado es %f \n", force);

	}

}
