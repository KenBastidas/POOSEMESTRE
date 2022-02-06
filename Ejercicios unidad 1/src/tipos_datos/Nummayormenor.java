package tipos_datos;

import java.util.Scanner;

public class Nummayormenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner xd = new Scanner(System.in);
		int num1, num2 ,num3;
		System.out.println("Number 1:");
		num1= xd.nextInt();
		System.out.println("Number 2:");
		num2= xd.nextInt();
		System.out.println("Number 3:");
		num3= xd.nextInt();
		if(num1>num2) {
			if(num1>num3) {
				System.out.println("mayor :"+num1);
				if(num2<num3) {
					System.out.println("menor :"+num2);				
				}
				else {
					System.out.println("menor :"+num3);	
				}
			}
			else {
				System.out.println("mayor :"+num3);
				System.out.println("menor :"+num2);
			}
		}
		else {
			if(num2>num3){
				System.out.println("mayor :"+num2);
				if(num1<num3){
						System.out.println("menor :"+ num1);
				}
				else {
					System.out.println("menor :"+num3);	
				}
			}
			else {
				System.out.println("mayor :"+num3);
				System.out.println("menor :"+num2);
			}
			}
		}
	}