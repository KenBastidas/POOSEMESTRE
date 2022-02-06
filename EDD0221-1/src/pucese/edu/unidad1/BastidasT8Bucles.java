package pucese.edu.unidad1;
public class BastidasT8Bucles {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Rewrite TenHellos.java to make a program Hellos.java that takes
		the number of lines to print as a command-line argument. 
		You may assume that the argument is less than 1000.
		Hint: consider using i % 10 and i % 100 to determine
		whether to use "st", "nd", "rd", or "th" for printing the ith Hello.
		*/
		 int n = Integer.parseInt("24");
	     for (int i = 1; i <= n; i++) {
	         System.out.print(i);
	     // ends in 11 through 20 -> use "th" as suffix
	          if (i % 100 >= 11 && i % 100 <= 20) {
	              System.out.print("th");
	          }
	     // otherwise if ends in { 1, 2, 3 } -> use { "st", "nd", "rd" }  as suffix
	     else if (i % 10 == 1) System.out.print("st");
	     else if (i % 10 == 2) System.out.print("nd");
	     else if (i % 10 == 3) System.out.print("rd");
	     // otherwise use "th" as suffix
	     else                  System.out.print("th");
	            System.out.println(" Hello");
	        }
	}
}