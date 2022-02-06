package pilasyColas;

import java.util.Scanner;
import java.util.Stack;
public class BastidasTCIpilas1 
{
	public static void main(String[] args)
	{
		
		//Programa que permite insertar 5 palabras por teclado en una pila 
		//y posteriormente visualiza los mismos
		System.out.println("inserte 5 palabras: ");
		Scanner words=new Scanner(System.in);
		Stack<String>pila=new Stack<String>();
		for(int q=0;q<5;q++)
			pila.push(words.next());
		while(!pila.isEmpty())
		{
			System.out.print(pila.pop()+" ");
		}
	}
}