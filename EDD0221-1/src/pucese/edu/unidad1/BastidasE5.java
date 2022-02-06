package pucese.edu.unidad1;

public class BastidasE5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			The exclusive or operator ^ for boolean operands
			is defined to be true if they are different,
			false if they are the same. Give a truth table for this function.
		*/
		boolean[] all = { false, true };
	    for (boolean x : all)
	    {
	        for (boolean s: all)
	        {
	            boolean z = x ^ s;
	            System.out.println(x + " ^ " + s + " = " + z);
	        }
	    }
	}
}
