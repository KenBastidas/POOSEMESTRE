package arrays;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Aaaaaaaaaaaa {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tt = new Scanner(System.in);
		/*int t1;
		t1= Integer.parseInt(JOptionPane.showInputDialog("digiete numero: "));
		double t2;
		t2= Double.parseDouble(JOptionPane.showInputDialog("taki numero:"));
		*/
		 int ElementosN;
		 System.out.println("Total de elementos A y B: ");
		 ElementosN = tt.nextInt();
		 double v[] = new double[ElementosN];
		 double z[] = new double[ElementosN];
		 System.out.println("Elementos A:");
		 for(int i = 0; i < v.length; i++) {
			 System.out.println("Elemento " + (i+1) + ": ");
			 v[i] = tt.nextDouble();
		 }
		 System.out.println("Elementos B:");
		 for(int i = 0; i < z.length; i++) {
			 System.out.println("Elemento " + (i+1) + ": ");
			 z[i] = tt.nextDouble();
		 }
		 int op;
		 do {
		 	 System.out.println("MENU: ");
		 	 System.out.println("1.Suma");
		 	 System.out.println("2.Resta");
		 	 System.out.println("3.Multi");
		 	 System.out.println("4.Divisio");
		 	op = tt.nextInt();
		 	 switch(op){
		 	case 1:
		 		 System.out.println("Suma");
		 		double suma[] = new double[v.length];
		 		double total = 0;
		 		 	 for(int i = 0; i < suma.length; i++) {
		 		 		suma[i] = v[i] + z[i];
		 		 		total += suma[i];
		 		 		BigDecimal sum= new BigDecimal(suma[i]).setScale(2, RoundingMode.HALF_UP);
		 		 		System.out.println("Suma de: " + v[i]+ " + " + z[i] + "  = [" + sum + "]");
		 		 	 }
		 		 	BigDecimal resultado= new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);
		 		 	 System.out.println("total = " + resultado);
		 		break;
		 	case 2:
		 		 System.out.println("Resta");
		 		double resta[] = new double[v.length];
		 		double totalr = 0;
		 		 	 for(int i = 0; i < resta.length; i++) {
		 		 		resta[i] = v[i] - z[i];
		 		 		totalr += resta[i];
		 		 		System.out.println("resta de: " + v[i]+ " - " + z[i] + "  = [" + resta[i] + "]");
		 		 	 }
		 		 	 System.out.println("total = " + totalr);

		 		 break;
		 	case 3:
		 		 System.out.println("Multiplicacion");
		 		double multi[] = new double[v.length];
		 		double totalm = 0;
		 		 	 for(int i = 0; i < multi.length; i++) {
		 		 		multi[i] = v[i] * z[i];
		 		 		totalm += multi[i];
		 		 		System.out.println("Multiplicacion de: " + v[i]+ " * " + z[i] + "  = [" + multi[i] + "]");
		 		 	 }
		 		 	 System.out.println("total = " + totalm);
		 		break;
		 	case 4:
		 		 System.out.println("Division");
		 		double divi[] = new double[v.length];
		 		double totald = 0;
		 		 	 for(int i = 0; i < divi.length; i++) {
		 		 		divi[i] = v[i] / z[i];
		 		 		totald += divi[i];
		 		 		System.out.println("Division de: " + v[i]+ " / " + z[i] + "  = [" + divi[i] + "]");
		 		 	 }
		 		 	 System.out.println("total = " + totald);
		 		break;
		 	case 5:
		 		System.out.println("Fin");
		 	default:
		 		System.out.println("Digite un valor correcto");
		 		break;
		 	}
		 }while(op != 5);
	}
}