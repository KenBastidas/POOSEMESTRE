package poo;

public class Ppersona {
	protected String nombre;
	protected String apellido;
	
	//constructor 
	public Ppersona(String nombre, String apellido) {
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

}
