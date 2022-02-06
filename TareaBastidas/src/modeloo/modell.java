package modeloo;

public class modell {
	public double numeroone, numerotwo, result;

	public double getNumeroone() {
		return numeroone;
	}

	public void setNumeroone(double numeroone) {
		this.numeroone = numeroone;
	}

	public double getNumerotwo() {
		return numerotwo;
	}

	public void setNumerotwo(double numerotwo) {
		this.numerotwo = numerotwo;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	public double suma() {
		this.result=this.numeroone+this.numerotwo;
		return this.result;
	}
	public double less() {
		this.result=this.numeroone-this.numerotwo;
		return this.result;
	}
	public double multi() {
		this.result=this.numeroone*this.numerotwo;
		return this.result;
	}
	public double divi() {
		this.result=this.numeroone/this.numerotwo;
		return this.result;
	}

}
