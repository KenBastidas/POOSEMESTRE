package Enumeraciones;

public enum Transporte1 {
	COCHE(60), CAMION(50), AVION(600),TREN(70),BARCO(20);
	///METHOC COTNRUCTO
	private int velocidad;
	
    Transporte1(int vel) {
		velocidad = vel;
	}
	//add a return mtheod
	int getvelocidad() {
		return velocidad;
	}
}
