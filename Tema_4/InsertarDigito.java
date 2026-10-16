import java.util.Scanner;

public class InsertarDigito {

	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduzca un numero positivo: ");
        String numeroOriginal = scanner.next();
        
        System.out.println("Introduzca la posicion a partir de la cual quiere partir el número: ");
        int posicion = scanner.nextInt();
        
        System.out.println("Introduzca el dígito que quiera insertar: ");
        int digito = scanner.nextInt();
        
        String primeraParte = numeroOriginal.substring(0, posicion - 1);
        String segundaParte = numeroOriginal.substring(posicion -1);
        
        String numeroResultante = primeraParte + digito + segundaParte;
	    
        System.out.println("El numero resultante es "+numeroResultante+ ".");
        
        scanner.close();

	}

}
