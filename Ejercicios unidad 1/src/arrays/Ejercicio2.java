package arrays;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner (System.in);
		int a[],b[],c[];
	    a=new int[10];
	    b=new int[10];
	    c=new int[20];
	    System.out.println("Vectro A");
	    for (int i=0;i<a.length;i++){
	    	System.out.println("A["+(i+1)+"]=");
	        a[i]= entrada.nextInt();
	    }
	    System.out.println("Vectro B");
	    for (int i=0;i<b.length;i++){
	    	System.out.println("B["+(i+1)+"]=");
	        b[i]= entrada.nextInt();
	    }
	    int j=0;
	    for (int i=0;i<10;i++){
	    	c[j]=a[i];
	    	j++;
	    	c[j]=b[i];
	    	j++;
	    }
	    System.out.println("Vectro C");
	    for(int x:c) {
	    	 System.out.println(x);
	    }
	}
}