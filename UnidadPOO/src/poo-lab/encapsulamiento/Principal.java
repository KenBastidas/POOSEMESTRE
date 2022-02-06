package encapsulamiento;

public class Principal {

	public static void main(String[] args) {
		Persona p=new Persona();
		p.setApellidos("Ken bastidas");
		p.setnombres("Ken bastidas");	
		p.setEdad(18);
		System.out.println("apellidos: "+ p.getapellidos());
		System.out.println("nombres: "+ p.getnombres());
		System.out.println("edad: "+ p.getEdad());
	}

}
