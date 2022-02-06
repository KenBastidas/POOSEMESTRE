package Herencia;

public class Persona {
	//atributtes
	private String nombres;
	private String apellidos;
	private int edad;
	//constructor method
	public Persona(String nombres, String apellidos, int edad) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	//getters method
	public String getNombres() {
		//System.out.println("Ingrese su nombres: ");
		return nombres;
	}
	public String getApellidos() {
	//	System.out.println("Ingrese su apellidos: ");
		return apellidos;
	}
	public int getEdad() {
	//	System.out.println("Ingrese su edad: ");
		return edad;
	}
	
}