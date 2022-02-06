package pilasyColas;

import java.util.Scanner;
import java.util.Stack;
public class BastidasTCIpilas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//programa que permite insertar N números enteros por teclado en una pila 
		//y posteriormente visualiza los mismos
		System.out.println("inserte la cantidad de números enteros a insertar: ");
		Scanner k=new Scanner(System.in);
		Stack<Integer> pila=new Stack<Integer>();
		int p = k.nextInt();
		for(int l=0;l<p;l++)pila.push(k.nextInt());
		while(!pila.isEmpty())
		{
			System.out.println((int)pila.pop());
		}
	}
}