import java.util.Scanner;

public class DividirPorA {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduzca una palabra: ");
        String palabra= scanner.next();
        
        int posicionaA = palabra.indexOf('a');
        
        
        if(posicionaA != -1) {
        	
        	   int posicionaaA = palabra.indexOf('A');
        	
        } 
        
        if(posicionaA == -1){
        	
        	System.out.println("La palabra no contiene la letra A");
        	
        }
        
        String primeraParte = palabra.substring(0, posicionaA);
        String segundaParte = palabra.substring(posicionaA);
        
        System.out.println("Primera parte: " + primeraParte);
        System.out.println("Segunda parte (desde la A): " + segundaParte);
        
        
        scanner.close();
		
	}

}
