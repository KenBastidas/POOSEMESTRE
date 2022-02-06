package Enumeraciones;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color arr[]= Color.values();
		for(Color col:arr) {
			System.out.println(col+"en el indice"+col.ordinal());
		}
	}

}
