package pucese.edu.unidad1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class UtilizacionifSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a partir de la nota del alumno ver si aprueba o  no
		
		//byte nota= 8;
		//String tareaEntregada ="S";
		//condition si la nota es mayor a 5 y si fue entregada
		//esta aprobada, sino no esta aprobado
	        //a partir de la nota entregada del alumno ver si aprueba o no     
	        byte nota=0;
	        String tareaEntregada ="S";
	        BufferedReader bufferdReader=new BufferedReader(new InputStreamReader(System.in));
	        
	        try {
	            System.out.print("Introduzca una nota : ");
	            nota=(byte)Integer.parseInt(bufferdReader.readLine());//conersion de string a byte
	            System.out.print("Se entregado la tarea S/N: ");
	            tareaEntregada=bufferdReader.readLine();
	            
	            
	        
	        //condicion si la nota es mayor a 5 y si fue entregada esta aprobad, sino no esta aprobado
	        
	        if(nota>3 && (tareaEntregada.charAt(0)=='S') || (tareaEntregada.charAt(0)=='S')    ) {
	            System.out.println("Aprobado");
	        }
	        else {
	            System.out.println("Reprobado");
	        }
	        }catch (Exception e) {
	        System.out.println(e.getMessage());
	        
	    
	    }	    
	}

	}


