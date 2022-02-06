package encapsulamiento;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner entrada = new Scanner(System.in);
	Estudiante p = new Estudiante();
	int PDI;
	System.out.println("Ingrese PDI estudaintes");
	PDI= entrada.nextInt();
	p.setPDI(PDI);
	String ap,nom;
	System.out.println("Ingrese apellidos estudaintes");
	ap= entrada.next();
	p.setApellidos(ap);
	System.out.println("Ingrese nombres estudaintes");
	nom= entrada.next();
	p.setNombres(nom);
	double pp, sp, tp, ef;
	System.out.println("Ingrese noTA del primer parcial del estudaintes");
	pp= entrada.nextDouble();
	p.setPrimerparcial(pp);
	System.out.println("Ingrese noTA del segundo parcial del estudaintes");
	sp= entrada.nextDouble();
	p.setSegundoparcial(sp);
	System.out.println("Ingrese noTA del tercer parcial del estudaintes");
	tp= entrada.nextDouble();
	p.setTercerparcial(tp);
	System.out.println("Ingrese noTA del examen final del estudaintes");
	ef= entrada.nextDouble();
	p.setExamenfinal(ef);
	double promedio;
	promedio=(p.getPrimerparcial()+p.getSegundoparcial()+p.getTercerparcial()+p.getExamenfinal())/4;
	System.out.println("Promedio ="+ promedio);
	}
}