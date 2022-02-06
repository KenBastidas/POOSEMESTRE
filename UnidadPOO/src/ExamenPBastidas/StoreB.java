package ExamenPBastidas;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class StoreB {
	static ArrayList<ProductoB> TIENDA = new ArrayList<ProductoB>();
	static Scanner entrada= new Scanner(System.in);
	public static void main(String[] args) {
		llenarPRODCUT();
		mostarResultados();
		//guardar();
		//leer();
	}
	/*public static void guardar() {
		try {
			FileWriter fw = new FileWriter("PORPE.txt", true);//crea el archivo
			BufferedWriter bw = new BufferedWriter(fw); //preparar el archivo para guardar los datos
			for(ProductoB pol: TIENDA) {
				bw.write(pol.toString()); //guarda lo que se imprime en el metodo toString
				bw.newLine(); //salto de linea
				bw.write("PRICE = " + pol.calcular()); //guardar el
				bw.newLine(); //salto de linea
			}
			bw.flush(); //guardar lo que se a ingresado (cambios)
			
		
		}
		catch(Exception e) {
			System.out.println("Existe un error: " + e);
		}
	}*/
	public static void llenarPRODCUT() {
		int op;
		do {
			System.out.println("PRODUCTOS");
			System.out.println("1-PROPERE");
			System.out.println("2-PRONOPERE");
			System.out.println("3-salir");
			System.out.println("Elija una opcion");
			op= entrada.nextInt();
			switch(op)
			{
				case 1: // fill pere
					PROPERE();
					break;
				case 2: //fill nopere
					PRONOPERE();
					break;
			}
		}while(op==1 || op ==2);
	}
	public static void PROPERE() {
		 String nombre;
		 double precio;
		 int cantidad,dias_a_caducar;
		 System.out.println("Nombre=");
		 nombre= entrada.next();
		 System.out.println("precio=");
		 precio= entrada.nextDouble();
		 System.out.println("cantidad=");
		 cantidad= entrada.nextInt();
		 System.out.println("dias_a_caducar=");
		 dias_a_caducar= entrada.nextInt();
		 ProductPerecederoB ProducPerecederoB= new ProductPerecederoB(nombre, precio, cantidad,dias_a_caducar);
		 TIENDA.add(ProducPerecederoB);
	}
	public static void PRONOPERE() {
		 String nombre,tipo;
		 double precio;
		 int cantidad;
		 System.out.println("Nombre=");
		 nombre= entrada.next();
		 System.out.println("precio=");
		 precio= entrada.nextDouble();
		 System.out.println("cantidad=");
		 cantidad= entrada.nextInt();
		 System.out.println("tipo=");
		 tipo= entrada.next(); 
		 ProductNoPerecederoB ProductNoPerecederoB= new ProductNoPerecederoB(nombre, precio, cantidad,tipo);
		 TIENDA.add(ProductNoPerecederoB);
	}
	public static void mostarResultados() {
		 for(ProductoB produc:TIENDA) {
			 System.out.println(produc.toString());
			 produc.calcular();			 
		 }	 
	}	
}