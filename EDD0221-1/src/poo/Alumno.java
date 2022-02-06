package poo;

public class Alumno extends GPersona{
	protected String curso;
	//protected String materia;
	//protected double nota1, nota2, nota3,promedio;
	public Alumno(String cedula, String nombre, String fechaNacimiento, String curso)
	{
		
			super(cedula, nombre, fechaNacimiento);
			this.curso= curso;
			/*
			this.materia= materia;
			this.nota1=nota1 ;
			this.nota2=nota2 ;
			this.nota3=nota3 ;
			this.promedio=promedio;
			*/
	}
	public String identification() {
		return super.identification() + ", Curso: " +this.curso;
	}
}