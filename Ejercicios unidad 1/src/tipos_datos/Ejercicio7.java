package tipos_datos;
import java.util.Scanner;
public class Ejercicio7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ingrese dos notas de 10 estudaintes y calcule el promedio de cada uno
		//El prgrama termina cuando la nota promedio de un estudiante es menor a 20.
		Scanner scan= new Scanner(System.in);
		int i = 1;
		double nota1,nota2,promedio;	
		while(i<=10){
			System.out.println("Student Nº"+i);
			System.out.println("Nota1");
			nota1= scan.nextDouble();
			System.out.println("Nota2");
			nota2= scan.nextDouble();
			promedio=(nota1+nota2)/2;
			System.out.println("El promedio es: "+ promedio);
			if(promedio<20) {
				System.out.println("El programa termino porque el promedio fue menor a 20");
			}
			}
	}
}