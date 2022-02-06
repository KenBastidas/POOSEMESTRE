package ppaquete1;

public class estatico {
//private String frase="Primera fase";
	private static String frase="Primera fase";
	public static int sumar(int n1, int n2) {
		int suma= n1+n2;
		return suma;
	}
	public static void main(String[] args) {
		/*estatico ob1= new estatico();
		estatico ob2= new estatico();
		ob2.frase = "segunda frase";
		System.out.println(ob1.frase);
		System.out.println(ob2.frase);
		*/
		System.out.println(estatico.frase);
		System.out.println("la suma es:"+estatico.sumar(3,4));
		}
}