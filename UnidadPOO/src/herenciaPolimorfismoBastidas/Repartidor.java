package herenciaPolimorfismoBastidas;

public class Repartidor extends Empleados{
	
	private String zona;
	
	public Repartidor(String nombre, int edad, double salario, String zona) {
		super(nombre, edad, salario);
		// TODO Auto-generated constructor stub
		this.zona=zona;
		PLUSECR();
	}

	public String getZona() {
		return zona;
	}
	@Override
	protected  void PLUSECR() {
		double na;
		if(Edad<25 && zona.equals("zona3")){
			 na= Salario + PLUS;
			System.out.println("Si recibirá el plus!");
			System.out.println("El total recibido por el empleado es ="+ na);
		}else {
		System.out.println("No recibirá el plus!!!");}
	}

	@Override
	public String toString() {
		return super.toString()+"Empleado Repartidor [Su zona es=" + zona + "]";
	}
	
}
