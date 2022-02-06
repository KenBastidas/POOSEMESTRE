package pucese.edu.unidad1;
public class ClaseString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// generar string
		System.out.println("el primer programa");		
		//cadena
		//declarar
		String str = new String ("el primer programa");
		String str1 = "el primer programa";
		//string nulos
		String strn = "";
		String strn1 = new String();				
		//como obtengo los datos desde los string
		int longitud = str.length();//contar cuantos datos tengo de la linea 9
		System.out.println("longitud: " + longitud);
		//obtener donde comienza un string
		boolean resultado = str.startsWith("el");
		System.out.println(resultado);
		//donde comienza el string
		boolean resultado1 = str.endsWith("programa");
		System.out.println(resultado1);
		//buscar la primera ocurrencia o aparicion de una letra
		int pos = str.indexOf('p');
		System.out.println(pos);
		//el operador logico == no es igual metodo equals
		String str5="El lenguaje Java"; //cadena string
		String str6=new String("El lenguaje Java"); //objeto string
		if (str5 == str6) {
			System.out.println("los mismos objetos");
		}else {
			System.out.println("son distintos objetos");
		}
				
				if (str5.equals(str6)) {
					System.out.println("tienen el mismo contenido");
				}else {
					System.out.println("no tienen el mismo contenido");
				}
				//extraer substring == subcadenas
				String str8="El lenguaje Java";
				String subStr = str8.substring(12);
				System.out.println(subStr);
				String subStr1 = str8.substring(3,11);
				System.out.println(subStr1);
				//conversion de numero a string
				int valor = 10;
				String str9 = String.valueOf(valor);
				System.out.println(str9);
				//reversa de una cadena
				String input = "hola mundo mundial";
				StringBuilder input1 = new StringBuilder();
				input1.append(input); //reversa
				input1 = input1.reverse();
				System.out.println(input1);
				//reversa de una cadena sin reverse
				char[] char1 = input.toCharArray();
				for (int i = char1.length-1;i>=0; i--)
					System.out.print(char1[i]);				
			}
}