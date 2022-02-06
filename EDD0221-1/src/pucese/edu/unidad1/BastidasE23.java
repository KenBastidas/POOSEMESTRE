package pucese.edu.unidad1;

public class BastidasE23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  Write a program SpringSeason.java
		  that takes two int values m and d from the command line and prints
		  true if day d of month m is between March 20 (m = 3, d =20)
		  and June 20 (m = 6, d = 20), false otherwise.
		*/
		int month = 7;
        int day   = 9;
        boolean isSpring =  (month == 3 && day >= 20 && day <= 31)
                         || (month == 4 && day >=  1 && day <= 30)
                         || (month == 5 && day >=  1 && day <= 31)
                         || (month == 6 && day >=  1 && day <= 20);

        System.out.println(isSpring);
		 

	}

}
