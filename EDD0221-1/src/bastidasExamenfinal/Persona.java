package bastidasExamenfinal;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {
	public String cedula;
	public String nombre;
	public String apellido;
	public String fechaNacimiento;
	//cosntur
	
	public Persona(String cedula, String nombre, String apellido, String fechaNacimiento) 
	{
		this.cedula= cedula;
		this.nombre=nombre;
		this.apellido=apellido;
		this.fechaNacimiento= fechaNacimiento;
	}
	public String calcularEdad(String edad) 
	{
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaN = LocalDate.parse(edad,format);
		LocalDate now= LocalDate.now();
		Period timel =Period.between(fechaN, now);
		return timel.getYears() +" años";
	}
	public String mostrar()
	{
		return "Cedula: "+this.cedula+", Nombre: " + this.nombre + ", Apellido: "+this.apellido+", Fecha de nacimiento: " + this.fechaNacimiento + ", tiene: "+ calcularEdad(this.fechaNacimiento);
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}