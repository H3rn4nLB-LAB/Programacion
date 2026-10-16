import java.util.Scanner;

public class InsertarMitad {

	public static void main(String[] args) {
		
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Introduzca un texto: ");
         String texto= scanner.next();
         
         int mitad = texto.length()/2;
         
         String primeraMitad = texto.substring(0, mitad);
         String segundaMitad = texto.substring(mitad);
         
         String resultado = primeraMitad+" <> "+segundaMitad;
	    
         System.out.println("El resultado es "+resultado);
         
         scanner.close();

	}

}
