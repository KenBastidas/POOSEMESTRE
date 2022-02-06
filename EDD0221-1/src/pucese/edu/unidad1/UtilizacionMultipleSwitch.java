package pucese.edu.unidad1;

public class UtilizacionMultipleSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Switch se utilzia cuando existen varias condciones u opciones apra una condicion
		
		//ejericico
		//Seleccionar un diad e la semana de acuerdoa  un numero
		char diaSemana='4';
		switch(diaSemana)
		{
		case '1': System.out.println("lunes");
			break;
		case '2': System.out.println("martes");
		break;
		case '3': System.out.println("miercoles");
		break;
		case '4': System.out.println("jueves");
		break;
		case '5': System.out.println("viernes");
		break;
		case '6': System.out.println("sabado");
		break;
		case '7': System.out.println("domingo");
		break;
		}
	

	}

}
