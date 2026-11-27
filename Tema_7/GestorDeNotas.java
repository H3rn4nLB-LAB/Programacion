import java.util.Scanner;

public class GestorDeNotas {
	
	private static String[] nombresAlumnos = {
	      "Lucía", "Mateo", "Sofía", "Hugo", "Valeria", 
	      "Daniel", "Martina", "Alejandro", "Ana", "Luis", 
	      "Eva", "Leo", "Noa", "Pol", "Mar", 
	      "Ian","Rocío", "Javier", "Carmen", "Álvaro"
	};
	
	private static double[] notasAlumnos = {
		  7.5, 4.0, 8.2, 3.5, 6.0,
		  9.5, 2.8, 7.0, 5.5, 8.9,
		  4.5, 6.8, 3.0, 9.1, 5.0,
		  7.2, 4.8, 8.0, 6.3, 9.8	
	};
	
	public static int BuscarAlumno() {
		
		Scanner scanner = new Scanner(System.in);
		int indiceNombreBuscado = -1;
		int i = 0;
		
		System.out.print("Introduce el nombre del alumno a buscar: ");
		String nombreBuscar = scanner.nextLine();
		
		while(i < nombresAlumnos.length && indiceNombreBuscado == -1) {
			
			if(nombresAlumnos[i].equals(nombreBuscar)) {
				indiceNombreBuscado = i;
			}
			i++;
		}
		
		if(indiceNombreBuscado == -1) {
			
			System.out.println("El alumno "+nombreBuscar+" no se encuentra");
			return indiceNombreBuscado;
		}
		
		System.out.println("Alumno: "+nombresAlumnos[indiceNombreBuscado]+" | Nota: "+notasAlumnos[indiceNombreBuscado]);
		return indiceNombreBuscado;
	}
	
	public static void ModificarNota() {
		
        Scanner scanner = new Scanner(System.in);
    	int indice = BuscarAlumno();
    	
         if(indice!=-1) {
    	
    		System.out.print("Introduce la nueva nota: ");
    		notasAlumnos[indice] = scanner.nextDouble();
    		
    		System.out.println("Nota actualizada correctamente.");
    	}
		
	}
	
	public static void MediaNotasTotal() {
		
		double suma = 0;
		
		for(int i = 0; i<notasAlumnos.length; i++) {
			
			suma += notasAlumnos[i];
		}
		
		double media = suma/notasAlumnos.length;
		
		System.out.println("La nota media de toda la clase es: "+media);
	}
	
	public static void MediaSuspensos() {
		
		double suma = 0;
		int contadorSuspensos = 0;
		
		for(int i = 0; i < notasAlumnos.length; i++) {
			
			if(notasAlumnos[i] < 5) {
				suma += notasAlumnos[i];
				contadorSuspensos++;
			}
		}
		
		if(contadorSuspensos == 0) {
    		System.out.println("No hay alumnos con nota menor de 5.");
    	} else {
    		double media = suma/contadorSuspensos;
    		System.out.println("La media de los suspensos es: "+media);
    	}
		
	}
	
	public static void MostrarMejorAlumno() {
		
		int indiceMejor = 0;
		
        for(int i = 1; i < notasAlumnos.length; i++) {
			
			if(notasAlumnos[i] > notasAlumnos[indiceMejor]) {
				indiceMejor = i;
			}
		}
        
        System.out.println("El mejor alumno de la clase es "+nombresAlumnos[indiceMejor]+ " con un "+notasAlumnos[indiceMejor]);
		
	}
	
    public static void MostrarPeorAlumno() {
		
		int indicePeor = 0;
		
        for(int i = 1; i < notasAlumnos.length; i++) {
			
			if(notasAlumnos[i] < notasAlumnos[indicePeor]) {
				indicePeor = i;
			}
		}
        
        System.out.println("El peor alumno de la clase es "+nombresAlumnos[indicePeor]+ " con un "+notasAlumnos[indicePeor]);
		
	}
    
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int opcion;
		
		do {
			
			System.out.println("\n--- GESTOR DE NOTAS ---");
			System.out.println("1. Buscar alumno");
			System.out.println("2. Modificar la nota de un alumno");
			System.out.println("3. Media de todas las notas");
			System.out.println("4. Media de los suspensos");
			System.out.println("5. Mostrar alumno con la mejor nota");
			System.out.println("6. Mostrar alumno con la peor nota");
			System.out.println("7. Salir");
			System.out.print("Elige una opcion: ");
			opcion = scanner.nextInt();
			
			switch(opcion) {
			
			   case 1:
			    	BuscarAlumno();
			    	break;
			    	
			    case 2:
			    	ModificarNota();
			    	break;
			    	
			    case 3:
			    	MediaNotasTotal();
			        break;
			        
			    case 4:
			    	MediaSuspensos();
			    	break;
			    	
			    case 5:
			    	MostrarMejorAlumno();
			        break;
			        
			    case 6:
			    	MostrarPeorAlumno();
			    	break;
			    	
			    case 7:	
			    	System.out.println("Saliendo del programa");
			    	break;
			    	
			    default:
			    	System.out.println("Opcion no valida");
			
			}
			
		}while(opcion!=7);

	}

}
