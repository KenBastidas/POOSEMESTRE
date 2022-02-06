package arrayys;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class BastidasPersona {
	{
		protected String cedula;
		protected String nombre;
		protected String fechaNacimiento;
		//cosntur
		public BastidasPersona(String cedula, String nombre, String fechaNacimiento) 
		{
			this.cedula= cedula;
			this.nombre=nombre;
			this.fechaNacimiento= fechaNacimiento;
		}
		//metodos
		public String calcularEdad(String edad) 
		{
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate fechaN = LocalDate.parse(edad,format);
			LocalDate now= LocalDate.now();
			Period timel =Period.between(fechaN, now);
			return "edad : "+ timel.getYears() +" años";
		}
		public String nombreComplement()
		{
			return this.cedula+ ", " + this.nombre + ", " + this.fechaNacimiento + ", "+ calcularEdad(this.fechaNacimiento);
		}
		public String identification() 
		{
			return this.nombreComplement();
		}
	}

}
