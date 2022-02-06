package Figuras;


public class BastidasFGEO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TAREA EN CLASE GENERAR LA CODIFICACION Y DISEÑAR LOS PATRONES PARA LAS SIGUIENTES FIGURAS
		//triangulo 
		System.out.println("Triangulo");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			for(int y = 1; y <= (2*i-1); y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//rectangulo
		System.out.println("\nRectangulo");
		for(int i = 0; i < 5; i++) {
            System.out.print("  *  ");
        }
        System.out.println();
        for(int i = 0; i < 5-2; i++) {
            System.out.print("  *  ");
            for(int j = 0; j < 5-2; j++) {
                System.out.print("  *  ");
            }
            System.out.println("  *  ");
        }
        for(int i = 0; i < 5; i++) {
            System.out.print("  *  ");
        }
        //un cuadrado solo los bordes
        System.out.println("\nCuadrado solo los bordes"); 
            for(int i = 0; i < 5; i++) {
                System.out.print("* ");
            }
            System.out.println();
            for(int i = 0; i < 5-2; i++) {
                System.out.print("*");
                for(int j = 0; j < 5-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("    *");
            }
            for(int i = 0; i < 5; i++) {
                System.out.print("* ");
            } 
		// un triangulo solo los bordes
        System.out.println("\nTriangulo solo los bordes");
        for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			for(int y = 1; y <= (2*i-1); y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// un rectangulo solo los bordes
        System.out.println("\nRectangulo solo los bordes");
		for(int i = 0; i < 5; i++) {
            System.out.print("  *  ");
        }
        System.out.println();
        for(int i = 0; i < 5-2; i++) {
            System.out.print("  *  ");
            for(int j = 0; j < 5-2; j++) {
                System.out.print("     ");
            }
            System.out.println("  *  ");
        }
        for(int i = 0; i < 5; i++) {
            System.out.print("  *  ");
        }
	}

}
