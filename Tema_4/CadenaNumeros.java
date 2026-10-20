import java.util.Scanner;

public class CadenaNumeros {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Introduza un numero (de 2 a 7 digitos): ");
    	String numero = scanner.nextLine();
    	
    	if(numero.length() < 2){
                  
    		System.out.println("El numero es muy corto");
    		
    	} else if (numero.length() > 7) {
    		
    		System.out.println("El numero es muy largo");
    		
    	} 
    	
    	boolean soloDigitos = true;

    	for(int i = 0; i < numero.length(); i++) {
    		
    		char caracter = numero.charAt(i);
    		
    		if(caracter < '0' || caracter > '9') {
    			soloDigitos = false;
    		}
    		
    	}
    	
    	if(soloDigitos) {
    		System.out.println("El numero es valido");
    	} else {
    		System.out.println("Error: el numero contiene elementos distintos");
    	}
    	
	}

}
