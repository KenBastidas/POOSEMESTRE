package tarea3;
public class OperadoresAsginacion {
	public static void main(String[] args) {
		int a = 20, b = 10, c, d, e = 10, f = 4, g = 9;
        // operador de asignaci�n simple
        c = b;
        System.out.println("Valor de c = " + c);
        // Esta siguiente declaraci�n arrojar�a una exception
        // porque el valor del operando derecho debe ser inicializado
        // antes de la asignaci�n, entonces el programa no
        // compila.
        // c = d;
        // operadores de asignaci�n simples
        a = a + 1;
        b = b - 1;
        e = e * 2;
        f = f / 2;
        System.out.println("a,b,e,f = " + a + "," + b + "," + e + "," + f);
        a = a - 1;
        b = b + 1;
        e = e / 2;
        f = f * 2;
        // operados de asignaci�n compuestos/cortos
        a += 1;
        b -= 1;
        e *= 2;
        f /= 2;
        System.out.println("a,b,e,f (usando operadores cortos)= " + a + "," + b + "," + e + "," + f);
	}
}