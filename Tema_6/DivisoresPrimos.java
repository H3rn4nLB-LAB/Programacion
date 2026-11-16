import java.util.Scanner;

public class DivisoresPrimos {
	
	public static boolean esPrimo(int num) {
		
		if(num <= 1) {
			
		  return false;
		}
		
		for(int i = 2; i<num; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		
		return true;
		
	}
	
	
	public static int divisoresPrimos(int num) {
		
		if(num < 0) {
			System.out.println("El numero debe ser positivo");
		}
		
		int contador = 0;
		
		for(int i = 2; i<=num; i++) {
			
			if(num%i == 0 && esPrimo(i)) {
				contador++;
			}
			
		}
		
		return contador;
	
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		int numDivisores = scanner.nextInt();
		
		
		System.out.println("El numero tiene: "+divisoresPrimos(numDivisores)+" divisores primos");
	}
	
	

}
