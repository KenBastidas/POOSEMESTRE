package Polimorfismo;

public class Vehiculoturismo extends Vehiculo{
	private int npuertas;

	public Vehiculoturismo(String matricula, String marca, String modelo, int i) {
		super(matricula, marca, modelo);
		this.npuertas=npuertas;
	}

	public int getNpuertas() {
		return npuertas;
	}

	@Override
	public String toString() {
		return super.toString()+ "Numero de puertas [npuertas=" + npuertas + "]";
	}
	
}