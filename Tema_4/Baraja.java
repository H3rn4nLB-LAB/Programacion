import java.util.Random;

public class Baraja {
	
	public static void main(String[] args) {
		
        Random random = new Random();
		
		int numeroPalo = random.nextInt(4)+1;
		int numeroCarta = random.nextInt(13)+1;
		
		
		 System.out.print("Tu carta al azar es: ");
			
			
			if (numeroCarta == 1) {
			    System.out.print("A (1)");
			} else if (numeroCarta == 11) {
			    System.out.print("J");
			} else if (numeroCarta == 12) {
			    System.out.print("Q");
			} else if (numeroCarta == 13) {
			    System.out.print("K");
			} else {
	          
			    System.out.print(numeroCarta);
			}
			

	        System.out.print(" de ");

		
			if (numeroPalo == 1) {
			    System.out.println("Picas");
			} else if (numeroPalo == 2) {
			    System.out.println("Corazones");
			} else if (numeroPalo == 3) {
			    System.out.println("Diamantes");
			} else if (numeroPalo == 4) {
			    System.out.println("Treboles");
			}
		}

}
