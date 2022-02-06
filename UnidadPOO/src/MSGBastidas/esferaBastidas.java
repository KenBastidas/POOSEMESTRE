package MSGBastidas;
public class esferaBastidas {
	//atributos
	private double radio;
	private double volumen;
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}
	//genero metodo getters
	public double getVolumen() {
		volumen=((4.0)* Math.PI * Math.pow(radio, 3.0)/3);
				//((4/3) * Math.PI*(radio*radio*radio));
				//((4.0*Math.PI*Math.pow(radio, 3.0))/3.0);	
		return volumen;
	}
	@Override
	public String toString() {
		return "[volumen=" + volumen + "]";
	}
}