package ejercicio;

public class Cuadrilatero {
	//atributos
	private double lado1;
	private double lado2;
	private double perimetro;
	private double area;
	//costructor rectangulo metodo
	public Cuadrilatero(double lado1, double lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	public Cuadrilatero(double lado1) {
		this.lado1 = this.lado2 = lado1;
	}
	//genero metodo getters
	public double getPerimetro() {
		perimetro= lado1+lado2+lado1+lado2;
		return perimetro;
	}
	public double getArea() {
		area= lado1*lado2;
		return area;
	}
	@Override
	public String toString() {
		return "El lado 1 es:"+lado1+" y "+"El lado es"+lado2
				+ "\nEl Perimetro es=" + perimetro + ", El Area es=" + area;
	}
	/*public void mostrarResultados() {
		System.out.println("perimetro es: "+ perimetro);
		System.out.println("area es: "+ area);
	}*/
	
}