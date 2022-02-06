package ExamenPBastidas;

public class ProductNoPerecederoB extends ProductoB{
	String tipo;
	public ProductNoPerecederoB(String nombre, double precio, int cantidad, String tipo) {
		super(nombre, precio, cantidad);
		this.tipo=tipo;
	}
	public String getTipo() {
		return tipo;
	}
	@Override
	public double calcular() {
		double resulta= super.precio*super.cantidad;
		return resulta;
	}
	@Override
	public String toString() {
		return super.toString()+"ProductNoPerecederoB [tipo=" + tipo + "]";
		
	}
	
	

}
