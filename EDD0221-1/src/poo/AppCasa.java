package poo;

public class AppCasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// mensaje con el total de objetos instanciados
		System.out.println("En estos momentos hay instanciadas "+Casa.devolverNumeroViviendas()+" viviendas");
		//declarar objetos
		Casa casa1, casa2;
		Casa casa3;
		//Casa casa4;
		//instanciar el objeto
		casa1 = new Casa();
		System.out.println("En estos momentos hay instanciadas "+Casa.devolverNumeroViviendas()+" viviendas");
		//instanciar otro objeto
		casa2 = new Casa("LUIS GARCIA", 95);
		System.out.println("En estos momentos hay instanciadas "+Casa.devolverNumeroViviendas()+" viviendas");
		//instanciar otro objeto
		casa3 = new Casa("PABLO CALLE", 95, 100);
		System.out.println("En estos momentos hay instanciadas "+Casa.devolverNumeroViviendas()+" viviendas");
		//ASIGNAR VALORES A LOS ATRIBUTOS
		casa1.establecerPropietario("ALICIA MARTIN");
		casa1.establecerSuperficie(60);
		//VISUALIZAR LA INFORMACION DE LOS OBJETOs
		System.out.println("CASA 1 : ");
		System.out.println("propietario : "+ casa1.devolverPropietario());
		System.out.println("superficiePlanta1 : " + casa1.devolverSuperficiePlanta1());
		System.out.println("CASA 2 : ");
		System.out.println("propietario : "+casa2.devolverPropietario());
		System.out.println("superficie planta 1: "+casa2.devolverSuperficiePlanta1()); 
		System.out.println("CASA 3 : ");
		System.out.println("propietario : "+casa3.devolverPropietario());
		System.out.println("superficie total : "+casa3.devolverSuperficieTotal()); 
	}

}
