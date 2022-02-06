package tarea2;
import java.util.Objects;
public class ttt2 {
	//método equals y hashCode
	class Producto {
	    private String codigo, nombre;
	    private float precio;
	    public Producto() {
	    }
	    public Producto(String codigo, String nombre, float precio) {
	        this.codigo = codigo;
	        this.nombre = nombre;
	        this.precio = precio;
	    }
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Producto producto = (Producto) o;
	        return Float.compare(producto.precio, precio) == 0 &&
	                codigo.equals(producto.codigo)
	                && nombre.equals(producto.nombre);
	    }
	    @Override
	    public int hashCode() {
	        return Objects.hash(codigo, nombre, precio);
	    }
	}
}