package ExamenPBastidas;

public class ProductPerecederoB extends ProductoB{
	int dias_a_caducar;
	public ProductPerecederoB(String nombre, double precio, int cantidad, int dias_a_caducar) {
		super(nombre, precio, cantidad);
		this.dias_a_caducar=dias_a_caducar;
	}
	public int getDias_a_caducar() {
		return dias_a_caducar;
	}
	@Override
	public String toString() {
		return super.toString()+"ProductPerecederoB [dias_a_caducar=" + dias_a_caducar + "]";
	}
	public double calcular() {
        double resulta= super.precio*super.cantidad;
        double t=0;
       if(dias_a_caducar==1) {
    	   t=resulta-(resulta*0.8);
       }
       else if(dias_a_caducar==2) {
    	   t=resulta-(resulta*0.6);
       }
       else if(dias_a_caducar==2) {
    	   t=resulta-(resulta*0.3);
       }
       else {
    	   t=resulta;
       }
       return t;
   }
}
