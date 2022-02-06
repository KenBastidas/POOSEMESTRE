package Polimorfismo;

public class Vehiculodeportivo extends Vehiculo{
	private int cilindrada;

	public Vehiculodeportivo(String matricula, String marca, String modelo, int i) {
		super(matricula, marca, modelo);
		// TODO Auto-generated constructor stub
		this.cilindrada=cilindrada;
		
	}

	public int getCilindrada() {
		return cilindrada;
	}

	@Override
	public String toString() {
		return super.toString()+ "Vehiculodeportivo [cilindrada=" + cilindrada + "]";
	}
	
	

}
