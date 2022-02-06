package arrayys;

public class BastidasPParcial2 {
	public static void main(String[] args) {
		double Array[][]= { 
				{27.33, 22.22, 10.00, 0.00, -22.22},
				{5.00, 0.00, -1.50, 2.50, 10.00},
				{3.45, 2.33, -4.56, 12.56, 12.01},
				{1.02, 2.22, 12.70, 34.00, 12.00},
				{-2.00, -56.20, 3.30, 2.00, 1.00},
		};
		for (double [] fila:Array) {
			for(double z:fila) {
				System.out.print(z+" ");
			}
			System.out.println();
		}
		imprimir(Array);
	}
	
	public static void imprimir(double [][] notas) {
		for(int w=0;w<notas[0].length;w++)
			System.out.printf("	"+ w+ "      ");
			System.out.println("      Suma");
		for(int k=0;k<notas.length;k++) {
			System.out.print(k+"[	");
			for(int g=0;g<notas[k].length;g++)
			{
				System.out.print(notas[k][g]+"	");
			}
			System.out.print("]");
			System.out.print(" ->  "+obtenerSuma(notas[k])+" ");
			System.out.println();	
		}	
	}
	public static double obtenerSuma(double[] notas) {
		double total=0;
		for(double resultado:notas)
			total+=resultado;
		return (double)total;
	}
}