import java.util.Scanner;

public class Divisibilidad {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero: ");
		int numero = scanner.nextInt();
		
		if(numero % 2 == 0 && numero % 3 == 0) {
			System.out.println("El numero "+numero+ " es divisible por 2 y por 3");
		} else {
			System.out.println("El numero "+numero+ " NO es divisible por 2 y por 3 al mismo tiempo");
		}
	
        if(numero % 2 == 0 || numero % 3 == 0) {
        	System.out.println("El numero "+numero+ " es divisible por 2 o por 3");
        } else {
        	System.out.println("El numero "+numero+ " NO es divisible ni por 2 ni por 3");
        }
		
        if(numero % 2 == 0 ^ numero % 3 == 0 ) {
        	System.out.println("El numero "+numero+ " es divisible por 2 o por 3, pero no por ambos");
        } else {
        	System.out.println("El número " + numero + " NO cumple la condición (o no es divisible por ninguno, o es divisible por ambos).");
        }

		scanner.close();
	}

}
