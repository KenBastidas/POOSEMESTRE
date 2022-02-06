package pucese.edu.unidad1;

public class BastidasT21Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Modify Binary.java to get a program Modify Kary.java
		 that takes a second command-line argument K and convertS
		 the first argument to base K. Assume the base is between 2 and 16.
		 For bases greater than 10, use the letters A through F to represent
		 the 11th through 16th digits, respectively. 
		*/
		// read in the command-line argument
        int n = Integer.parseInt("5");
        // set power to the largest power of 2 that is <= n
        int power = 1;
        while (power <= n/2) {
            power *= 2;
        }
        // check for presence of powers of 2 in n, from largest to smallest
        while (power > 0) {
            // power is not present in n 
            if (n < power) {
                System.out.print(0);
            }
            // power is present in n, so subtract power from n
            else {
                System.out.print(1);
                n -= power;
            }
            // next smallest power of 2
            power /= 2;
        }
        System.out.println();
	}
}