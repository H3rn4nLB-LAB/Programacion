import java.util.Scanner;

public class ContadorVocales {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduzca una cadena de caracteres: ");
		String cadena = scanner.nextLine();

		char[] caracteres = cadena.toLowerCase().toCharArray();

		int totalVocales = 0;

		for (int i = 0; i < caracteres.length; i++) {

			if (caracteres[i] == 'a' || caracteres[i] == 'e' || caracteres[i] == 'i' || caracteres[i] == 'o'
					|| caracteres[i] == 'u') {

				totalVocales++;

			}

		}

		System.out.println("En la cadena hay un total de " + totalVocales + " vocales");

	}

}
