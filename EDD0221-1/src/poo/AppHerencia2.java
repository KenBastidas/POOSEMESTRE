package poo;

public class AppHerencia2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//crear dos objetos y 
				//en cada uno vamos a agregar un array de objetos
				//ultimo vamos a mostrar la informacion
				
				//objeto 1
				Ppersona p = new Ppersona("juan", "calle");
				//objeto 2
				Ciudadano c = new Ciudadano("pablo", "suarez", "030142512");
				//objeto 3
				Ciudadano j = new Ciudadano("jaime", "sayago", "2123654");
				//array de objeto de tipo persona
				//crear un array del tipo de clase a generar
				Ppersona [] arrayPersona = new Ppersona[3];
				arrayPersona[0] = p;
				arrayPersona[1] = c;
				arrayPersona[2] = j;
				//pilas, colas, listas 
				//collections hashmap, obj nativos, arraylist
				//arboles y grafos
					lectorArrayPersona(arrayPersona);
	}
	public static void lectorArrayPersona(Ppersona [] array) {
		for (int i =0;i<array.length;i++)
			System.out.println("identificando: " + array[i].identificacion());
		
	}
}
