package pilasyColas;

public class Pais {
	public String nombre;
	public String capital;
	public int habitantes;
	//constructor
	/*
	 3. Mediante funciones (tipo pila array) hacer un programa que dado cualquier
	  numero de países se almacenen, y tenga función de agregar país, eliminar país, mostrar y salir.

	Ayuda: Crear una clase Pais con los atributos nombre, capital, habitantes

	Luego generar otra clase donde tenga los métodos añadir, mostrar, eliminar

	Y por ultimo otra clase para implementar la clase y los métodos
	 */
	Pais(String w, String f, int p){
		nombre = w;
		capital = f;
		habitantes = p;
	}
}