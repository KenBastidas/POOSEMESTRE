package poo;

public class Ciudadano extends Ppersona {
	
	//variable
	protected String documento;
	
	//constructor 
	public Ciudadano(String nombre, String apellido, String documento) {
		super(nombre, apellido);
		this.documento = documento;
	}
	//metodo redifinido
	public String identificacion() {
		return super.identificacion() + ",  documento: " + this.documento;
	}

}
