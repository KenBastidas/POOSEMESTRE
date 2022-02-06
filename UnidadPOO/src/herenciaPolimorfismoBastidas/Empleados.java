package herenciaPolimorfismoBastidas;

public abstract class Empleados {
	//Attributes
	
	protected  String Nombre;
	protected  int Edad;
	protected  double Salario;
	static final double PLUS= 300;
	public Empleados(String nombre, int edad, double salario) {
		super();
		this.Nombre = nombre;
		this.Edad = edad;
		this.Salario = salario;
	}
	public String getNombre() {
		return Nombre;
	}
	protected  abstract void PLUSECR();
	public int getEdad() {
		return Edad;
	}
	public double getSalario() {
		return Salario;
	}
	public double getPLUS() {
		return PLUS;
	}

	@Override
	public String toString() {
		return "Su Nombre es =" + Nombre + ", Su Edad es=" + Edad + ", Su Salario es=" + Salario + ",Podra recibir un PLUS o no de=" + PLUS ;
	}
	
}