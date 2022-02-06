package pucese.edu.unidad1;

public class BastidasE21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			Write a program SumOfSines.java
			that takes a double command-line argument t (in degrees)
			and prints the value of sin(2t) + sin(3t).
		*/
		double degrees = Double.parseDouble("17");
        double radians = Math.toRadians(degrees);
        double sum = Math.sin(2 * radians) + Math.sin(3 * radians);
        System.out.println(sum);

	}

}
