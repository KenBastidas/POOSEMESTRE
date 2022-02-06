package pucese.edu.unidad1;

public class BastidasT6Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program RollLoadedDie.java that prints the result of rolling
		a loaded die such that the probability of getting a 1, 2, 3, 4,
		or 5 is 1/8 and the probability of getting a 6 is 3/8.
		*/
		// double in the range [0.0, 1.0)
        double r = Math.random();
        // integer in the range 1 to 6 with desired probabilities
        int roll;
        if      (r < 1.0/8.0) roll = 1;
        else if (r < 2.0/8.0) roll = 2;
        else if (r < 3.0/8.0) roll = 3;
        else if (r < 4.0/8.0) roll = 4;
        else if (r < 5.0/8.0) roll = 5;
        else                  roll = 6;
        // print result
        System.out.println(roll);

	}

}
