package poo;

public class Vehiculo {
	//variable
	
	public int velocidad;
	public int ruedas;
	
	//metodos
	
	public void parar() {
		velocidad = 0;
	}
	
	public void acelerar(int km) {
		velocidad+= km;
	}
}
