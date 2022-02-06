package pilasyColas;

public class Metodos extends Pais{
	public Metodos(String nombre, String capital, int habitantes) {
		super(nombre,capital,habitantes);
		this.nombre=nombre;
		this.capital=capital;
		this.habitantes=habitantes;
	}
	public void añadir(String nombre, String capital, int habitantes)	{
		this.nombre=nombre;
		this.capital=capital;
		this.habitantes=habitantes;
	}
	//mostrar los datoss
	public String mostrar() {
		return "Nombre: "+this.nombre+ " capital: "+this.capital+ " habitantes: "+this.habitantes;
	}
	public String eliminar(){
		this.nombre="";
		this.capital="";
		this.habitantes=0;
		return "Pais eliminado";
	}
}