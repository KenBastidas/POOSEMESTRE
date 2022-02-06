package Figuras;

public class FiguraCompleja {
	public static final int Max_Value =4;
	public static final int Max_Valuef =16;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4 for(bucle)
		//metodos estaticos
			figuraSuperior();
			figura();
			figurainverssa();
			figurainferior();
	}
	//figura superior
	public static void figura() {
		for (int line= 1; line <=Max_Value ; line++) {
			System.out.print("|");	
			for (int space = 1; space <= (line * -2+8);space++) {
				System.out.print(" ");
			}	
			System.out.print("<>");
			for(int dot = 1; dot <=(line *4-4);dot ++) {
				System.out.print(".");
			}	
			System.out.print("<>");
			for(int space = 1;space <= (line *-2 +8);space++){
				System.out.print(" ");
			}
			System.out.println("|");
		}
	}
	
	public static void figurainverssa() {
		for (int line= Max_Value; line >=1; line--) {
			System.out.print("|");	
			for (int space = 1; space <= (line * -2+8);space++) {
				System.out.print(" ");
			}	
			System.out.print("<>");
			for(int dot = 1; dot <=(line*4-4);dot ++) {
				System.out.print(".");
			}	
			System.out.print("<>");
			for(int space = 1;space <= (line *-2 +8);space++){
				System.out.print(" ");
			}
			System.out.println("|");
		}
	}
	
	//parte superior
		public static void figuraSuperior() {
			System.out.print("#");
			for(int i= 1;i<=Max_Valuef;i++) {
				System.out.print("=");
			}
			System.out.println("#");
		}
		
		public static void figurainferior() {
			System.out.print("#");
			for(int i= 1;i<=Max_Valuef;i++) {
				System.out.print("=");
			}
			System.out.println("#");
		}
}
