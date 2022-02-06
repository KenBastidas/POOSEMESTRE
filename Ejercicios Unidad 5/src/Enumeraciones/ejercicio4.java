package Enumeraciones;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transporte1 tp;
		tp=Transporte1.AVION;
		System.out.println("la velociodad de una avion es:"+tp.getvelocidad()+"km/h");
		//show all velocity
		for(Transporte1 t:Transporte1.values()) {
			System.out.println(t+" la velociodad es:"+t.getvelocidad()+"km/h");
		}
	}

}
