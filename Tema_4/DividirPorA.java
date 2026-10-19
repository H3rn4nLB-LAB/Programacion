import java.util.Scanner;

public class DividirPorA {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduzca una palabra: ");
        String palabra= scanner.next();
        
        int posicionA = palabra.toLowerCase().indexOf('a');
        
        
        if(posicionA != -1) {
        	
        String primeraParte = palabra.substring(0, posicionA);
        String segundaParte = palabra.substring(posicionA);
        
        System.out.println("Primera parte: " + primeraParte);
        System.out.println("Segunda parte (desde la A): " + segundaParte);
        
        } else {
        	
        	System.out.println("La palabra no contiene la letra A");
        	
        }
        
        scanner.close();
		
	}

}
