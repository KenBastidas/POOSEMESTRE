package tarea3;
import java.util.Scanner;
public class OperadoresLogicos {
	public static void main(String[] args) {
		String x = "java";
        String y = "dce";
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese usuario:");
        String uuid = s.next();
        System.out.print("Ingrese contraseña:");
        String upwd = s.next();
        // Verifique si el nombre de usuario y la contraseña coinciden o no.
        if ((uuid.equals(x) && upwd.equals(y)) || 
                (uuid.equals(y) && upwd.equals(x))) {
            System.out.println("Bienvenido usuario.");
        } else {
            System.out.println("ID o Contraseña equivocada");
        }
	}
}