package poo;

public class Racional {
	/*
	Laclase Racional define el numerador y el denominador característicos de un numero racional.
	Por cada dato se proporciona un método miembro que devuelve su valor y un metodo que asigna numerador y denominador.
	Tiene un constructor que inicializa un objeto a 0/1. 
	*/
	private int numerador;
	private int denominador;
	//constructor
	public Racional()
	{
		numerador = 0;
		denominador =1;
	}
	//metodos
	public int leerN()
	{
		return numerador;
	}
	public int leerD() 
	{
		return denominador;
	}
	public void asignar(int n, int d) 
	{
		numerador = n;
		denominador = d;
	}
}
