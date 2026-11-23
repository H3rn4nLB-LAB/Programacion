import java.util.Scanner;

public class ContadorMayusculas {
	
	public static int contarMayusculas(String cadena) {
		
        int contador = 0; //Esta variable es un contador para las vocales de la cadena
		
		for(int i = 0; i < cadena.length(); i++) {
			
			// Se saca una sola letra como String (desde i hasta i+1)
			String letra = cadena.substring(i, i+1);
			
			// Si una letra es mayuscula, el contador aumenta
			if(!letra.equals(" ") && letra.equals(letra.toUpperCase())) {
				contador++;
			}
		}
		
		return contador; // Devuelve todas las vocales que se ha contado
		
	}
	
	
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
		
		System.out.print("Escribe una frase o palabra: ");
		String texto = scanner.nextLine();  
		
		// Creo una variable para que guarde el numero de mayusculas contadas en el metodo contarMayusculas
		int totalMayusculas = contarMayusculas(texto); 
		
		System.out.println("Total de mayusculas: "+totalMayusculas);

	}

}
