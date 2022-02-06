package bastidasExamenfinal;
public class BastidasBrianEF1 {
	public static void main(String[] args) {
		System.out.println("Figura-1");
		numeraya();
		numeraya2();
		numeraya3();
		System.out.println("\nFigura-2");
		x();
		System.out.println("\nFigura-3");
		guinum();
		System.out.println("\nFigura_cow1-4");
		VACA1();
		System.out.println("\nFigura_cow1-5");
		vaca2();
		System.out.println("\nFigura_cow1-6");
		VACA3();
    }	
	public static void x(){
		int n=9;
	    int cola=n;
	    int punta=0;
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	          if(j==cola-1||j==punta) 
	          {System.out.print('*');}
	          else
	          {System.out.print(' ');}
	        }
	        System.out.println();
	        cola--;
	        punta++;
	      }
	}
	public static void numeraya(){
		for(int fila=1;fila<=7;fila++)
		{
			for(int col=1;col<=20;col++)
			{
				//numero2-
				if(fila==1&&col>=1&&col<=8)
				System.out.print(" ");
				else
				if(fila==1&&col>=9&&col<=9)
				System.out.print("2");
				else
				//rayas
				if(fila==2&&col>=1&col<=7)
				System.out.print(" ");
				else
				if(fila==2&&col>=8&col<=8)
				System.out.print("/");
				else
				if(fila==2&&col>=9&col<=9)
				System.out.print(" ");
				else
				if(fila==2&&col>=10&col<=10)
				System.out.print("\\");
				else
				if(fila==3&&col>=1&&col<=6)
				System.out.print(" ");
				else
				if(fila==3&&col>=7&&col<=7)
				System.out.print("/");
				else
				if(fila==3&&col>=8&&col<=8)
				System.out.print("  ");
				else
				if(fila==3&&col>=10&&col<=10)
				System.out.print("\\");
				else
				if(fila==4&&col>=1&&col<=5)
				System.out.print(" ");
				else
				if(fila==4&&col>=6&&col<=6)
				System.out.print("/");
				else
				if(fila==4&&col>=6&&col<=11)
				System.out.print(" ");
				else
				if(fila==4&&col>=12&&col<=12)
				System.out.print("\\");
				else
				//numero
				if(fila==5&&col>=1&&col<=4)
				System.out.print(" ");
				else
				if(fila==5&&col>=5&&col<=5)
				System.out.print("1");
				else
				if(fila==5&&col>=5&&col<=12)
				System.out.print(" ");
				else
				if(fila==5&&col>=13&&col<=13)
				System.out.print("3");
				else
				//doble rayas
				if(fila==6&&col>=1&&col<=3||col>=5&&col<=5||col>=13&&col<=13)
				System.out.print(" ");
				else
				if(fila==6&&col>=4&&col<=4!=col>=12&&col<=12)
				System.out.print("/");
				else
				if(fila==6&&col>=6&&col<=6!=col>=14&&col<=14)
				System.out.print("\\");
				else
				if(fila==6&&col>=6&&col<=11)
				System.out.print(" ");
				else
				//doble numnero		
			if(fila==7&&col>=1&&col<=2||col>=4&&col<=6||col>=8&&col<=10||col>=12&&col<=14)
			System.out.print(" ");
			else
				if(fila==7&&col>=3&&col<=3)
				System.out.print("0");
				else
				if(fila==7&&col>=7&&col<=7)
				System.out.print("7");
				else
				if(fila==7&&col>=11&&col<=11)
				System.out.print("9");
				else
				if(fila==7&&col>=15&&col<=15)
				System.out.print("1");
			}
			System.out.print("\n");
		}
	}
	public static void numeraya2() {
		for(int fila=8;fila<=8;fila++)
		{
			for(int col=1;col<=30;col++)
			{				
				//RAYAS
if(fila==8&&col>=1&&col<=1||col>=3&&col<=5||col>=7&&col<=7||col>=9&&col<=13||col>=15&&col<=15)
			
				System.out.print(" ");
				else
				if(fila==8&&col>=2&&col<=2||col>=6&&col<=6||col>=14&&col<=14)
				System.out.print("/");
				else
					if(fila==8&&col>=8&&col<=8||col>=16&&col<=16)
						System.out.print("\\");
			}
			System.out.print("\n");
		}
	}
	public static void numeraya3() {
		for(int fila=9;fila<=12;fila++)
		{
			for(int col=1;col<=30;col++)
			{	
				//numeross
				if(fila==9&&col>=1&&col<=1)
				System.out.print("2");
				else
		if(fila==9&&col>=2&&col<=4||col>=7&&col<=9||col>=11&&col<=13!=col>=15&&col<=17)
				System.out.print(" ");
				else
				if(fila==9&&col>=6&&col<=6)
				System.out.print("1");
				else
				if(fila==9&&col>=10&&col<=10)
				System.out.print("0");
				else
				if(fila==9&&col>=14&&col<=14!=col>=18&&col<=18)
				System.out.print("8");
				else
				//raya sola		
				if(fila==10&&col>=1&&col<=4)
				System.out.print(" ");
				else
				if(fila==10&&col>=8&&col<=11)
				System.out.print("/");
				else
				if(fila==11&&col>=1&&col<=3)
				System.out.print(" ");
				else
				if(fila==11&&col>=8&&col<=10)
				System.out.print("7");
			}
			System.out.print("\n");
		}
	}
	public static void guinum() {
		for(int i = 1; i<32; i++){
	    	  if( i == 17){
	    		  System.out.print("  /");
	    		  System.out.print("----- ");
	    		  System.out.println(20);
	    	  }else{
	    		  System.out.print(" ");
	    	  }
		}
		System.out.print("    |");
		for(int i = 1; i<16; i++){
	    	  if( i == 7) {
	    		  System.out.print(" \\");
	    		  System.out.print("----- ");
	    		  System.out.println(15);
	    	  }else{
	    		  System.out.print(" ");
	    	  }
		}
		for(int i = 1; i<10; i++){
	         if( i == 2) {
	        	  System.out.print(" /");
	    		  System.out.print("----- ");
	    		  System.out.println(14);
	    	  }else{
	    		  System.out.print(" ");
	    	  }
		  }
		System.out.print("   |");
		System.out.print("       \\");
		  System.out.print("----- ");
		  System.out.println(13);
		//cabeza
		  System.out.print(" /");
		  for(int i = 1; i<8; i++){
	    	  if( i == 7) {
	    		  System.out.println(" " +12);
	    	  }else{
	    	  System.out.print("-");
	    	  }
		  }
		  //cuerpo
		  for(int i = 1; i<8; i++){
			  if( i == 4){
				  System.out.print(8 + " ");
			  }else
				  System.out.print(" |");
			  if(i == 1){
				  System.out.print("        |");
		  		  System.out.print("       /");
		  		  System.out.print("----- ");
		  		  System.out.print(11);
		  	  }
		  	  if(i == 2){
		  		  System.out.print("        \\");
		  		  System.out.print("----- ");
		  		  System.out.print(10);
		  	  }
		  	  if(i == 3) {
		  		  System.out.print("                \\");
		  		  System.out.print("----- ");
		  		  System.out.print(9);
		  	  }
		  	  if(i == 5) {
		  		  System.out.print("                /");
		  		  System.out.print("----- ");
		  		  System.out.print(7);
		  	  }
		  	  if(i == 6) {
		  		  System.out.print("        /");
		  		  System.out.print("----- ");
		  		  System.out.print(6);
		  	  }
		  	  if(i == 7 ) {
		  		  System.out.print("        |");
		  		  System.out.print("       \\");
		  		  System.out.print("----- ");
		  		  System.out.print(5);
		  	  }
		  	  System.out.println();
		   }
		    System.out.print(" \\");
			  for(int i = 1; i<8; i++) {
				  if( i == 7) {
					  System.out.println(" "+4);
				  }else 
					  System.out.print("-");
			  	  }
			  	System.out.print("          |");
			for(int i = 1; i<8; i++) {
			  if( i == 7) {
				  System.out.print(" /");
				  System.out.print("----- ");
				  System.out.println(3);
			  }else {
				  System.out.print(" ");
			  }
			  }
			  for(int i = 1; i<10; i++) {
		  	  if( i == 8) {
		  		  System.out.print("   \\");
		  		  System.out.print("----- ");
		  		  System.out.println(2);
		  	  }else {
		  		  System.out.print(" ");
		  	  }
			  }
			 for(int i = 1; i<24; i++) {
		  	  if( i == 15) {
		  		  System.out.print("   \\");
		  		  System.out.print("----- ");
		  		  System.out.println(1);
		  	  }else {
		  		  System.out.print(" ");
		  	   }
			 }
	}
	public static void VACA1() {
		for(int i = 1; i<=17; i++) {
			System.out.print(" ");
		}
		System.out.print("(__)");
		 System.out.println();
		 for(int i = 1; i<=17; i++) {
				System.out.print(" ");
			}
			System.out.print("(uu)");
		 System.out.println();
		for(int i = 1; i<=10; i++) {
			System.out.print(" ");
		}
		System.out.print("/");
		  for(int i = 1; i<8; i++) {
	    	  System.out.print("-");   	 
		  }
		  System.out.print("\\/");
		  System.out.println();
		  //cuerpo
		  for(int i = 1; i<=8; i++) {
				System.out.print(" ");
			}
			System.out.print("/ ");
		  for(int i = 1; i<2; i++) {
	    	  System.out.print("|");
		  } 
		  for(int i = 1; i<=5; i++) {
				System.out.print(" ");
			}
		  System.out.print("||");
		  System.out.println();
		  for(int i = 1; i<=7; i++) {
				System.out.print(" ");
			}
			System.out.print("* ");
		  for(int i = 1; i<2; i++) {
	    	  System.out.print(" ||");
		  } 
		  System.out.print("----");
		  for(int i = 1; i<2; i++) {
	    	  System.out.print("||");	 
		  } 
		  System.out.println();
		//base
		for(int i = 1; i<=10; i++) {
			System.out.print(" ");
		}
		System.out.print("~~");
		for(int i = 1; i<=4; i++) {
			System.out.print(" ");
		}
		System.out.print("~~");
	}
	public static void vaca2() {
		for(int i = 1; i<=17; i++) {
			System.out.print(" ");
		}
		System.out.print("(__)");
		 System.out.println();
		 for(int i = 1; i<=17; i++) {
				System.out.print(" ");
			}
			System.out.print("(oo)");
		 System.out.println();
		for(int i = 1; i<=10; i++) {
			System.out.print(" ");
		}
		System.out.print("/");
		  for(int i = 1; i<8; i++) {
	    	  System.out.print("-");   	 
		  }
		  System.out.print("\\/");
		  System.out.println();
		  //cuerpo
		  for(int i = 1; i<=9; i++) {
				System.out.print(" ");
			}
			System.out.print("/ ");
		  for(int i = 1; i<2; i++) {
	    	  System.out.print("|");
		  } 
		  for(int i = 1; i<=5; i++) {
				System.out.print(" ");
			}
		  System.out.print("||");
		  System.out.println();
		  for(int i = 1; i<=7; i++) {
				System.out.print(" ");
			}
			System.out.print(" * ");
		  for(int i = 1; i<2; i++) {
	    	  System.out.print(" ||");
		  } 
		  System.out.print("----");
		  for(int i = 1; i<2; i++) {
	    	  System.out.print("||");	 
		  } 
		  System.out.println();
		//base
		for(int i = 1; i<=11; i++) {
			System.out.print(" ");
		}
		System.out.print("^^");
		for(int i = 1; i<=4; i++) {
			System.out.print(" ");
		}
		System.out.print("^^");			
	}
	public static void VACA3() {
		for(int w = 1; w<=16; w++) {
			System.out.print(" ");
		}
		System.out.print("(__)");
		System.out.println();
		for(int w = 1; w<=16; w++){
			System.out.print(" ");
		}
		System.out.print("(oo)");
		System.out.println();
		for(int w = 1; w<=8; w++){
			System.out.print(" ");
		}
		System.out.print("/");
		for(int f = 1; f<=8; f++){
	      System.out.print("-");   	 
		}
		System.out.print("\\/");
		System.out.println();
		for(int f = 1; f<=7; f++){
			System.out.print(" ");
		}
		System.out.print("* o");
		for(int k = 1; k<2; k++){
			System.out.print("|");
		} 
		for(int k = 1; k<=5; k++){
			System.out.print(" ");
		}
		System.out.print("||");
		System.out.println();
		for(int b = 1; b<=9; b++){
			System.out.print(" ");
		}
		for(int b = 1; b<2; b++){
			System.out.print(" ||");
		} 
		System.out.print("----");
		for(int g = 1; g<2; g++){
			System.out.print("||");	 
		} 
		System.out.println();
		for(int g = 1; g<=7; g++) {
			System.out.print(" ");
		}
		System.out.print("ooo^^");
		for(int g = 1; g<=4; g++) {
			System.out.print(" ");
		}
		System.out.print("^^");
	}

}