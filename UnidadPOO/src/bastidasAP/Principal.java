package bastidasAP;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	static ArrayList<Poligonos> poligono = new ArrayList<Poligonos>();
	static Scanner entrada= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		llenarpolignoa();
		mostarresultados();
	}
	
	public static void llenarpolignoa() {
		int op;
		do {
			System.out.println("Poligonos");
			System.out.println("1-trianuglos");
			System.out.println("2-rectangulo");
			System.out.println("3-salir");
			System.out.println("elija una opcion");
			op= entrada.nextInt();
			switch(op)
			{
				case 1: // fill triangulo
					llenarrti();
					break;
				case 2: //fill rectangulo
					llenarrecta();
					break;
			}
		}while(op==1 || op ==2);
	}
	public static void llenarrti() {
		 double lado1;
		 double lado2;
		 double lado3;
		 System.out.println("LADO1=");
		 lado1= entrada.nextDouble();
		 System.out.println("LADO2=");
		 lado2= entrada.nextDouble();
		 System.out.println("LADO3=");
		 lado3= entrada.nextDouble();
		 Triangulo Triangulo= new Triangulo(lado1,lado2,lado3);
		 poligono.add(Triangulo);
	}
	public static void llenarrecta() {
		 double lado1;
		 double lado2;
		 System.out.println("LADO1=");
		 lado1= entrada.nextDouble();
		 System.out.println("LADO2=");
		 lado2= entrada.nextDouble();
		 Rectangulo Rectangulo= new Rectangulo(lado1,lado2);
		 poligono.add(Rectangulo);
	}
	public static void mostarresultados() {
		 for(Poligonos poli:poligono) {
			 System.out.println(poli.toString());
			 System.out.println("AREA =" +Math.round(poli.area()*100.0)/100.0);
			 
		 }	 
	}	
}