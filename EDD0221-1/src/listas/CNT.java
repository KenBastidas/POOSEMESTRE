package listas;

public class CNT {
		private String numero;
		private double abono;
		public CNT (String numero, double abono) {
			this.numero =numero;
			this.abono=abono;
		}
		
		public String mostrar() {
			return "Usted abono a Cnt:|" +this.abono+"$|"+" numero: "+this.numero;
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