package tarea2;
public class tttttt2 {
	// Programa Java para ilustrar Conversion de int y double a byte
	public static void main(String args[]) 
	{ 
	        byte b; 
	        int i = 257; 
	        double d = 323.142;
	        System.out.println("Conversion de int a byte."); 
	        //i%256
	        b = (byte) i; 
	        System.out.println("i = " + i + " b = " + b);
	        System.out.println("\nConversion de double a byte.");
	        //d%256
	        b = (byte) d; 
	        System.out.println("d = " + d + " b= " + b);
	}
}