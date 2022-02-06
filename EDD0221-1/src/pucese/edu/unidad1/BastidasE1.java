package pucese.edu.unidad1;

public class BastidasE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  Suppose that a and b are int values.
		  What does the following sequence of statements do?		
		  	int t = a;
			b = t;
			a = b;
			Solution: sets a, b, and t equal to the original value of a.
		*/
		int a,b,t;
		a=7;
		b=4;
		t=9;
		t=a;
		b=t;
		a=b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(t);
	}

}
