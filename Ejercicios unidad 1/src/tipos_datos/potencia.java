package tipos_datos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class potencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int raiz =(int) Math.sqrt(9);
		System.out.println("resyolatdo:" + raiz);
		*/
		/*double base=5, exponente=2;
		double resultado;
		resultado= Math.pow(base, exponente);
		System.out.println("resyolatdo:" + resultado);
		*/
		double base=128;
		double r;
		//double resultado;
		r= Math.pow(base, (double)1/5);
		//reusltado= Math.round(r*1000.0)/1000.0
		BigDecimal resultado= new BigDecimal(r).setScale(2, RoundingMode.HALF_UP); 
		System.out.println("resultado:" + resultado);
	}
}