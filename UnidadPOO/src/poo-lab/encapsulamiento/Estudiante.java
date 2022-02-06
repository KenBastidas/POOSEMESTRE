package encapsulamiento;

public class Estudiante {
	private int PDI;
	private String nombres;
	private String apellidos;
	private double primerparcial;
	private double segundoparcial;
	private double tercerparcial;
	private double examenfinal;
	public String getPDI() {
		return PDI;
	}
	public void setPDI(int pDI) {
		PDI = pDI;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public double getPrimerparcial() {
		return primerparcial;
	}
	public void setPrimerparcial(double primerparcial) {
		this.primerparcial = primerparcial;
	}
	public double getSegundoparcial() {
		return segundoparcial;
	}
	public void setSegundoparcial(double segundoparcial) {
		this.segundoparcial = segundoparcial;
	}
	public double getTercerparcial() {
		return tercerparcial;
	}
	public void setTercerparcial(double tercerparcial) {
		this.tercerparcial = tercerparcial;
	}
	public double getExamenfinal() {
		return examenfinal;
	}
	public void setExamenfinal(double examenfinal) {
		this.examenfinal = examenfinal;
	}
	
}
