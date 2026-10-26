import java.util.Scanner;

public class Secuencia {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numero;

		boolean es14 = false;

		do {

			System.out.print("Introduce un numero entero (27 para terminar): ");
			numero = scanner.nextInt();

			if (numero == 14) {

				es14 = true;
			}

		} while (numero != 27);

		if (es14) {
			System.out.println("Se ha introducido el 14");
		} else {
			System.out.println("No se ha introducido el 14");
		}

	}

}
