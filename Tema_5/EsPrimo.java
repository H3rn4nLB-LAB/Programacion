import java.util.Scanner;

public class EsPrimo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numero = 0;

		do {
			System.out.print("Introduce un numero entero mayor que 1: ");
			numero = scanner.nextInt();

		} while (numero < 1);

		boolean esPrimo = true;

		for (int i = 2; i * i <= numero; i++) {

			if (numero % i == 0) {
				esPrimo = false;
			}

		}

		if (esPrimo) {
			System.out.println("El numero es primo");
		} else {
			System.out.println("El numero NO es primo");
		}
	}

}
