package herenciaPolimorfismoBastidas;

public class Comercial extends Empleados{
	
	private double comision;

	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		// TODO Auto-generated constructor stub
		this.comision=comision;
		PLUSECR();
	}

	protected  double getComision() {
		return comision;
	}
	@Override
	public void PLUSECR() {
		double ne;
		if(Edad>30 && comision>200) {
			 ne= Salario +comision+PLUS;
			System.out.println("Se le aplicara el plus!");
			System.out.println("El total recibido por el empleado es ="+ ne);
		}else {
		System.out.println("No se le aplicara el plus!!!");}
	}

	@Override
	public String toString() {
		return super.toString()+"  Empleado Comercial [Su comision es de=" + comision + "]";
	}	
}