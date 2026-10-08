import java.util.Scanner;

public class Orden_Numeros {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2, num3;
		
		 System.out.println("--- Programa para ordenar 3 números de menor a mayor ---");
	        
	        System.out.print("Introduce el primer número: ");
	        num1 = scanner.nextInt();
	        
	        System.out.print("Introduce el segundo número: ");
	        num2 = scanner.nextInt();
	        
	        System.out.print("Introduce el tercer número: ");
	        num3 = scanner.nextInt();
		
	        
	        System.out.println("\nLos números ordenados de menor a mayor son: ");
	        
	      
	        if (num1 <= num2 && num1 <= num3) {
	            if (num2 <= num3) {
	                System.out.println(num1 + " <= " + num2 + " <= " + num3);
	            } else {
	                System.out.println(num1 + " <= " + num3 + " <= " + num2);
	            }
	        } else if (num2 <= num1 && num2 <= num3) {
	            if (num1 <= num3) {
	                System.out.println(num2 + " <= " + num1 + " <= " + num3);
	            } else {
	                System.out.println(num2 + " <= " + num3 + " <= " + num1);
	            }
	        } else {
	        
	            if (num1 <= num2) {
	                System.out.println(num3 + " <= " + num1 + " <= " + num2);
	            } else {
	                System.out.println(num3 + " <= " + num2 + " <= " + num1);
	            }
	        }
	        
	  
	       scanner.close();
	}

}
