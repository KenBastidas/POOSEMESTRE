package arrayys;

public class EjercicioArrayss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombreCruso;
		//datos que es una amtriz
		int arregloCalif[][]=
			{
					{87,96,70},
					{68,87,90},
					{94,100,90},
					{100,81,82},
					{83,65,85},
					{78,87,65},
					{85,75,83},
					{81,75,83},
					{76,72,84},
					{87,93,73},
			};
		for(int [] fila: arregloCalif)
		{
			for(int z:fila)
			{
				System.out.println(z + " ");
			}
			System.out.println();
		}
		//irmprimri califiacione sy prmedio
		imprimriCalificaciones(arregloCalif);
		//calfiaiciones bajas y altas
		System.out.println("La califiacion mas baja es: " + minima(arregloCalif));
		System.out.println("La califiacion mas alta es: " + maxima(arregloCalif));
		//irmprimri califiacione sy prmedio
		imprimriGraficoBarra(arregloCalif);

	}
	public static void imprimriCalificaciones(int [][] calificaciones)
	{
		System.out.println("Las calificaciones son: ");
		System.out.print("			");
		//creat encabezado
		for(int prueba = 0; prueba< calificaciones[0].length; prueba++)
		{
			System.out.printf("Prueba %d ", prueba +1);
			System.out.println("promedio");
		}
		for(int estudiante = 0; estudiante< calificaciones.length; estudiante++)
		{
			System.out.printf("estudiante %2d ", estudiante +1);
			for(int prueba: calificaciones[estudiante])
			{
				System.out.printf("%8d",prueba);
				//calcular
				double promedio= obtenerPromedio(calificaciones[estudiante]);
				System.out.printf("%9.2f",promedio);
				
			}
			System.out.println();
			
		}
			
	}
	public static double obtenerPromedio(int conjuntoCalificiones[])
	{
		int total=0;
				for(int promedio:conjuntoCalificiones)
					total +=promedio;
				return (double)total/conjuntoCalificiones.length;
		
	}
	public static int minima(int calificaciones[][])
	{
		int califBaja= calificaciones[0][0];
		for(int califEstudiante[]:calificaciones)
		{
			for(int calificacion: califEstudiante)
			{
				if(calificacion<califBaja)
				{
					califBaja=calificacion;
				}
			}
		}
		return califBaja;
	}
	public static int maxima(int calificaciones[][])
	{
		int califAlta= calificaciones[0][0];
		for(int califEstudiante[]:calificaciones)
		{
			for(int calificacion: califEstudiante)
			{
				if(calificacion>califAlta)
				{
					califAlta=calificacion;
				}
			}
		}
		return califAlta;
	}
	public static void imprimriGraficoBarra(int calificaciones[][])
	{
		System.out.println("Distribucion de califiaciones en egenral: ");
		int frecuencia[]=new int[11];
		for(int califEstudiantes[]:calificaciones)
		{
			for(int calificacion:califEstudiantes) {
			++frecuencia[calificacion/10];
			}
			//for(int f:frecuencia)
			//{	}
			for(int cuenta=0; cuenta<frecuencia.length; cuenta++)
			{
				if(cuenta==10)
				{
					System.out.printf("%5d", 100);
				}
				else
				{
					System.out.printf("%02d-%02d: ",cuenta *10, cuenta* 10+9);
				}
				for(int aterisco=0;aterisco<frecuencia[cuenta];aterisco++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}