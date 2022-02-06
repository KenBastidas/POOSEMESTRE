package Herencia;

public class Estudiante extends Persona {
	private int CodigoEstudiante;
	private float NotaFinal;
	//constructor method
	public Estudiante(String nombres, String apellidos, int edad, int CodigoEstudiante
	,float NotaFinal) {
		super(nombres, apellidos, edad);
		// TODO Auto-generated constructor stub
		this.CodigoEstudiante=CodigoEstudiante;
		//System.out.println("Ingrese su CodigoEstudiante: "+CodigoEstudiante);
		//System.out.println("Ingrese su NotaFinal: ");
		this.NotaFinal=NotaFinal;
	}
	
	@Override
	public String toString() {
		return "Nombres= " + getNombres() + ", Apellidos= " + getApellidos() + ", Edad= " +getEdad()+ ", CodigoEstudiante= " + CodigoEstudiante + ", NotaFinal= " + NotaFinal +"]";
	}
	

}