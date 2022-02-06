package bastidasExamenfinal;

import java.util.Scanner;
import java.util.Stack;
import java.util.Iterator;
public class AppParticipante {
	public static void main(String[] args) {
		int op =0;
		int op2 =0;
		Stack<Participante> Partione = new Stack<Participante>();
		Stack<Participante> Partitwo = new Stack<Participante>();
		Participante ingresoparticipante;
		Scanner reader = new Scanner(System.in);
		int num, ageold,npart=0;
		String nom,lastnom; 
		double bestMk2, bestMk1, bestMk0;
		do {
			System.out.println("Menu principal");
			System.out.println("1.Añadir pariticpante");
			System.out.println("2.Mostrar listados de datos(listado por numero)");
			System.out.println("3.Mostrar listados por marcas");
			System.out.println("4.Finalizar");
			op= reader.nextInt();
			switch(op) {
			case 1:
				if(npart<=10) {
					System.out.println("Ingrese numero");
					num= reader.nextInt();
					System.out.println("Ingrese nombre");
					nom= reader.next();
					System.out.println("Ingrese apellido");
					lastnom= reader.next();
					System.out.println("Ingrese edad");
					ageold= reader.nextInt();
					System.out.println("Ingrese Mejor_Marca2002");
					bestMk2= reader.nextDouble();
					System.out.println("Ingrese Mejor_Marca2001");
					bestMk1= reader.nextDouble();
					System.out.println("Ingrese Mejor_Marca2000");
					bestMk0= reader.nextDouble();
					ingresoparticipante= new Participante(num, nom, lastnom,ageold, bestMk2, bestMk1, bestMk0);
					Partione.push(ingresoparticipante);
					npart++;
				}
				else {
					System.out.println("Plazas llenadas");
				}
				break;
			case 2:
				if(!Partione.isEmpty()) {
		            Iterator<Participante> a = Partione.iterator();
		            Stack<Participante> guardando = ordenxnumber(Partione);
		            while(!guardando.isEmpty()) {
		                Partitwo.push(guardando.pop());
		            }
		            while(!Partitwo.isEmpty()) {
		            	Partione.push(Partitwo.pop());
		            }
		            System.out.println("Patircipante por numero: ");
		            a = Partione.iterator();
		              while(a.hasNext()){
		                   System.out.println(a.next().mostrar());
		              }
		        }
				else
				{
		            System.out.println("Participantes vacios");
		        }
				break;
			case 3:
				if(!Partione.isEmpty()) {
		            Iterator<Participante> a = Partione.iterator();
		            Stack<Participante> guardando = orderxmak(Partione);
		            while(!guardando.isEmpty()) {
		                Partitwo.push(guardando.pop());
		            }
		            while(!Partitwo.isEmpty()) {
		            	Partione.push(Partitwo.pop());
		            }
		            System.out.println("Patircipante por mark: ");
		            a = Partione.iterator();
		              while(a.hasNext()){
		                   System.out.println(a.next().mostrar());
		              }
		        }
				else
				{
		            System.out.println("Marks vacias");
		        }
				break;
			case 4: 
				System.out.println("Finalizado");
			}	
			System.out.println("Desea volver");
			System.out.println("1:Regresar");
			System.out.println("2:Salir");
			op2=reader.nextInt();
			}while(op2==1);
		System.out.println("Cerrado");
	}
	public static Stack<Participante> ordenxnumber(Stack<Participante> stack) {
      Stack<Participante> numerosordenados = new Stack<Participante>();
      while (!stack.isEmpty()) {
	      Participante tmp = stack.pop();
	      while(!numerosordenados.isEmpty() && numerosordenados.peek().getNumero() > tmp.getNumero()) {
	        stack.push(numerosordenados.pop());
	      }
	      numerosordenados.push(tmp);
      }
      return numerosordenados;
    }
	 public static Stack<Participante> orderxmak(Stack<Participante> stack) {
		 Stack<Participante> ordenandoxmark = new Stack<Participante>();
		 while (!stack.isEmpty()) {
			 Participante tmp = stack.pop();
			 while (!ordenandoxmark.isEmpty() && ordenandoxmark.peek().getMejor_Marca2002() < tmp.getMejor_Marca2002()) {
    		 stack.push(ordenandoxmark.pop());
			 }
			 ordenandoxmark.push(tmp);
         }
         return ordenandoxmark;
     }
}