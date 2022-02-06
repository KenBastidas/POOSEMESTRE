package pucese.edu.unidad1;

public class BastidasE8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			Explain how to use Quadratic.java to find the square root of a number.
			Solution: to find the square root of c,
			find the roots of x^2 + 0x - c.
		*/
		double b = Double.parseDouble("9");
        double c = Double.parseDouble("6");

        double discriminant = b*b - 4.0*c;
        double sqroot =  Math.sqrt(discriminant);

        double root1 = (-b + sqroot) / 2.0;
        double root2 = (-b - sqroot) / 2.0;

        System.out.println("r1 es:"+root1);
        System.out.println("r2 es:"+root2);

	}

}
