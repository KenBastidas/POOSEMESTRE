package poo;

public class Persona {
	protected String nombre;
	protected String apellido;
	
	//constructor 
	public Persona(String nombre, String apellido) {
		this.nombre=nombre;
		this.apellido= apellido;
	}
	
	//metodos
	public String nombreCompleto() {
		return this.apellido+ ", " + this.nombre;
	}
	
	public String identificacion() {
		return this.nombreCompleto();
	}
	/*public String nombre;
	public String direccion;
	private String contrasena;
	//conutrstcot
	// e sun metood especial para inicializar obejto o varivbels
	public  Persona()
	{
		nombre= "Sona";
		contrasena= "ersona-per@gmailcom";
		direccion = "yrttr123456";
	}
	//comportamiento = metodos= procedimietnos o funcuiones
	public void imprimir()
	{
		System.out.println("nombre: " + nombre + "contrasena: " + contrasena + "direccion: " +direccion);
	}
*/
}
