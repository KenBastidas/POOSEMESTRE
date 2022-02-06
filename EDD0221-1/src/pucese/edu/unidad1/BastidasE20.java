package pucese.edu.unidad1;

public class BastidasE20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			Write a program SumOfTwoDice.java
			that prints the sum of two random integers between 1 and 6
			(such as you might get when rolling dice).
		*/
		int SIDES = 6;
        int s = 1 + (int) (Math.random() * SIDES);
        int z = 1 + (int) (Math.random() * SIDES);
        int sum = s + z;
        System.out.println(sum);

	}

}
