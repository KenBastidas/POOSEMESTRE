package pucese.edu.unidad1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Funciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* SINTAXIS
		 * 
		 * TIPO_FUNCION (VOID) NOMBRE_FUNCION ( TIPO Y NOMBRE DE ARGUMENTOS)
		 * {
		 * SENTENCIAS
		 * }*/
		
		//suma (funcion) y con ingreso de datos (funcion) desde consola
		
	System.out.println("suma: ");
	
	System.out.println("suma: " + suma(15, 20));
	
	//ingreso de datos 
	
	String texto = leerTexto("introduce un mensaje");
	System.out.println(texto);
	
	String texto1 = leerTexto("introduce un mensaje dos");

	System.out.println(texto +  " " + texto1);
	}
	public static String leerTexto(String mensaje) {
		String texto;
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.print(mensaje);
			texto = in.readLine();
		} catch (Exception e) {
			texto = "error";
		}
		return texto;
	}
	public static int suma(int a, int b) {
		
		return a+ b;
		}

}
