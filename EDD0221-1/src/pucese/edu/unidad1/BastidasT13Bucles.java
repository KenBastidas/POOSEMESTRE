package pucese.edu.unidad1;
public class BastidasT13Bucles {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*What is the value of m and n after executing the following code?
		int n = 123456789;
		int m = 0;
		while (n != 0) {
		   m = (10 * m) + (n % 10);
		   n = n / 10;
		}*/
		int n = Integer.parseInt("123456789");        // original integer
        // reverse using arithmetic
        int m = 0;
        while (n != 0) {
            m = (10 * m) + (n % 10);
            n = n / 10;
        }
        System.out.println(m);
        // reverse again using string concatenation
        String s = "";
        while (m != 0) {
            int digit = m % 10;
            s = s + digit;
            m = m / 10;
        }
        System.out.println(s);
	}
}