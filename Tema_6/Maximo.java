import java.util.Scanner;

public class Maximo {

	public static int max(int a, int b) {

		if (a > b) {

			return a;

		} else {

			return b;

		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce primer numero: ");
		int x = scanner.nextInt();

		System.out.print("Introduce segundo numero: ");
		int y = scanner.nextInt();

		int resultado = max(x, y);

		System.out.print("El mayor de los dos numeros es " + resultado);

	}

}

