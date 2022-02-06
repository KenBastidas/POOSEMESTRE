package pucese.edu.unidad1;
public class BastidasT14Bucles {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*What does the following code print out?
		int f = 0, g = 1;
		for (int i = 0; i <= 15; i++) {
		   System.out.println(f);
		   f = f + g;
		   g = f - g;
		}		
		*/
		 int n = Integer.parseInt("10");
	        int f = 0, g = 1;
	        for (int i = 1; i <= n; i++) {
	            f = f + g;
	            g = f - g;
	            System.out.println(f); 
	        }
	}
}