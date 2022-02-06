package Figuras;

public class BastidasFComple {
	public static final int Max_Value1 =3;
	public static final int Max_Valuef1 =4;
	public static final int Max_Value2 =2;
	public static final int Max_Valuef2 =8;
	public static final int Max_Value3 =4;
	public static final int Max_Valuef3 =10;
	public static final int Max_Value4 =2;
	public static final int Max_Valuef4 =6;
	public static final int Max_Value6 =7;
	public static final int Max_Value8 =7;
	public static final int Max_Value9 =5;
	public static final int Max_Value10 =8;
	public static final int Max_Value12 =8;
	public static final int Max_Value13 =8;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Figura-1");
		figuraSuperior();
		figura();
		figuraMitad();
		figurarepeat();
		figurainferior();
		System.out.println("\nFigura-2");
		figuraSuperior2();
		figura2();
		figura2r(); 
		figurainferior2();
		System.out.println("\nFigura-3");
		figuraSuperior3();
		figura3();
		figura3r(); 
		figurainferior3();
		System.out.println("\nFigura-4");
		figuraSuperior4();
		figura4();
		figura4r(); 
		figurainferior4();
		System.out.println("\nFigura-5");
		//figura5();
		System.out.println("\nFigura-6");
		figura6();
		System.out.println("\nFigura-7");
		figura7();
		System.out.println("\nFigura-8");
		figura8();
		System.out.println("\nFigura-9");
		figura9();
		System.out.println("\nFigura-10");
		figura10();
		System.out.println("\nFigura-11");
		figura11();
		System.out.println("\nFigura-12");
		figura12();
		System.out.println("\nFigura-13");
		figura13f();	
	}
	//1
	public static void figuraSuperior() 
	{
		for(int i= 1;i<=Max_Valuef1;i++) 
		{
			System.out.print("=");
		}
		System.out.print("+");
		for(int i= 1;i<=Max_Valuef1;i++) 
		{
			System.out.print("=");
		}
		System.out.println();
	}
	public static void figura()
	{
		for (int line= 1; line <=Max_Value1 ; line++) 
		{
			System.out.print("#");	
		for (int space = 1; space <=3;space++) 
		{
			System.out.print(" ");
		}	
		System.out.print("|");
		for(int dot = 1; dot <=3;dot ++) 
		{
			System.out.print(" ");
		}	
		System.out.print("");
		for(int space = 1;space <= (line *-2 +4);space++)
		{
				System.out.print("");
		}
		System.out.println("#");
		}
	}
	public static void figuraMitad() 
	{
		for(int i= 1;i<=Max_Valuef1;i++) 
		{
			System.out.print("=");
		}
		System.out.print("+");
		for(int i= 1;i<=Max_Valuef1;i++) 
		{
			System.out.print("=");
		}
		System.out.println();
	}
	public static void figurarepeat() 
	{
		for (int line= 1; line <=Max_Value1 ; line++) 
		{
			System.out.print("#");	
		for (int space = 1; space <=3;space++) 
		{
			System.out.print(" ");
		}	
		System.out.print("|");
		for(int dot = 1; dot <=3;dot ++) 
		{
			System.out.print(" ");
		}	
		System.out.print("");
		for(int space = 1;space <= (line *-2 +4);space++)
		{
				System.out.print("");
		}
		System.out.println("#");
			}
	}
	public static void figurainferior() 
	{
		for(int i= 1;i<=Max_Valuef1;i++) 
		{
			System.out.print("=");
		}
		System.out.print("+");
		for(int i= 1;i<=Max_Valuef1;i++) 
		{
			System.out.print("=");
		}
		System.out.println();
	}
	//2
	public static void figuraSuperior2() 
	{
		for(int i= 1;i<=8;i++) 
		{
			System.out.print("*");
		}
		System.out.println();
	}
	public static void figura2() 
	{
		for (int line= 1; line <=Max_Value2 ; line++) {
			System.out.print("*");	
			for (int space = 1; space <= (line * 2+8);space++) {
				System.out.print("*");
			}	
			System.out.print("");
			for(int dot = 1; dot <=(line *4-7);dot ++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void figura2r() 
	{
		for (int line= 1; line <=(Max_Value2); line++) {
			System.out.print("*");	
			for (int space = 1; space <= (line * 2+14);space++) {
				System.out.print("*");
			}	
			System.out.print("");
			for(int dot = 1; dot <=(line *3-5);dot ++) {
				System.out.print("*");
			}	
			System.out.println("");
		}
	}
	public static void figurainferior2() 
	{
		for(int i= 1;i<=23;i++) 
		{
			System.out.print("*");
		}
		System.out.println();
	}
	//3
	public static void figuraSuperior3() 
	{
		for(int i= 1;i<=2;i++) 
		{
			System.out.print("*");
			for (int space = 1; space <= (i* 2+16);space++) {
				System.out.print(" ");
			}	
		}
		System.out.println();
	}
	public static void figura3() 
	{
		for (int line= 1; line <=Max_Value3 ; line++) {
			System.out.print("*");	
			for (int space = 1; space <= (line *1);space++) {
				System.out.print("*");
			}	
			System.out.print(" 		 ");
			for(int dot = 1; dot <=(line +10);dot ++) {
				System.out.print("");
			}	
			//System.out.print("");
			for(int space = 1;space <= (line *1);space++){
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
	public static void figura3r() 
	{
		for (int line= 1; line <=Max_Value3 ; line++) {
			System.out.print("*");	
			for (int space = 1; space <= (line +3);space++) {
				System.out.print("*");
			}	
			System.out.print("");
			for(int dot = 1; dot <=(line +5);dot ++) {
				System.out.print("");
			}	
			System.out.print("");
			for(int space = 1;space <= (line *1);space++){
				System.out.print("");
			}
			System.out.println("*");
		}
	}
	public static void figurainferior3() 
	{
		for(int i= 1;i<=20;i++) 
		{
			System.out.print("*");
		}
		System.out.println();
	}
	//4
	public static void figuraSuperior4() 
	{
		for(int i= 1;i<=14;i++) 
		{
			System.out.print("!");
		}
		System.out.println();
	}
	public static void figura4() 
	{
		for (int line= 1; line <=1; line++) {
			System.out.print("//");	
		for (int space = 1; space <=10;space++) {
			System.out.print("!");
		}	
			System.out.print("");
			System.out.println("//");
		}
	}
	public static void figura4r() 
	{
		for (int line= 1; line <=1; line++) {
			System.out.print("////");	
		for (int space = 1; space <=6;space++) {
			System.out.print("!");
		}	
			System.out.print("");
			System.out.println("////");
		}
	}
	public static void figurainferior4() 
	{
		for(int i= 1;i<=Max_Valuef4;i++) 
		{
			System.out.print("/");
		}
		System.out.print("!!");
		for(int i= 1;i<=Max_Valuef4;i++) 
		{
			System.out.print("/");
		}
		System.out.println();
	}
	//5
	//6
	public static void figura6(){
		for(int k = 0; k < Max_Value6; k++){
		if(k == 0 || k == 6){
			for(int w= 0; w< Max_Value6; w++){
				System.out.print("*");
	        }
	    	System.out.println();
	        }
	        if(k>= 1 && k<= 5){ 
	        for(int w = 0; w< Max_Value6; w++){
	        	if(w== 0 || w== 6){
	        		System.out.print("*");
	    	    }
	    	    else if(w>= 1 && w<= 5){
	    	    		System.out.print(" ");
	             }
	    	   }
	        System.out.println();
	        }
	    }
	}
	//7
	public static void figura7(){
	    for(int x= 1; x<= 8; x++){
	    	for(int r= 1; r<= x; r++){
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
	}
	//8
	public static void figura8(){
	    int count = Max_Value8-1;
	    for(int n= 1; n<= Max_Value8;n++) 
	    {
	      for(int l = 1; l<= count;l++)
	        System.out.print(" ");
	      count--;
	      for (int l= 1;l<= 2 * n - 1;l++)
	        System.out.print("*");
	      System.out.println();
	    }
	}
	//9
	public static void figura9(){
	    int count = Max_Value9 - 1;
	    for(int z = 1; z <= Max_Value9; z++){
	      for(int t = 1; t <= count; t++)
	        System.out.print(" ");
	      count--;
	      for(int t = 1; t <= 2 * z - 1; t++)
	        System.out.print("*");
	      System.out.println();
	    }
	    count = 1;
	    for(int z = 1; z <= Max_Value9 - 1; z++){
	      for(int t = 1; t <= count; t++)
	        System.out.print(" ");
	      count++;
	      for(int t = 1; t <= 2 * (Max_Value9 - z) - 1; t++)
	        System.out.print("*");
	      System.out.println();
	    }
	  }
	//10
	public static void figura10() {
	    for(int t = 1; t <= Max_Value10; t++){
	      for(int d = 1; d <= Max_Value10 - t; d++){
	        System.out.print(" ");
	      }
	      for(int s = 1; s <= t; s++){
	        System.out.print("*");
	      }
	      System.out.println("");
	    }
	  }
	//11
	public static void figura11(){
	    for(int v = 8; v >= 1; v--){
	      for(int h= 1; h<=v; h++){
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	  }
	//12
	public static void figura12(){
	    for(int c = 0; c < Max_Value12; c++){
	      for(int v = 0; v <= c; v++){
	        System.out.print("*");
	      }
	      if(c != Max_Value12 - 1){
	        System.out.print(" ");
	      }
	      else{
	        System.out.print(" *");
	      }
	      for(int v= 0; v<= c; v++){
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	  }
	//13
	 private static void ate(int count){
		    for (int e = 0; e < count; e++)
		      System.out.print("*");
	}
     private static void space(int count){
		    for (int e= 0; e< count; e++)
		      System.out.print(" ");
	 }
	 public static void figura13f(){
		    for(int a = 0; a < Max_Value13; a++)
		    {
		      ate(a+1);
		      space(Max_Value13-a-1);
		      ate(Max_Value13-a+1);
		      space(2*a);
		      ate(Max_Value13-a);
		      space(Max_Value13-a-1);
		      ate(a+1);
		      System.out.println();
		    }
	 }
}
