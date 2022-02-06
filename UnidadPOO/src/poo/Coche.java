package poo;

public class Coche {
	//Artibutos
	String color;
	String marca;
	String modelo;
	int kilometraje;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear el objeot 1
		Coche coche1=new Coche();
		coche1.color="blanco";
		coche1.marca="aveo";
		coche1.modelo="family";
		coche1.kilometraje=5000;
		Coche coche2=new Coche();
		coche2.color="rojo";
		coche2.marca="aveo";
		coche2.modelo="family";
		coche2.kilometraje=5000;
		System.out.println("El color del coche 1 es:"+ coche1.color);
		System.out.println("El color del coche 2 es:"+ coche2.color);
		
	}

}
