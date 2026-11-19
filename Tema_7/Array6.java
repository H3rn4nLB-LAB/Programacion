import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] numeros = new int[10];

		for (int i = 1; i <= numeros.length; i++) {

			System.out.print("Introduce el numero " + (i + 1) + ": \n");
			numeros[i] = scanner.nextInt();

		}

		System.out.println("Numeros en orden inverso: ");

		for (int i = numeros.length - 1; i >= 0; i--) {

			System.out.print(numeros[i] + " ");

		}
	}
}
