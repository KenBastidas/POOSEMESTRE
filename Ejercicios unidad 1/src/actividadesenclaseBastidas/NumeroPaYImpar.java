package actividadesenclaseBastidas;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class NumeroPaYImpar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		/*int number;
		System.out.println("Digite un numero");
		number= entrada.nextInt();
		System.out.println(number%2==0 ? "Par":"Impar");
		if(number%2==0) {
			System.out.println("Par");
		}
		else
			System.out.println("Impar");
		*/
		/*
		int n1,n2,n3;
		System.out.println("Digite un 1-numero");
		n1= entrada.nextInt();
		System.out.println("Digite un segundo numero");
		n2= entrada.nextInt();
		System.out.println("Digite un tercer numero ");
		n3= entrada.nextInt();
		if(n1>n2){
			if(n2<n3) {
				System.out.println("mayor: "+ n1);
				if(n2<n3) {
					System.out.println("mayor: "+ n2);
					
				}
			}
		}
		
		else if(n1>n2 && n1>n3){
			System.out.println("mayor: "+ n1);
		}*/
		//permita ingresar una letra determine si la letra es mayúscula o minúscula
		/*char letra;
		letra=JOptionPane.showInputDialog("Ingrese una letra:").charAt(0);
		if(Character.isUpperCase(letra)) {
			JOptionPane.showMessageDialog(null, "Letra mayuscula");
		}
		else {
			JOptionPane.showMessageDialog(null, "Letra minuscula");
		}*/
        /*double workhour, salario;
        System.out.print("Ingresa el valor de horas trabajadas: ");
        workhour = entrada.nextDouble();
        entrada.nextLine();
        salario=workhour*16;
        if(workhour>40)
            salario=salario+(workhour-40)*20;
        System.out.println("Valor de salario: " + salario);
		int horas, pago, horas_extras;
		System.out.println("Numero de horas trabajadas");
		horas=entrada.nextInt();
		if(horas<=40) {
			pago=horas*16;
		}*/
		//Ingres un mes numero e imprima el mes correspondiente en letra y el numero de dias de dicho mes
		int mes;
		System.out.println("Ingrese el mes: ");
		mes= entrada.nextInt();
		switch(mes)
		{
		case 1: System.out.println("El Mes es Enero y tiene 31 dias"); break;
		case 2: System.out.println("El Mes es Febrero y tiene 28 dias");	break;
		case 3: System.out.println("El Mes es Marzo y tiene 31 dias");break;
		case 4: System.out.println("El Mes es Abril y tiene 30 dias");break;
		case 5: System.out.println("El Mes es Mayo y tiene 31 dias");break;
		case 6: System.out.println("El Mes es Junio y tiene 30 dias");	break;
		case 7: System.out.println("El Mes es Julio y tiene 31 dias");break;
		case 8: System.out.println("El Mes es Agosto y tiene 31 dias"); break;
		case 9: System.out.println("El Mes es Septiembre y tiene 30 dias");	break;
		case 10: System.out.println("El Mes es octubre y tiene 31 dias"); break;
		case 11: System.out.println("El Mes es noviembre y tiene 30 dias");break;
		case 12: System.out.println("El Mes es dciciembre y tiene 31 dias");break;
		}
	}
}