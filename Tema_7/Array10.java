import java.util.Scanner;

public class Array10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] numeros = new int[10];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce el numero " + (i + 1) + ": ");
			numeros[i] = scanner.nextInt();
		}

		for (int i = 0; i < numeros.length; i++) {

			for (int j = i + 1; j < numeros.length; j++) {

				if (numeros[i] > numeros[j]) {

					int aux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = aux;
				}

			}

		}

		System.out.println("Numeros ordenados de forma ascendente: ");

		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

	}

}
