package Lambda;

public class scopes {
	private double  n3=3;//variable greploal
/*public double probarVaribleLocal() {
	
	/*Operacion op= new Operacion() {
		@Override
		public double Calcular(double n1, double n2) {
			// TODO Auto-generated method stub
			//double n3;
			
			return n1+n2+n3;
		}
	};*/
	Operacio op= (n1,n2)->{
		n3=n1+n2;
		return n1+n2+n3;
	};
	//return op.Calcular(2, 8);
}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scopes app = new scopes();
		System.out.println(app.probarVaribleLocal());
	}

}
