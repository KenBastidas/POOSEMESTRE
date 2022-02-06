package pucese.edu.unidad1;

public class BastidasE7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			What do each of the following print?
			System.out.println(2 + "bc"); prints: 2bc
			System.out.println(2 + 3 + "bc"); prints: 5bc
			System.out.println((2+3) + "bc"); prints: 5bc
			System.out.println("bc" + (2+3)); prints: bc5
			System.out.println("bc" + 2 + 3); prints: bc23
			Explain each outcome.
		*/
		
		System.out.println(2 + "bc");
		System.out.println("En el 1, tenemos a 2 como numero y 'bc' como un caracter estos mediante el + se unene dando: 2bc");
		System.out.println(2 + 3 + "bc");
		System.out.println("En el 2, tenemos a 2 y 3 como numero y 'bc' como un caracter estos mediante el + se suman y luego se unen dando: 5bc");
		System.out.println((2+3) + "bc"); 
		System.out.println("En el 3, tenemos a 2 y 3 entre (), esto no afecta al resultado y 'bc' como un caracter estos mediante el + s dando: 5bc");
		System.out.println("bc" + (2+3)); 
		System.out.println("En el 4, tenemos bc como caracter y sumado a (2+3)de esa forma la suma se sigue cumpliendo");
		System.out.println("bc" + 2 + 3);
		System.out.println("En el 5, tenemos bc como caracter y 2+3 pasan aunirse como un caracter por ello da bc23");

	}

}
