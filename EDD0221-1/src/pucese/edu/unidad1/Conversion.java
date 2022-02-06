package pucese.edu.unidad1;
public class Conversion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toString(55,2));
		int x = Integer.parseInt("75");
		System.out.println(x);
		double y = Double.valueOf("3.14");
		System.out.println(y);
		//String a integer
		Integer a = Integer.valueOf("900");
		Integer b = Integer.parseInt("900");
		System.out.println(a);
		//inetger a string
		String cadena= Integer.toString(a);
		String cadena1= String.valueOf(a);
		System.out.println(cadena);
	}
}