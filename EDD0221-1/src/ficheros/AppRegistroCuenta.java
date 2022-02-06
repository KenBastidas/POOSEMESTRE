package ficheros;

public class AppRegistroCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegistrarCuentaMetodos archivo = new RegistrarCuentaMetodos();
		archivo.abrirArchivo();
		archivo.agregarArchivo();
		archivo.cerrarArchivo();
	}

}
