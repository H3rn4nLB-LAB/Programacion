package tema5;

import java.util.Scanner;

public class AdivinarNumeros {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int max = 100;
		int min = 0;
		int rango = (max - min) +1;
		int numeroRandom = (int) ((Math.random()*rango)+min);
		
		int numeroUsuario = -1;
	
		while(numeroUsuario != numeroRandom) {
			
		    System.out.print("Se ha generado un numero al azar. Introduce un numero para adivinarlo: ");
		    numeroUsuario = scanner.nextInt();
		    
		    if(numeroUsuario == numeroRandom) {
		    	System.out.println("ENHORABUENA!!!!! HAS ACERTADO");
		    } else if (numeroUsuario > numeroRandom) {
		    	 System.out.println("El numero es menor");
		    } else {
		    	System.out.println("El numero es mayor");
		    }
		       
		}
		
	}
	
}
