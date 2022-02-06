package listas;

public class MOVISTAR {

		private String numero;
		private double abono;
		
		public MOVISTAR (String numero, double abono) {
			this.numero =numero;
			this.abono=abono;
		}
		
		public String mostrar() {
			return "Usted abono a Movistar:|" +this.abono+"$|"+" numero: "+this.numero;
		}
		public String getNumero() {
			return numero;
		}
		public void setNumero(String numero) {
			this.numero = numero;
		}
		public double getAbono() {
			return abono;
		}
		public void setAbono(double abono) {
			this.abono = abono;
		}

	}