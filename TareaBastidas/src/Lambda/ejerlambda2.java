package Lambda;

public class ejerlambda2 {
	public double calcular() {
		//sinlambda
		/*Operacion op= new Operacion() {

			@Override
			public double CalcularPromedio(double n1, double n2) {
				// TODO Auto-generated method stub
				return (n1+n2)/2;
			}
		};*/
		//conlambda
		Opera op =(double n1, double n2, double n3)->(n1+n2+n3)/3;
		return op.CalcularPromedioNotas(15, 20,15);
		//System.out.println("Promedio: "+op.CalcularPromedio(14, 20));
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejerlambda2 app2= new ejerlambda2();
		System.out.println("promedio:"+app2.calcular());
	}

}
