package pucese.edu.unidad1;

import java.util.Scanner;

public class BastidasBrianParcial3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			3.Dadas las edades y alturas de alumnos, mostrar la edad y la estatura
			media, la cantidad de alumnos mayores de 18 años,
			y la cantidad de alumnos que miden más de 1.75.
			El programa termina cuando se ingresa una edad negativa.
		*/
		Scanner sc = new Scanner (System.in);
		//declaro las variables
		int edad = 0, edadmed = 0,	sumedad= 0, cont_edad=0, cont_estatu=0;
		double estatura = 0,estatumedia = 0,sumalestatu = 0;
		
		for(int z=0; z<=4; z++)
		{
			System.out.println("Introduzca la edad de un alumno:");
			edad = sc.nextInt();
			System.out.println("Introduzca la estatura de un alumno: ");
			estatura = sc.nextDouble();
			if(edad>0)
            {
                cont_edad++;
                sumedad =sumedad+edad;   
            }
            if(estatura>(1.75))
            {
            	cont_estatu++;
                sumalestatu=sumalestatu+estatura;   
            }  
        }
		edadmed=sumedad/cont_edad;
        estatumedia=sumalestatu/cont_estatu;
		System.out.println("La edad media de los alumnos ingresados es: "+edadmed);
        System.out.println("La altura media de los alumnos ingresados es: "+estatumedia);
        System.out.println("Los alumnos mayores de 18 años son: "+cont_edad);
        System.out.println("Los alumnos con alturas mayores de 1.75 son:" +cont_estatu);
	}

}
