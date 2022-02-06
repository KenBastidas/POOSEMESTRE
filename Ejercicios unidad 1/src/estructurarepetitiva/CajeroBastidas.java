package estructurarepetitiva;
import java.util.Scanner;
public class CajeroBastidas {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Hacer un programa que simule un cajero automático con un saldo inicial de 1000 dólares. 
		El usuario debe ingresar una contraseña. (Nota: la contraseña general para este ejercicio es "1234").
		Si la contraseña es correcta aparecerá en la pantalla sus dos nombres y dos apellidos,
		caso contrario saldrá contraseña incorrecta y terminará la ejecución del programa.
		Si la contraseña es correcta, se debe visualizar el siguiente menú de opciones:
		1. Ingresar dinero a la cuenta.
		2. Retirar dinero de la cuenta.
		3. Consultas.
		4. Salir.
		Mostrar un mensaje de error si el monto no es suficiente. Rechazar valores negativos.
		El programa termina cuando el usuario digita la opción 4.  Al finalizar imprimir un mensaje "GRACIAS POR USAR NUESTROS SERVICIOS, VUELVA PRONTO".
		*/
		Scanner scan= new Scanner(System.in);
		double Saldo_Inicial=1000.00,moneydisponible=0;
		int contrase,generalpassword=1234,op=0;
		boolean PASS = true;
		System.out.println("Cajero Atumatico");
		for(int r=0;r<=1;r++) {
			System.out.println("Ingrese su usuario(Nombres Compeltos): ");
			String name= scan.next();
			System.out.println("Por favor ingrese su contraseña: ");
			contrase = scan.nextInt();
			if(contrase == generalpassword) {
	        	PASS=true;
	        	break;
	        }else {
	        	System.out.println("ERROR!!!");
	        	System.out.println("Por favor ingrese una contraseña correcta: ");
	        	PASS=false;
	        }
		}
		if(PASS){
			while(op!=4){
			System.out.println("1. Ingresar dinero a la cuenta: ");
			System.out.println("2. Retirar dinero de la cuenta.: ");
			System.out.println("3. Consultas: ");
			System.out.println("4. Salir");
			System.out.println("Seleccione la opcion: ");
			op= scan.nextInt();
			double DepomoneyIngre;
			double retiromoney;
			switch (op) {
			case 1:
	            // Depositando dinero
				System.out.println("Ingresando dinero a la cuenta: ");
				DepomoneyIngre = scan.nextDouble();
				if(DepomoneyIngre>0 &&DepomoneyIngre<10000) {
					Saldo_Inicial += DepomoneyIngre;
					System.out.println("Ingreso correcto!");
					System.out.println("Su dinero total es: "+ Saldo_Inicial );
				}
				else {
					System.out.println("L cantidad ingresada es incorrecta");
				}
				break;
			case 2:
				// Retiro de dinero
				System.out.println("Ingresando el cantidad de dinero a retirar de su cuenta: ");
				retiromoney = scan.nextDouble();
				if(retiromoney>0 && retiromoney<Saldo_Inicial){
						Saldo_Inicial-=retiromoney;
						System.out.println("Retiro exitoso de: "+retiromoney);
				}else {
						System.out.println("Retiro fallido");
					}
				break;
			case 3:
				System.out.println("Su saldo actual es: "+ Saldo_Inicial);
				break;
			case 4:
				System.out.println("GRACIAS POR USAR NUESTROS SERVICIOS, VUELVA PRONTO");
				return;
			}// switch fin
		}
		}//whilefin
	}
}