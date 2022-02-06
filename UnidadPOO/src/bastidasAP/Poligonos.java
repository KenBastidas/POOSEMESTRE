package bastidasAP;

public abstract class Poligonos {
	protected int nlados;
	//create method contrusctor
	public Poligonos(int nlados) {
		super();
		this.nlados = nlados;
	}
	// create method getters
	public int getNlados() {
		return nlados;
	}
	public abstract double area();
	@Override
	public String toString() {
		return "Numeros de lados=" + nlados + "]";
	}
	
	
	
}