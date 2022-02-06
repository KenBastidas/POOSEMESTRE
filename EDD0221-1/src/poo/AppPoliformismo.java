package poo;

public class AppPoliformismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matematicas m= new Matematicas();
		System.out.println(m.suma(2, 1));
		System.out.println(m.suma(2, 1, 6));
		double [] array =new double[4];
		array[0]=55.6;
		array[1]=45.6;
		array[2]=65.6;
		array[3]=85.6;
		System.out.println(m.suma(array));

	}

}
