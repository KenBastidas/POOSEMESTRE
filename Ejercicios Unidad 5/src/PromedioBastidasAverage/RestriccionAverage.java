package PromedioBastidasAverage;

public class RestriccionAverage {
	String nota1,nota2,nota3;
	
	public RestriccionAverage(String nota1, String nota2, String nota3) {
		super();
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;

	}
	public boolean validarnota1(String nota) {
	    return nota.matches("[0-9]+.[0-9]+");
	    
	}
	/*public boolean validarnota2(String nota2) {
	    
	    return nota2.matches("[0-9]*.[0-9]*");
	  
	}*/
	/*public boolean validarnota3(String nota3) {
	    return nota3.matches("[0-9]*.[0-9]*");
	}*/


}
