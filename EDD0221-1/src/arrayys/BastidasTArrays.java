package arrayys;

public class BastidasTArrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1, 5, 10 ,15, 20, 21
		//1.Birthday problem. Modify Birthday.java so that it compute the 
		//probability that two people have a birthday within a day of each other
		System.out.println("Ejercicio 1");
		int days = Integer.parseInt("365");     // number of days
        int people = 2;                           // total number of people
        //  hasBirthday[d] = true if someone born on day d; false otherwise
        //  auto-initialized to false
        boolean[] hasBirthday = new boolean[days];
        while (true) {
            people++;
            int d = (int) (days * Math.random());    // integer between 0 and days-1
            if (hasBirthday[d]) break;               // two people with the same birthday, so break out of loop
            hasBirthday[d] = true;                   // update array
        }
        System.out.println(people);
		/*5.Finding your beer. A large number of college students are attending a party. 
		Each guest is drinking a can of beer (or soda of they are under 21). 
		An emergency causes the lights to go out and the fire alarm to go off.
		The guests calmly put down their beer and exit the building. 
		When the alarm goes off, they re-enter and try to retrieve their beer. 
		However, the lights are still off, so each student randomly grabs a 
		bottle of beer. What are the chances that at least one student gets 
		his or her original beer? Write a program MyBeer.java that takes a
		command-line argument n and runs 1,000 simulations this event, 
		assuming their are n guests. Print the fraction of times that at least
		one guest gets their original beer. As n gets large, does this fraction
		approach 0 or 1 or something in between?
		*/
        System.out.println("Ejercicio 5");
		/*10.Connect Four. Given an N-by-N grid with each cell either
		occupied by an 'X',		an 'O', or empty, write a program to find the
		longest sequence of consecutive 'X's either horizontal, vertically,
		or diagonally. To test your program, you can create a random grid where 
		each cell contains an 'X' or 'O' with probability 1/3.
		*/
		System.out.println("Ejercicio 10");
        int N=Integer.parseInt("20"),t=0;
        String[][] a=new String[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
            double r=Math.random();
            if(r<0.33){a[i][j]="X";t=1;}
            else if(r<0.66)a[i][j]="O";
            else a[i][j]=".";
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
        }
        for(int i=0;i<N;i++){
           for(int j=0;j<N;j++){
           if(a[i][j]=="X"){//to check horizontally
           for(int y=j,length=1;y<N-1;y++){                        
           if(a[i][y]!=a[i][y+1])break;
           length++;
           if(t<length) t=length;}//to check vertically
           for(int x=i,length=1;x<N-1;x++)
           {if(a[x][j]!=a[x+1][j])
           break;
           length++;
           if(t<length) t=length;}//to check diagonally ,right and down
           for(int x=i,y=j,length=1;x<N-1&&y<N-1;x++,y++)
           { if(a[x][y]!=a[x+1][y+1])
           break;
           length++;
           if(t<length) t=length; }
               }
           }
        }
        for(int i=N-1;i>=0;i--){
        for(int j=0;j<N-1;j++){
        if(a[i][j]=="X"){//to check diagonally ,right and up
        for(int x=i,y=j,length=1;x>0&&y<N-1;x--,y++)
        {if(a[x][y]!=a[x-1][y+1])
        break;
        length++;
        if(t<length) t=length;
          }
         }
        }
       }
       System.out.println("the length of longest sequence of X in the above array: "+t);
       /*15.Banner. Write a program Banner.java that takes a string as a 
	    command line argument and prints the string in large letters as below.
		 #    #  ######  #    #     #    #    #
		 #   #   #       #    #     #    ##   #
		 ####    #####   #    #     #    # #  #
		 #  #    #       #    #     #    #  # #
		 #   #   #        #  #      #    #   ##
		 #    #  ######    ##       #    #    #
		*/
       System.out.println("Ejercicio 15");
		for(int fila=1;fila<=6;fila++)
		{
			for(int col=1;col<=33;col++)
			{
				//letra k
				if(fila==1&&col>=2&&col<=5)
				System.out.print("  ");
				else
				if(fila==2&&col>=2&&col<=3)
				System.out.print("   ");
				else
				if(fila==3&&col>=3&&col<=3)
				System.out.print("");
				else
				if(fila==4&&col>=2&&col<=3)
				System.out.print("  ");
				else
				if(fila==5&&col>=2&&col<=3)
				System.out.print("   ");
				else
				if(fila==6&&col>=2&&col<=3)
				System.out.print("    ");
				//spaces
				else
				if(fila==1&&col>=7&&col<=7)
				System.out.print("  ");
				else
				if(fila==2&&col>=5&&col<=6)
				System.out.print("  ");
				else
				if(fila==3&&col>=6&&col<=7)
				System.out.print("   ");
				else
				if(fila==4&&col>=5&&col<=6)
				System.out.print("   ");
				else
				if(fila==5&&col>=5&&col<=6)
				System.out.print("  ");
				else
				if(fila==6&&col>=5&&col<=6)
				System.out.print(" ");
				//letra e large
				else
				if(fila==1&&col>=14&&col<=15)
				System.out.print(" ");
				else
				if(fila==3&&col>=14&&col<=15)
				System.out.print(" ");
				else
				if(fila==6&&col>=13&&col<=14)
				System.out.print("   ");
				else
				//letra e short
				if(fila==2&&col>=8&&col<=13)
				System.out.print("  ");
				else
				if(fila==4&&col>=8&&col<=13)
				System.out.print("  ");
				else
				if(fila==5&&col>=8&&col<=14)
				System.out.print("  ");
				else
				//letra v
				if(fila==1&&col>=17&&col<=20)
				System.out.print("  ");
				else
				if(fila==2&&col>=15&&col<=18)
				System.out.print("  ");
				else
				if(fila==3&&col>=17&&col<=20)
				System.out.print("  ");
				else
				if(fila==4&&col>=15&&col<=18)
				System.out.print("  ");
				else
				//recortado
				if(fila==5&&col>=16&&col<=17)
				System.out.print("  ");
				else
				//spaces
				if(fila==1&&col>=22&&col<=23)
				System.out.print(" ");
				else
				if(fila==2&&col>=20&&col<=21)
				System.out.print(" ");
				else
				if(fila==3&&col>=22&&col<=23)
				System.out.print(" ");
				else
				if(fila==4&&col>=20&&col<=21)
				System.out.print(" ");
				else
				if(fila==5&&col>=19&&col<=20)
				System.out.print("  ");
				else
				if(fila==6&&col>=17&&col<=19)
				System.out.print("  ");
				else
				//letra i
				if(fila==1&&col==25&&col<=25)
				System.out.print("  ");
				else
				if(fila==2&&col>=23&&col<=23)
				System.out.print("  ");
				else
				if(fila==3&&col>=25&&col<=25)
				System.out.print("  ");
				else
				if(fila==4&&col>=23&&col<=23)
				System.out.print("  ");
				else
				if(fila==5&&col>=22&&col<=22)
				System.out.print("  ");
				else
				if(fila==6&&col>=21&&col<=21)
				System.out.print("  ");
				else
				//letra n
				if(fila==1&&col>=27&&col<=32)
				System.out.print(" ");
				else
				if(fila==2&&col>=25&&col<=26)
				System.out.print("");
				else
				if(fila==2&&col>=28&&col<=31)
				System.out.print(" ");
				else
				if(fila==3&&col>=27&&col<=27)
				System.out.print(" ");
				else
				if(fila==3&&col>=29&&col<=31)
				System.out.print(" ");
				else
				if(fila==4&&col>=25&&col<=26)
				System.out.print(" ");
				else
				if(fila==4&&col>=28&&col<=29)
				System.out.print(" ");
				else
				if(fila==5&&col>=24&&col<=27)
				System.out.print(" ");
				else
				if(fila==6&&col>=23&&col<=28)
				System.out.print(" ");
				else
				//fin
				if(fila==2&&col>=33&&col<=33)
				System.out.print(" ");
				else
				if(fila==3&&col>=33&&col<=33)
				System.out.print(" ");
				else
				if(fila==4&&col>=31&&col<=36)
				System.out.print(" ");
				else
				if(fila==5&&col>=30&&col<=33)
				System.out.print(" ");
				else
				if(fila==6&&col>=30&&col<=33)
				System.out.print(" ");
				else
				{
					System.out.print(" X");
				}
			}
			System.out.print("\n");
		}
		/*20.US postal barcodes The POSTNET barcode is used by the US Postal System 
		to route mail. Each decimal digit in the zip code is encoded using a 
		sequence of 5 short and long lines for use by scanners as follows:
		A sixth checksum digit is appended: it is computed by summing 
		up the original five digits mod 10. In addition, a long line is added 
		to the beginning and appended to the end. Write a program
		ZipBarCoder.java that reads in a five digit zip code as the 
		command line parameter and prints the corresponding postal barcode
		 Print the code vertically instead of horizontally, e.g, 
		 the following encodes 08540 (with the check digit of 7).
		
		*****
		*****
		*****
		**
		**
		**
		*****
		**
		**
		*****
		**
		**
		*****
		**
		*****
		**
		**
		*****
		**
		**
		*****
		*****
		*****
		**
		**
		**
		*****
		**
		**
		**
		*****
		*****
       */
	   System.out.println("Ejercicio 20");
       int n = Integer.parseInt("5");
       int[] digits = new int[6];
       int[][] code = { { 1, 1, 0, 0, 0 },
                        { 0, 0, 0, 1, 1 },
                        { 0, 0, 1, 0, 1 },
                        { 0, 0, 1, 1, 0 },
                        { 0, 1, 0, 0, 1 },
                        { 0, 1, 0, 1, 0 },
                        { 0, 1, 1, 0, 0 },
                        { 1, 0, 0, 0, 1 },
                        { 1, 0, 0, 1, 0 },
                        { 1, 0, 1, 0, 0 } };
       // extract digits
       for (int i = 1; i <= 5; i++) {
           digits[i] = n % 10;
           n /= 10;
       }
       // compute check digit
       int checkdigit = 0;
       for (int i = 1; i <= 5; i++)
           checkdigit += digits[i];
       digits[0] = checkdigit % 10;
       // print barcode
     System.out.println("*****");
       for (int i = 5; i >= 0; i--)
           for (int j = 0; j < 5; j++)
               if (code[digits[i]][j] == 1) System.out.println("*****");
               else                         System.out.println("**");
       System.out.println("*****");
		//21.US postal barcodes. Repeat the previous exercise, but plot the output 
		//using Turtle graphics.
		System.out.println("Ejercicio 21");
		
	}

}
