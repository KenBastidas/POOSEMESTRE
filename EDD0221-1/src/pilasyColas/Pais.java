package pilasyColas;

public class Pais {
	public String nombre;
	public String capital;
	public int habitantes;
	//constructor
	/*
	 3. Mediante funciones (tipo pila array) hacer un programa que dado cualquier
	  numero de pa�ses se almacenen, y tenga funci�n de agregar pa�s, eliminar pa�s, mostrar y salir.

	Ayuda: Crear una clase Pais con los atributos nombre, capital, habitantes

	Luego generar otra clase donde tenga los m�todos a�adir, mostrar, eliminar

	Y por ultimo otra clase para implementar la clase y los m�todos
	 */
	Pais(String w, String f, int p){
		nombre = w;
		capital = f;
		habitantes = p;
	}
}