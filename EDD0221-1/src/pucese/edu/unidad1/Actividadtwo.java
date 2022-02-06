package pucese.edu.unidad1;

import java.util.Scanner;

public class Actividadtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        //Programa que lee por teclado el valor del radio de una circunferencia
        //y calcula y muestra por pantalla la longitud y el area de la circunferencia
        //Longitud de la circunferencia = 2*PI*Radio,Area de la circunferencia
        //= PI*Radio^2
        Scanner x = new Scanner(System.in);
        //variables
        double ra, lon, area;
        System.out.println("Introduzca el valor del radio de una circunferencia: ");
        ra = x.nextDouble();
        lon = 2 * Math.PI * ra;
        area = Math.PI * Math.pow(ra, 2);
        System.out.println("Longitud de la circunferencia: " + lon);                                    
        System.out.println("Area de la circunferencia: " + area);

	}

}
