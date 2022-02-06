package tarea2;
public class T2 {
	public static void main(String[] args) {
	// Demostración con enteros
	int[] numeros = { 50, 21, 6, 97, 18 };
	int numeroBuscado = 21;
	int posicionDeElementoBuscado = existeEnArreglo(numeros, numeroBuscado);
	if(posicionDeElementoBuscado == -1){
		    System.out.println("El elemento NO existe en el arreglo");
		  } else {
		    System.out.println("El elemento existe en la posición: " + posicionDeElementoBuscado);
		  }
	}
	//Búsqueda de int en arreglo usando Java
	public static int existeEnArreglo(int[] arreglo, int busqueda){
		for(int x = 0; x < arreglo.length; x++){
			if(arreglo[x] == busqueda){
				return x;
			}
		}return -1;
	}
}