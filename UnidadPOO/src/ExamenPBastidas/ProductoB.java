package ExamenPBastidas;

public abstract class ProductoB {
	 String nombre;
	 double precio;
	 int cantidad;
	public ProductoB(String nombre, double precio, int cantidad) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	public abstract double calcular();
	public String getNombre() {
		return nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	@Override
	public String toString() {
		return "ProductoB [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}	
	
}