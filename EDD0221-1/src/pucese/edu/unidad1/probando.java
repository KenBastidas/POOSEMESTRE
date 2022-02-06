package pucese.edu.unidad1;

import java.util.Scanner;

public class probando {
	  static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner (System.in);
		int edad;
        double estatura=0;
        double media_edad=0;
        double media_altura=0;
        double suma_edad=0;
        double suma_alt=0;
        int cont_edad=0;
        int cont_alt=0;
       
        for(int i=0;i<=4;i++)
        {
            System.out.println("Introduce edad");
            edad=sc.nextInt();
           
            System.out.println("Introduce altura");
            estatura=sc.nextInt();
           
            if(edad>18)
            {
                cont_edad++;
                suma_edad=suma_edad+edad;   
            }
            if(estatura>(1.75))
            {
                cont_alt++;
                suma_alt=suma_alt+estatura;   
            }
           
        }//fin de for
       
        media_edad=suma_edad/cont_edad;
        media_altura=suma_alt/cont_alt;
       
        System.out.println("Edad media: "+media_edad);
        System.out.println("Altura media: "+media_altura);
        System.out.println("Alumnos mayores de 18 años: "+cont_edad);
        System.out.println("Alumnos con altura mas de 1.75:" +cont_alt);

	}

}
