package eNUMSYjAVADOCBastidas;
/**
 * @author Brian Bastidas
 * Declaramos nuestra lista de electrodomesticos en el enum ListaElec.
 */
public enum ListaElec {
	/**
	 * Se declara el enum refrigeradora
	 */
	refrigeradora("refrigeradora"),
	/**
	 * Se declara el enum televisor
	 */
	televisor("televisor"),
	/**
	 * Se declara el enum aire acondicionado
	 */
	aire_acondicionado("aire acondicionado"),
	/**
	 * Se declara el enum computadora de escritorio
	 */
	computadora_de_escritorio("computadora de escritorio"),
	/**
	 * Se declara el enum computadora portátil
	 */
	computadora_portatil("computadora portátil"),
	/**
	 * Se declara el enum ventilador
	 */
	ventilador("ventilador"),
	/**
	 * Se declara el enum lavadora
	 */
	lavadora("lavadora");
	/**
	 * Se delcara un string imp_elect
	 */
	private String imp_elect;
	/**
	 * 
	 * @param se crea el constructor con vairable string el 
	 */
	private ListaElec(String el) {
		imp_elect=el;
	}
	/**
	 * Se crea el metodo toString
	 * @return
	 */
	public String ToString() {
		return imp_elect;
	}
}