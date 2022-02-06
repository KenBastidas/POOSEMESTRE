package Operaciones;
/**
 * Esta es la clase de OperacionesMatematicas, donse se encuenytran cuartro metodos que retorn unv alor
 * los metodos son: suma, resta, multiplicaion y divison
 * @author Brian Bastidas
 *
 */
public class OperacionesMatematicas {
	public int suma(int num1,int num2) {
		int sum;
		sum=num1+num2;
		return sum;
	}
	public int resta(int num1,int num2) {
		int res;
		res=num1-num2;
		return res;
	}
	public int multiplicacion(int num1,int num2) {
		int mul;
		mul=num1*num2;
		return mul;
	}
	public int division(int num1,int num2) {
		int div;
		div=num1/num2;
		return div;
	}
}
