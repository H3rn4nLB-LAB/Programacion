import java.util.Scanner;

public class Randomizador_Suma {
	
     public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num1 = (int) (Math.random()* 100) + 1;
	    int num2 = (int) (Math.random()* 100) + 1;
	    
	    int suma = num1 + num2;
	    
	    System.out.println("¿Cuánto es " + num1 + " + " + num2 + "?");
        System.out.print("Introduce tu respuesta: ");
        
        int respuesta = scanner.nextInt();
        
        if(respuesta == suma) {
        	System.out.println("Respuesta correcta");
        } else {
        	System.out.println("HAS FALLADO.");
        }
        
        scanner.close();
		
	}

}
