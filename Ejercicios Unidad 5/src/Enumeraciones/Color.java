package Enumeraciones;

public  enum Color{
	ROJO, VERDE, AZUL, AMARILLO, CAFE, BLANCO, NEGRO;
	private Color() {
			System.out.println("contructo llamdao para:"+this.toString());
	}
	public void colorInfo() {
		System.out.println("color unviersal");
	}
}
