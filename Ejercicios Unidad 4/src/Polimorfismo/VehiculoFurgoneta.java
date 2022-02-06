package Polimorfismo;

public class VehiculoFurgoneta extends Vehiculo{
	private int carga;

	public VehiculoFurgoneta(String matricula, String marca, String modelo, int i) {
		super(matricula, marca, modelo);
		// TODO Auto-generated constructor stub
		this.carga=carga;
	}

	public int getCarga() {
		return carga;
	}

	@Override
	public String toString() {
		return super.toString()+ "VehiculoFurgoneta [carga=" + carga + "]";
	}
	

}
