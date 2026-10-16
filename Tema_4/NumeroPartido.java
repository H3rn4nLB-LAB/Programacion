import java.util.Scanner;

public class NumeroPartido {

	public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Introduzca un numero positivo: ");
         String numero = scanner.nextLine();
         
         System.out.println("Introduzca la posicion a partir de la cual quiere partir el número: ");
         int posicion = scanner.nextInt();
         
         String primeraParte = numero.substring(0, posicion - 1);
         String segundaParte = numero.substring(posicion -1);
	    
         System.out.println("Los numeros partidos son el "+primeraParte+" y el "+segundaParte);
         
         scanner.close();
	}

}
