package tarea2;
public class tttt2 {
	// Programa Java para ilustrar el tipo de conversion int a byte
    public static void main(String args[]) 
    { 
        byte b = 50;   
        //casting de tipo int a byte
        //mostraría error si no detallamos (byte)
        b = (byte)(b * 2); 
        System.out.println(b);
    }
}