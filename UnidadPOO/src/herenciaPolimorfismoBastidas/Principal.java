package herenciaPolimorfismoBastidas;
import java.util.ArrayList;
import java.util.Scanner;
public class Principal {
	static ArrayList<Empleados> empleado = new ArrayList<Empleados>();
	static Scanner entrada= new Scanner(System.in);
	public static void main(String[] args) {
		llenarEmpleado();
		mostarResultados();
	}
	public static void llenarEmpleado() {
		int op;
		do {
			System.out.println("Empleados");
			System.out.println("1-Comercial");
			System.out.println("2-Repartidor");
			System.out.println("3-salir");
			System.out.println("Elija una opcion");
			op= entrada.nextInt();
			switch(op)
			{
				case 1: // fill Comercial
					llenarComercial();
					break;
				case 2: //fill Repartidor
					llenarRepartidor();
					break;
			}
		}while(op==1 || op ==2);
	}
	public static void llenarComercial() {
		 String Nombre;
		 int Edad;
		 double Salario, comision;
		 System.out.println("Nombre=");
		 Nombre= entrada.next();
		 System.out.println("Edad=");
		 Edad= entrada.nextInt();
		 System.out.println("Salario=");
		 Salario= entrada.nextDouble();
		 System.out.println("comision=");
		 comision= entrada.nextDouble();
		 Comercial Comercial= new Comercial(Nombre, Edad, Salario,comision);
		 empleado.add(Comercial);
	}
	public static void llenarRepartidor() {
		 String Nombre, zona;
		 int Edad;
		 double Salario;
		 System.out.println("Nombre=");
		 Nombre= entrada.next();
		 System.out.println("Edad=");
		 Edad= entrada.nextInt();
		 System.out.println("Salario=");
		 Salario= entrada.nextDouble();
		 System.out.println("zona=");
		 zona= entrada.next();
		 Repartidor Repartidor= new Repartidor(Nombre, Edad, Salario,zona);
		 empleado.add(Repartidor);
	}
	public static void mostarResultados() {
		
		 for(Empleados emple:empleado) {
			 System.out.println(emple.toString());
			 emple.PLUSECR();
			 
		 }	 
	}	
}