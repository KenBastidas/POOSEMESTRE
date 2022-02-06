package poo;

public class AppHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciar obj 
				Coche coche = new Coche(3,15);
				
				coche.acelerar(80); //metodo heredado de la superclase
				coche.tanquear(60); //metodo heredado de la subclase
				
				coche.setRuedas(9); //agregar un nuevo valor
				System.out.println(coche.getRuedas());

	}

}
