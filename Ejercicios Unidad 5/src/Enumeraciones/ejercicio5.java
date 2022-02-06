package Enumeraciones;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		transporte tp,tp2,tp3;
		//show all velocity
		for(transporte t:transporte.values()) {
			System.out.println(t+" "+t.ordinal());
		}
		tp=transporte.AVION;
		tp2=transporte.TREN;
		tp3=transporte.AVION;
		if(tp.compareTo(tp2)<0) {
			System.out.println(tp+"llega antes que "+tp2);
		}
		else if(tp.compareTo(tp2)>0) {
			System.out.println(tp2+"llega antes que "+tp);
		}
		if(tp.compareTo(tp3)==0) {
			System.out.println(tp+"es igual a "+tp3);
		}
				
	}

}