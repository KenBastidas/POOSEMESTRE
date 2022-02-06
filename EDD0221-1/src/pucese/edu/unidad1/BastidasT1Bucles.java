package pucese.edu.unidad1;
public class BastidasT1Bucles {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Write a program AllEqual.java that takes three integer 
		 command-line arguments and prints equal if all three are equal,
		 and not equal otherwise
		*/
		int a = Integer.parseInt("10");
        int b = Integer.parseInt("10");
        int c = Integer.parseInt("10");
        if (a == b && a == c) 
        {
            System.out.println("all equal");
        }
        else
        {
            System.out.println("not all equal");
        }
	}
}