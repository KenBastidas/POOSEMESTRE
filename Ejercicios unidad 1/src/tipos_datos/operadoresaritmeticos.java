package tipos_datos;

import javax.swing.JOptionPane;

public class operadoresaritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,suma,resta,producto,residuo;
		double b,division;  
		a=Integer.parseInt(JOptionPane.showInputDialog("Numero 1: "));
		b=Double.parseDouble(JOptionPane.showInputDialog("Numero 2: "));
		suma=(int) (a+b);
		resta=(int) (a-b);
		producto=(int) (a*b);
		division= a/b;
		residuo=(int) (a%b);
		System.out.println("Suma:" +suma);
		System.out.println("resta:" +resta);
		System.out.println("Prudcot:" +producto);
		System.out.println("divison:" +division);
		System.out.println("residuo:" +residuo);
		
		JOptionPane.showMessageDialog(null, "Suma=" +suma+ "\nresta:" +resta +
				"\nPrudcot:" +producto+	"\ndivison:" +division+ "\nresiduo:" +residuo);
		int c,y;
		c=Integer.parseInt(JOptionPane.showInputDialog("Numero 3: "));
		//c=c+5;
		//c-=5;
		//c*=5;
		//c/=5;
		//c=c+1
		//c+=1
		y=c++;
		JOptionPane.showMessageDialog(null,"El resultado es:,"+y);

	}

}
