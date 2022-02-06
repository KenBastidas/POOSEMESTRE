package poo;

public class Coche extends Vehiculo{
	//variable 
		public int ruedas = 4; //redifinicion
		public int gasolina; //propiedad solo del coche
		
		//constructor
		public Coche(int padre, int gasolina) {
		super(); //cargue a la clase hijo la herencia
		this.gasolina = gasolina;
		}
		
		//metodo de coche
		public void tanquear(int litros) {
			gasolina += litros;
		}

		//encapsular las variables 
		public int getRuedas() {
			return ruedas;
		}

		public void setRuedas(int ruedas) {
			this.ruedas = ruedas;
		}

		public int getGasolina() {
			return gasolina;
		}

		public void setGasolina(int gasolina) {
			this.gasolina = gasolina;
		}
	

}
