package recursion;

public class Recursividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fatorial
		System.out.println(factorial(6));
		System.out.println(potencia(5, 2));
		System.out.println(potencia(2, 5));
	}
	public static int factorial(int n) throws IllegalArgumentException{
		if(n<0)
			throw new IllegalArgumentException();
		else if(n==0)
			return 1;
		else
		return n*factorial(n-1);
	}
	public static double potencia(double x, int c) {
		if(c==0) {
			return 1;
		}
		else
			return x * potencia(x,c-1);
	}
	public static double power(double x, int c) {
		if(c==0) {
			return 1;
		}
		else
			return x * power(x,c-1);
	}
}