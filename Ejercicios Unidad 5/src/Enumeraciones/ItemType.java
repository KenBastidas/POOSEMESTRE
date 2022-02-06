package Enumeraciones;

public enum ItemType {
	Primero("1er.nivel"), Segundo("2er.nivel"), Tercero("3er.nivel"), Cuarto("4er.nivel");
	private String imp_nivel;
	private ItemType(String s) {
		imp_nivel=s;
	}
	public String ToString() {
		return imp_nivel;
	}
}
