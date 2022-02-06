package listas;

public class Estudiante {
		// TODO Auto-generated method stub
		public String nombre;
		public int edad;
		public String cedula;
		//constructor
		public void añadir(String nombre, int edad, String cedula)	{
			this.nombre=nombre;
			this.edad=edad;
			this.cedula=cedula;
		}
		public Estudiante(String n, int c, String s){
			nombre = n;
			edad = c;
			cedula = s;
		}
		//mostrar los datos
		public String mostrar() {
			return "Nombre: "+this.nombre+ " Edad: "+this.edad+ " Cedula: "+this.cedula;
		}
}
