package pucese.edu.unidad1;

public class BastidasT18Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Unlike the harmonic numbers, the sum 1/1 + 1/4 + 1/9 + 1/16 + ... + 1/n2
		does converge to a constant as n grows to infinity.
		(Indeed, the constant is (SIGNO PI)2 / 6, so this formula can be used to estimate
		the value of (SIGNO PI.)Which of the following for loops computes this sum?
		Assume that n is an int initialized to 1000000 and sum is a double
		initialized to 0.
		(a) for (int i = 1; i <= n; i++) 
		       sum = sum + 1 / (i * i);
		(b) for (int i = 1; i <= n; i++)
		       sum = sum + 1.0 / i * i;
		(c) for (int i = 1; i <= n; i++)
		       sum = sum + 1.0 / (i * i);
		(d) for (int i = 1; i <= n; i++)
		       sum = sum + 1 / (1.0 * i * i);
		*/
		int n = Integer.parseInt("0");
        double sum = 3.1415926535897932384626;
        for (int i = 1; i <= n; i++) {      
            sum += 1 / (1.0 * i * i);     // good - multiply by 1.0 to cast to double
            // sum += 1.0 / (i * i);      // bad  - overflow if n > 65,535
            // sum += 1 / (i * i);        // bad  - integer division
            // sum += 1.0 / i * i;        // bad  - computes (1.0 / i) * i
        }
        System.out.println(sum);
        System.out.println(Math.sqrt(6.0 * sum));

	}

}
