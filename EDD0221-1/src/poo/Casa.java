package poo;

public class Casa {
	String nombrePropietario;
	int superficiePlanta1;
	int superficiePlanta2;
	static int numeroViviendas = 0;
	//mensaje
	static {
		System.out.println("es una prueba de ejcucion de bloque static o estatico");
	}
	//constructor vacio
	//Casa(){
	//}
	//constructor de inicio
	Casa(){
		nombrePropietario = "";
	     superficiePlanta1 = 0;
	      superficiePlanta2 = 0;
	      numeroViviendas++;
	}
	//constructor de parametros
		Casa(String nombrePropietario, int superficiePlanta1){
			this.nombrePropietario = nombrePropietario;
		    this.superficiePlanta1 = superficiePlanta1;
		     superficiePlanta2 = 0;
		     numeroViviendas++;
		}
	//constructor con todos los parametros
		   Casa(String nombrePropietario, int superficiePlanta1, int superficiePlanta2) {
		        this.nombrePropietario = nombrePropietario;
		        this.superficiePlanta1 = superficiePlanta1;
		        this.superficiePlanta2 = superficiePlanta2;
		        numeroViviendas++;
		    }   
	//encapsular las variables
		//obtencion 
		void establecerPropietario(String nombrePropietario) {
			 this.nombrePropietario = nombrePropietario;
		 }
		//envio
		String devolverPropietario() {
			return nombrePropietario;
		}
	//establecer superficie planta 1
		void establecerSuperficie(int superficiePanta1) {
			 this.superficiePlanta1 = superficiePanta1;
		}
		//envio o retornar superficie planta 1		
		int devolverSuperficiePlanta1() {
			return superficiePlanta1;
		}
		// devolver numero de viviendas
		//utilizando un metodo static
		static int devolverNumeroViviendas() {
			return numeroViviendas;
		}
		//metodo para devolver la operacion de superficie total
		int devolverSuperficieTotal() {
	        int superficieTotal;
	        superficieTotal = superficiePlanta1 + superficiePlanta2;
	        return superficieTotal;
		}
}
