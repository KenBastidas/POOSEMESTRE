package listas;

public class Paticipando {
	public String numero;
	public String nombre;
	public String apellido;
	public int edad;
	public double Mejor_Marca2002;
	public double Mejor_Marca2001;
	public double Mejor_Marca2000;
	public Paticipando(String numero) {
		this.numero =numero;
	}
	public String mostrar() {
		return "Numero: "+this.numero+" Nombre: "+this.nombre+ 
		" Apellido: "+this.apellido+" Edad: "+this.edad+
		" Mejor_Marca2002: "+this.Mejor_Marca2002+" Mejor_Marca2001: "+this.Mejor_Marca2001+
		" Mejor_Marca2000: "+this.Mejor_Marca2000;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getMejor_Marca2002() {
		return Mejor_Marca2002;
	}

	public void setMejor_Marca2002(double mejor_Marca2002) {
		Mejor_Marca2002 = mejor_Marca2002;
	}

	public double getMejor_Marca2001() {
		return Mejor_Marca2001;
	}

	public void setMejor_Marca2001(double mejor_Marca2001) {
		Mejor_Marca2001 = mejor_Marca2001;
	}

	public double getMejor_Marca2000() {
		return Mejor_Marca2000;
	}

	public void setMejor_Marca2000(double mejor_Marca2000) {
		Mejor_Marca2000 = mejor_Marca2000;
	}
}