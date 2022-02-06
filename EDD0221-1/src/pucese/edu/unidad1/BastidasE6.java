package pucese.edu.unidad1;

public class BastidasE6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			Why does 10/3 give 3 and not 3.33333333?
			Solution: Since both 10 and 3 are integer literals,
			Java sees no need for type conversion and uses integer division.
			You should write 10.0/3.0 if you mean the numbers to be double literals.
			If you write 10/3.0 or 10.0/3,
			Java does implicit conversion to get the same result.
		*/
		double g= 10.0/3.0;
		System.out.printf("1.0/3.0 =%5.3f %n", g);

	}

}
