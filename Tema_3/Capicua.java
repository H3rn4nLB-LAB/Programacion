import java.util.Scanner;

public class Capicua {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un numero (hasta 5 cifras): ");
		
		int numeroOriginal = scanner.nextInt();
		
		if(numeroOriginal <= 0 || numeroOriginal > 99999) {
			System.out.println("Error: El numero no puede ser negativo y debe tener un maximo de 5 cifras");
		}
		
		int n = numeroOriginal;
		int inverso = 0;
		
        while(n > 0) {
        	inverso = inverso*10 + n % 10;
        	n = n/10;
        } 
        
        if(numeroOriginal == inverso) {
        	System.out.println("El numero "+numeroOriginal+ " es capicua");
        }else {
        	System.out.println("El numero "+numeroOriginal+ " NO es capicua");
        }
        
        scanner.close();
	}

}
