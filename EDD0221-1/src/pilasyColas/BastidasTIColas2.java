package pilasyColas;

import java.util.Scanner;

public class BastidasTIColas2 {
	public static void main(String[] args) {
		/*
		 2.Realice un programa para insertar 7 números en una pila A,
		  y 7 números en una pila B, posteriormente visualice todos los 
		  números de la pila A que también hay en la pila B.
	Ejemplo: Entrada   Salida
         6,4,5,2,4,8,6   8 2  5
         5,7,8,9,7,2,5
		 */
		
		Stack<Integer> npilaA = new ArrayStack<Integer>();//pila declarada
        Stack<Integer> npilaB = new ArrayStack<Integer>();//pila declarada
        Integer A;
        Integer B;
        int pilaA = 0;
        int pilaB = 0;
        Scanner reader = new Scanner(System.in);
        for(int i=0; i<=6; i++) {
            //ingresar los datos
            System.out.print("Insertar en la pila A el elemento "+ i + ": ");
            A = new Integer(reader.nextInt());
            //insertar en la pila
            npilaA.push(A);
        }
        for(int i=0; i<=6; i++) {
            System.out.print("Insertar en la pila B el elemento "+ i + ": ");
            B = new Integer(reader.nextInt());
            //insertar en la pila
            npilaB.push(B);
            }
        int savdt[] = new int[6];
        int q = 0;
        while(!npilaA.isEmpty()) {
             pilaA = npilaA.pop();
            savdt[q] = pilaA;
            q++;
        }
        while(!npilaB.isEmpty()) {
             pilaB = npilaB.pop();
            for(int k=0;k<savdt.length;k++) {
                if(pilaB == savdt[k] ) {
                    System.out.print(pilaB + " ");
                }
            }
        }
	}
}