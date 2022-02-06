package bastidasAP;

public class Rectangulo extends Poligonos{
	private double lado1;
	private double lado2;
	public Rectangulo(double lado1, double lado2) {
		super(2);
		this.lado1=lado1;
		this.lado2=lado2;
	}
	public double getLado1() {
		return lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public double area() {
		double ar = lado1*lado2;
		return ar;
	}
	@Override
	public String toString() {
		return super.toString()+"Rectangulo [lado1=" + lado1 + ", lado2=" + lado2 + "]";
	}
	
}
