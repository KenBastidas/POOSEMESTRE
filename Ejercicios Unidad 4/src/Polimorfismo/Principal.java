package Polimorfismo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo misvehiculos[]= new Vehiculo[4];
		misvehiculos[0]= new Vehiculo("gdfh7","ferari","a34");
		misvehiculos[1]= new Vehiculoturismo("fddg5","audi","a34",6);
		misvehiculos[2]= new Vehiculodeportivo("dfsaf4","toyota","el24",1116);
		misvehiculos[3]= new VehiculoFurgoneta("qwe44","toyota","xwa2",6799);
		for(Vehiculo v:misvehiculos)
			System.out.println("v.toString");
		System.out.println("");
		
	}

}
