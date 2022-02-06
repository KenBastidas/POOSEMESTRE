package pilasyColas;

import java.util.Scanner;
import java.util.Stack;
public class BastidasTCIpilas3 {

	public static void main(String[] args) {
		
		//programa que permite insertar N carácteres por teclado en una pila 
		//y posteriormente visualiza los mismos
		System.out.println("inserte la cantidad de carácteres a insertar: ");
		Scanner z=new Scanner(System.in);
		Stack<Character> pila=new Stack<Character>();
		int h=z.nextInt();
		for(int y=0;y<h;y++)pila.push(z.next().charAt(0));
		while(!pila.isEmpty())
		{
			System.out.println((char)pila.pop());
		}
	}
}