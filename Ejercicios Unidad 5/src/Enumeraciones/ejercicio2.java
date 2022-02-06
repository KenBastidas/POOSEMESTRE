package Enumeraciones;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		transporte tp;
		tp=transporte.AVION;
		System.out.println("Valor de tp:"+tp);
		tp=transporte.TREN;
		//compare 2 values with enum
		if(tp==transporte.TREN) {
			System.out.println("tp tiene el valor de tren");
		}else {
			System.out.println("tp no tiene el valor de tren");
		}
		//enum for controlar sentencia swtich
		switch(tp) {
		case COCHE:System.out.println("UN AUTO LLEVA CINCO PERSONAS");break;
		case CAMION: System.out.println("UN CAMION LLEVA CARGA");break;
		case AVION:System.out.println("UN CAVION VUELA");break;
		case TREN:System.out.println("UN TREN VIAJA POR RIELES");break;
		case BARCO:System.out.println("UN CBARCO NAVEGA POR LOS MARES");break;
		//case MOTO:System.out.println("UNA MTOO LLEVA DOS PERSONAS");break;
		//case BICILCETA:System.out.println("UNA RUEDA");break;
		}
	}

}
