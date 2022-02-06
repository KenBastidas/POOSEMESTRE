package pucese.edu.unidad1;

public class BastidasT22Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program code fragment that puts the binary representation 
		of a positive integer n into a String variable s. 
		*/
		int n = Integer.parseInt("106");
        // repeatedly divide by two, and form the remainders backwards
        String s = "";
        for (int i = n; i > 0; i /= 2) {
            s = (i % 2) + s;
        }
        System.out.println(s);

	}

}
