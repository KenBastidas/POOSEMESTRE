package tarea2;
public class ttttt2 {
	// Programa Java para ilustrar la promocion de Tipo en Expresiones
	public static void main(String args[]){
		byte b = 42; 
	    char c = 'a'; 
	    short s = 1024;
	    int i = 50000;
	    float f = 5.67f;
	    double d = .1234;
	    //La expresion
	    double result = (f * b) + (i / c) - (d * s);
	    //Resultado después de todas las 'promociones'
	    System.out.println("resultado = " + result);
	} 
}