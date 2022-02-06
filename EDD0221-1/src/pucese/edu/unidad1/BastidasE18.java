package pucese.edu.unidad1;

public class BastidasE18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			Write a program Distance.java that takes two integer
			command-line arguments x and y and prints the Euclidean 
			distance from the point (x, y) to the origin (0, 0).
		*/
		// parse x- and y-coordinates from command-line arguments
        int x = 5;
        int y = 6;

        // compute distance to (0, 0)
        double dist = Math.sqrt(x*x + y*y);
 
        // output distance
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);

	}

}
