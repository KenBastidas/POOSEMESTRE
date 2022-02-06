package poo;

public class AppHerencia3 {

	public static void main(String[] args) {
		//objeto 1
		GPersona a = new GPersona("0801345782", "Cale", "04/06/2003");
		//objeto 2
		Alumno d = new Alumno("0801345123", "Joha", "10/09/2001", "A2	Escritura");
		//objeto 3
		
		Alumno k = new Alumno("0801345456", "Kero", "25/08/2000", "B4	Lengua");
		//Array
		GPersona [] arrayPersona = new GPersona[3];
		arrayPersona[0] = a;
		arrayPersona[1] = d;
		arrayPersona[2] = k;
		lectorArrayPersona(arrayPersona);
	}
	public static void lectorArrayPersona(GPersona [] array) 
	{
		for (int x =0;x<array.length;x++)
		System.out.println("Alumno: " + array[x].identification());	
	}
}