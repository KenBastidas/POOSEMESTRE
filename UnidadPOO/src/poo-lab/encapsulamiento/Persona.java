package encapsulamiento;

public class Persona {
//atributos
	
	private String apellidos;
	private String nombres;
	private int edad;
	
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos;
	}
	public void setnombres(String nombres) {
		this.nombres=nombres;
	}
	public String getnombres() {
		return nombres;
	}
	public String getapellidos() {
		return apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
