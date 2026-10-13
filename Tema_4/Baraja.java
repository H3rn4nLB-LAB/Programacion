import java.util.Random;

public class Baraja {
	
	public static void main(String[] args) {
		
        Random random = new Random();
		
		int numeroPalo = random.nextInt(4)+1;
		int numeroCarta = random.nextInt(13)+1;
		
		
		String palo = "";
		String valorCarta = "";
		
		if (numeroPalo == 1) {
		    palo = "Picas";
		} else if (numeroPalo == 2) {
		    palo = "Corazones";
		} else if (numeroPalo == 3) {
		    palo = "Diamantes";
		} else if (numeroPalo == 4) {
		    palo = "Treboles";
		}
		
		
		if (numeroCarta == 1) {
		    valorCarta = "A (1)";
		} else if (numeroCarta == 11) {
		    valorCarta = "J";
		} else if (numeroCarta == 12) {
		    valorCarta = "Q";
		} else if (numeroCarta == 13) {
		    valorCarta = "K";
		} else {
		    valorCarta = numeroCarta + "";
		}
		
		System.out.println("Tu carta al azar es: " + valorCarta + " de " + palo);
	}

}

