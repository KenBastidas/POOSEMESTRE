package tarea2;
public class ttttttt2 {
	// Programa Java para ilustrar el tipo de conversion explicita
	    public static void main(String[] args)
	    {
	        double d = 100.04; 
	        //casting de tipo
	        long l = (long)d;
	        //casting de tipo
	        int i = (int)l; 
	        System.out.println("Valor Double "+d);
	        //parte fraccionaria perdida
	        System.out.println("Valor Long "+l); 
	        //parte fraccionaria perdida
	        System.out.println("Valor Int "+i); 
	    } 
}